package nomina;

public abstract class Empleado {
	protected int identificacion;
	protected String nombre;
	protected int edad;
	protected int añoIngreso;
	protected int salarioBasico;
	protected double descuento = 0;
	protected double netoPagado = 0;
	
	public Empleado(int identificacion, String nombre, int edad, int añoIngreso, int salarioBasico) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.añoIngreso = añoIngreso;
		this.salarioBasico = salarioBasico;
	}

	
	public abstract double calcularPagoMensual();
	@Override
	public abstract String toString() ;
	
	

	
	
	
	
}
