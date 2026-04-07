package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int identificacion;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estadoActual;
    private List<Examen> listaExamenes;
    private List<Tratamiento> historialTratamientos;

    // Constructor
    public Paciente(int identificacion, String nombre, int edad, String genero,
                    String tipoCancer, String etapa) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.listaExamenes = new ArrayList<>();
        this.historialTratamientos = new ArrayList<>();
    }

    // Getters y Setters
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public void setTipoCancer(String tipoCancer) {
        this.tipoCancer = tipoCancer;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public List<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(List<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    public List<Tratamiento> getHistorialTratamientos() {
        return historialTratamientos;
    }

    public void setHistorialTratamientos(List<Tratamiento> historialTratamientos) {
        this.historialTratamientos = historialTratamientos;
    }

    public void agregarExamen(Examen examen) {
        this.listaExamenes.add(examen);
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        this.historialTratamientos.add(tratamiento);
    }
    
    public void estaditoActual(String estado, Paciente paciente) {
    	paciente.setEstadoActual(estado);
    
    }

    // toString
    @Override
    public String toString() {
        return "Paciente" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", tipoCancer='" + tipoCancer + '\'' +
                ", etapa='" + etapa + '\'' +
                ", estadoActual='" + estadoActual + '\'' +
                ", listaExamenes=" + listaExamenes +
                ", historialTratamientos=" + historialTratamientos
               ;
    }
}