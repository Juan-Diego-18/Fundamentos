package nomina;

public class Repartidor extends Empleado {
    private int cantidadRepartos;
    private char zona;
    private static final int VALOR_REPARTO = 10000;
    private static final int BONIFICACION = 50000;

    public Repartidor(int identificacion, String nombre, int edad, int añoIngreso, int salarioBasico,
			int cantidadRepartos, char zona) {
		super(identificacion, nombre, edad, añoIngreso, salarioBasico);
		this.cantidadRepartos = cantidadRepartos;
		asignarZona(zona);
	}

    private void asignarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            this.zona = zona;
        } else {
            this.zona = 'C'; 
        }
    }

    
    
    @Override
    public double calcularPagoMensual() {
    	double pagoRepartos = cantidadRepartos * VALOR_REPARTO;
        double pagoBruto = salarioBasico + pagoRepartos;
        descuento = pagoBruto * 0.10;
        netoPagado = pagoBruto - descuento;
        if (2026 - añoIngreso >= 5 && zona == 'C') {
            netoPagado += BONIFICACION;
        }
        return netoPagado;
    }
    
    @Override
    public String toString() {
        double valorRepartos = cantidadRepartos * VALOR_REPARTO;
        

        return "Repartidor [Identificacion= " + identificacion + ", Nombre= "
		+ nombre + ", añoIngreso= " + añoIngreso + ", Salario basico= "
		+ salarioBasico + ", Numero total de repartos= " + cantidadRepartos 
		+ ", Valor pagado repartos= " + valorRepartos + ", Descuentos= " + descuento 
		+ ", Pago neto= " + netoPagado +  "]";
    }
 
    
    
}
