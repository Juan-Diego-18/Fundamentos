package empresaTransporte;

public class Carro extends Vehiculo {
	private int numPuertas;


	public Carro(String placa, String marca, int velocidadMaxima, int numPuertas) {
		super(placa, marca, velocidadMaxima, 10000);
		this.numPuertas = numPuertas;
	}

	@Override
	public void calcularPeaje() {
		System.out.println("La tarifa fija de peaje de los carro es de " + tarifaPeaje + "\n");	
	}
	
	@Override
	public void mover() {
		System.out.println("el carro marca: " + marca + ", con placa: "
				+ placa + ", el cual tiene " + numPuertas + "puertas, avanza con normalidad por su carril\n");
	}
}
