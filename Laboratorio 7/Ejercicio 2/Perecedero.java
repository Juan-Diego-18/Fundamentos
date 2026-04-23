package productos;

public class Perecedero extends Producto {

    private int diasACaducar;

    public Perecedero(int codigo, String descripcion, double precio, int diasACaducar) {
        super(codigo, descripcion, precio);
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcularPrecioVenta() {

        if (diasACaducar == 1) {
            return precio / 4;
        } else if (diasACaducar == 2) {
            return precio / 3;
        } else if (diasACaducar == 3) {
            return precio / 2;
        } else {
            return precio;
        }
    }

    @Override
    public String toString() {
        return "Perecedero, " + codigo + ", " + descripcion + ", " + precio + ", " + diasACaducar;
    }
}