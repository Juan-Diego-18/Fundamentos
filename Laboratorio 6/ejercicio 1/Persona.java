package institucionEducativa;

public class Persona {
	protected int id;
	protected String nombre;
	protected int edad;
	
	
	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarInformacion() {
		System.out.println("Id: " + this.id + ", Nombre: " + this.nombre + ", Edad: " + this.edad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void calcularSalario() {}
}
