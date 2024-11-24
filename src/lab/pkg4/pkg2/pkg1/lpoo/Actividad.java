
package lab.pkg4.pkg2.pkg1.lpoo;

public class Actividad {
    private String nombre;
    private int duracion; // En días
    private String descripcion;

    public Actividad(String nombre, int duracion, String descripcion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }
}
