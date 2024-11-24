
package lab.pkg4.pkg2.pkg1.lpoo;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
    private String titulo;
    private String fechaInicio;
    private String fechaFin;
    private List<Actividad> actividades;

    public Itinerario(String titulo, String fechaInicio, String fechaFin) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.actividades = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        if (validarDatosActividad(actividad)) {
            actividades.add(actividad);
        } else {
            System.out.println("Actividad inválida. No se agregó.");
        }
    }

    public int calcularDuracionTotal() {
        int totalDuracion = 0;
        for (Actividad actividad : actividades) {
            totalDuracion += actividad.getDuracion();
        }
        return totalDuracion;
    }

    public String obtenerResumen() {
        return "Itinerario: " + titulo + ", Total de días: " + calcularDuracionTotal();
    }

    private boolean validarDatosActividad(Actividad actividad) {
        return actividad != null && actividad.getDuracion() > 0;
    }
}
