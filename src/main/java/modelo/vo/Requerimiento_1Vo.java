package modelo.vo;

public class Requerimiento_1Vo {
    // Lider: Ciudad_Residencia, AVG(Salario) as Promedio
    private String ciudadResidencia;
    private double promedio;

    public Requerimiento_1Vo() {
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return ciudadResidencia + " " + promedio;
    }
}
