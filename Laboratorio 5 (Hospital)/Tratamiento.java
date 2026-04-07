package hospital;

public class Tratamiento {

    private int identificacion;
    private String nombre;
    private int duracion;
    private String efectosSecundarios;

    // Constructor
    public Tratamiento(int identificacion, String nombre, int duracion, String efectosSecundarios) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.duracion = duracion;
        this.efectosSecundarios = efectosSecundarios;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    // Método calcularEficacia
    public int calcularEficacia() {
        if (duracion <= 30) {
            return 70;
        } else if (duracion <= 90) {
            return 85;
        } else {
            return 95;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Tratamiento" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", efectosSecundarios='" + efectosSecundarios + '\''
                ;
    }
}