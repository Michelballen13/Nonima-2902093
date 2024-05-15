import java.util.ArrayList;

class Nomina{
    private ArrayList<Empleado> empleados;

    public Nomina() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void liquidarNomina() {
        for (Empleado empleado : empleados) {
            double totalDevengos = calcularDevengos(empleado);
            double totalDescuentos = calcularDescuentos(empleado);
            double salarioNeto = totalDevengos - totalDescuentos;

            System.out.println("Nombre: " + empleado.getNombres() + " " + empleado.getApellidos());
            System.out.println("Documento: " + empleado.getDocumento());
            System.out.println("Total bruto: " + totalDevengos);
            System.out.println("Total descuentos: " + totalDescuentos);
            System.out.println("Valor neto a pagar: " + salarioNeto);
            System.out.println();
        }
    }

    private double calcularDevengos(Empleado empleado) {
        double salarioBasico = 100; // Ejemplo de salario básico
        double auxilioTransporte = 50; // Valor del auxilio de transporte para 2024 en Colombia
        double devengos = salarioBasico;

        if (empleado.tieneSubsidioTransporte() && empleado.getDiasTrabajados() > 15) {
            devengos += auxilioTransporte;
        }

        return devengos;
    }

    private double calcularDescuentos(Empleado empleado) {
        double salud = 0.04; // Porcentaje de descuento para salud
        double pension = 0.04; // Porcentaje de descuento para pensión
        double descuentos = calcularDevengos(empleado) * (salud + pension);

        return descuentos;
    }
}