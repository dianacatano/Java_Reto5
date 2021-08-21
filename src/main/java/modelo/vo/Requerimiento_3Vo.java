package modelo.vo;

public class Requerimiento_3Vo {
    // Su código
    // Proyecto p: p.ID_Proyecto, mc.Nombre_Material
    private int idProyecto;
    private String nombreMaterial;

    public Requerimiento_3Vo() {
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    @Override
    public String toString() {
        return idProyecto + " " + nombreMaterial;
    }

}
