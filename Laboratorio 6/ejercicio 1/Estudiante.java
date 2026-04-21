package institucionEducativa;

public class Estudiante extends Persona {
 
	private int codigo;

	public Estudiante(int id, String nombre, int edad, int codigo) {
		super(id, nombre, edad);
		this.codigo = codigo;
	}
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println(", Codigo: " + this.codigo);
	}
}
