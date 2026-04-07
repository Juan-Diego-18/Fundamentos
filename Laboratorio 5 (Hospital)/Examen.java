package hospital;

public class Examen {

    private int identificacion;
    private String fechaExamen;
    private String tipoExamen;
    private String resultado;

    // Constructor
    public Examen(int identificacion, String tipoExamen, String resultado) {
        this.identificacion = identificacion;
        this.tipoExamen = tipoExamen;
        this.resultado = resultado;
    }

    // Getters y Setters
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(String fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    // toString
    @Override
    public String toString() {
        return "Examen" +
                "identificacion=" + identificacion +
                ", fechaExamen='" + fechaExamen + '\'' +
                ", tipoExamen='" + tipoExamen + '\'' +
                ", resultado='" + resultado + '\'' 
               ;
    }
}