package empresaTransporte;

public class Vehiculo {

	protected String placa;
	protected String marca;
	protected int velocidadMaxima;
	protected final int tarifaPeaje;
		
	public Vehiculo(String placa, String marca, int velocidadMaxima, int tarifaPeaje) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.tarifaPeaje = tarifaPeaje;
	}
	public void calcularPeaje() {}
	public void mover() {}
}
