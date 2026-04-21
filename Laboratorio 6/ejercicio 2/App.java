package empresaTransporte;

public class App {
	public static void main(String[] args) {
		 
		 Carro carro = new Carro("123RSX", "mazda",120, 4);
		 Moto moto1 = new Moto("435DER", "KTM", 150 , "electrica");
		 Moto moto2 = new Moto("768QWS", "honda", 130, "deportiva");
		 Camion camion = new Camion("908MNB", "BMW", 100, 3);
		 
		 carro.calcularPeaje();
		 carro.mover();
		 moto1.calcularPeaje();
		 moto1.mover();
		 moto2.calcularPeaje();
		 moto2.mover();
		 camion.calcularPeaje();
		 camion.mover();
	}
}
