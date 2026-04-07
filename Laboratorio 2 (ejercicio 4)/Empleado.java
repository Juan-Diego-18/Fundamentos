package concesionario;

public class Empleado {
    private int numeroIdentificacion;
    private String nombre;
    private String direccion;
    private int numeroTelefono;
    private String puesto;

    public Empleado(int numeroIdentificacion, String nombre, String direccion, int numeroTelefono, String puesto) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.puesto = puesto;
    }

    public String toString() {
        return "Empleado: numeroIdentificacion=" + numeroIdentificacion + ", nombre=" + nombre + ", direccion=" + direccion 
               + ", numeroTelefono=" + numeroTelefono + ", puesto=" + puesto;
    }

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
    
}