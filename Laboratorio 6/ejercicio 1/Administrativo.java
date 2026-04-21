package institucionEducativa;

public class Administrativo extends Persona {
	private String cargo;
	private String dependencia;
	private int salarioFijo;
	
	public Administrativo(int id, String nombre, int edad, String cargo, String dependencia, int salarioFijo) {
		super(id, nombre, edad);
		this.cargo = cargo;
		this.dependencia = dependencia;
		this.salarioFijo = salarioFijo;
	} 
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println(", Cargo: " + this.cargo + 
				", Dependencia: " + this.dependencia + 
				", Salario fijo: " + this.salarioFijo);
		
	}
	@Override
	public void calcularSalario() {
		double salario = salarioFijo - ((salarioFijo * 12) / 100);
		
		System.out.println("El salario que se le debe pagar a el administrativo: " + nombre + " es: " + salario);
	}
}
