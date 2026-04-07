package concesionario;

public class Cliente {
    private int numeroIdentificacion;
    private String nombre;
    private String direccion;
    private int numeroTelefono;
    private String email;

    public Cliente(int numeroIdentificacion, String nombre, String direccion, int numeroTelefono, String email) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String toString() {
        return "Cliente: numeroIdentificacion=" + numeroIdentificacion + ", nombre=" + nombre + ", direccion=" + direccion 
               + ", numeroTelefono=" + numeroTelefono + ", email=" + email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}