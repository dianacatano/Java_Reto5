package modelo.vo;

public class Requerimiento_2Vo {
    // Su código
    // Proyecto p: p.ID_Proyecto, c.Proveedor
    private int idProyecto;
    private String proveedor;

    public Requerimiento_2Vo() {
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return idProyecto + " " + proveedor;
    }
}
