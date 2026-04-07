package concesionario;

import java.time.LocalDate;

public class Venta {
    private Auto auto;
    private Cliente cliente;
    private LocalDate fecha;
    private int precioFinal;
    private Empleado empleado;

    public Venta(Auto auto, Cliente cliente, Empleado empleado, int precioFinal) {
        this.auto = auto;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precioFinal = precioFinal;
        this.fecha = LocalDate.now();  
    }

    public String toString() {
        return "Venta: auto=" + auto + ", cliente=" + cliente + ", fecha=" + fecha + ", precioFinal=" + precioFinal
               + ", empleado=" + empleado;
    }

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
    
}