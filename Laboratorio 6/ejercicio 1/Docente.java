package institucionEducativa;

public class Docente extends Persona {
	private String especialidad;
	private int numHorasCatedra;
	private int valorHoraCatedra;
	
	
	
	public Docente(int id, String nombre, int edad, String especialidad, int numHorasCatedra, int valorHoraCatedra) {
		super(id, nombre, edad);
		this.especialidad = especialidad;
		this.numHorasCatedra = numHorasCatedra;
		this.valorHoraCatedra = valorHoraCatedra;
	}
	
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println(", Especialidad: " + this.especialidad
				+ ", Numero de horas de catedra: " + this.numHorasCatedra
				+ ", Valor por hora de catedra: " + this.valorHoraCatedra);
	}
	@Override
	public void calcularSalario() {
		double salario = (numHorasCatedra * valorHoraCatedra);
		salario = salario - ((salario * 12)/100);
		System.out.println("El salario que se le debe pagar a el docente: " + nombre + " es: " + salario);
	
	}
}
