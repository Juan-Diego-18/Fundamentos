package nomina;

public class Vendedor extends Empleado{
	private static final int BONIFICACION = 100000;
	private int valorTotalVentas;

	public Vendedor(int identificacion, String nombre, int edad, int añoIngreso, int salarioBasico,
			int valorTotalVentas) {
		super(identificacion, nombre, edad, añoIngreso, salarioBasico);
		this.valorTotalVentas = valorTotalVentas;
	}
	

	@Override
	public double calcularPagoMensual() {
		double valorComision = valorTotalVentas * 0.15;
		double pagoBruto = salarioBasico + valorComision;
		 descuento = pagoBruto * 0.10;
		 netoPagado = pagoBruto - descuento;
		if (2026 - añoIngreso > 20 ) {
			netoPagado += BONIFICACION;
		}
		
			return netoPagado;		
	}
	
	@Override
	public String toString() {
		double valorComision = valorTotalVentas * 0.15;
		
		return "Vendedor [Identificacion= " + identificacion + ", Nombre= "
				+ nombre + ", añoIngreso= " + añoIngreso + ", Salario basico= "
				+ salarioBasico + ", Valor total de comisiones= " + valorComision 
				+ ", Descuentos= " + descuento + ", Pago neto= " + netoPagado + "]";
	}

	
	
	
}
