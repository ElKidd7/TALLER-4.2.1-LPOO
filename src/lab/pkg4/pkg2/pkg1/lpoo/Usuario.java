
package lab.pkg4.pkg2.pkg1.lpoo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private List<Itinerario> itinerarios;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.itinerarios = new ArrayList<>();
    }

    public void crearItinerario(String titulo, String fechaInicio, String fechaFin) {
        Itinerario itinerario = new Itinerario(titulo, fechaInicio, fechaFin);
        itinerarios.add(itinerario);
    }

    public List<Itinerario> verItinerarios() {
        return itinerarios;
    }

    public void calificarActividad(Actividad actividad, int calificacion) {
        System.out.println("Calificando actividad: " + actividad.getDescripcion() + " con " + calificacion + " estrellas.");
    }
}
