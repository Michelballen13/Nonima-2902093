import java.util.ArrayList;

class Empleado {
    private String nombres;
    private String apellidos;
    private String documento;
    private int diasTrabajados;
    private boolean subsidioTransporte;

    public Empleado(String nombres, String apellidos, String documento, int diasTrabajados, boolean subsidioTransporte) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.diasTrabajados = diasTrabajados;
        this.subsidioTransporte = subsidioTransporte;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public boolean tieneSubsidioTransporte() {
        return subsidioTransporte;
    }
}
