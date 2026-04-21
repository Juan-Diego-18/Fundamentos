package empresaTransporte;

public class Camion extends Vehiculo{
	private int capacidadCarga;

	public Camion(String placa, String marca, int velocidadMaxima, int capacidadCarga) {
		super(placa, marca, velocidadMaxima, 12000);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	@Override
	public void calcularPeaje() {
		int tarifa = tarifaPeaje * capacidadCarga;
		System.out.println("La tarifa a pagar de este camion con capacidad para cargar "
				+ capacidadCarga + " toneladas, es de: "+ tarifa + "\n");
	}
	
	@Override
	public void mover() {
		System.out.println("Este camion con capacidad para cargar "
					+	capacidadCarga +" toneladas, se mueve con precaucion\n");
	}
	
}
