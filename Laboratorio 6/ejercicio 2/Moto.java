package empresaTransporte;

public class Moto extends Vehiculo {
	private String tipo;

	public Moto(String placa, String marca, int velocidadMaxima, String tipo) {
		super(placa, marca, velocidadMaxima, 5000);
		this.tipo = tipo;
	}

	@Override
	public void calcularPeaje() {
		if(tipo == "electrica")
			System.out.println("La tarija del peaje a pagar de las motos electricas es de 0, es gratis\n " );
		else {
			System.out.println("La tarifa fija del peaje de las motos es de: "
					+ tarifaPeaje + "\n");
		}
	}
	
	@Override
	public void mover() {
		if(tipo == "electrica")
			System.out.println("La moto electrica se mueve de manera tranquila por la via " );
		else {
			System.out.println("La moto tipo: " + tipo + " , se mueve de manera tranquila por la via\n");
					
		}
	}
	
}
