public class Main {
    public static void main(String[] args) {
        // Crear empleados de ejemplo
        Empleado empleado1 = new Empleado("Manuela", "Ballen", "1094", 26, true);
        Empleado empleado2 = new Empleado("Kenia", "Morales", "4867", 23, false);

        // Crear la nómina y agregar empleados
        Nomina nomina = new Nomina();
        nomina.agregarEmpleado(empleado1);
        nomina.agregarEmpleado(empleado2);

        // Liquidar la nómina
        nomina.liquidarNomina();
    }
}
