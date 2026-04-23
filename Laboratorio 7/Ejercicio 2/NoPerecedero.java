package productos;

public class NoPerecedero extends Producto {

    private char tipo;

    public NoPerecedero(int codigo, String descripcion, double precio, char tipo) {
        super(codigo, descripcion, precio);
        validarTipo(tipo);
    }

    private void validarTipo(char tipo) {
        if (tipo == 'A' || tipo == 'B' || tipo == 'C') {
            this.tipo = tipo;
        } else {
            this.tipo = 'B';
        }
    }

    @Override
    public double calcularPrecioVenta() {
        if (tipo == 'A') {
            return precio * 1.03;
        } else if (tipo == 'B') {
            return precio * 1.02;
        } else { 
            return precio * 1.015;
        }
    }

    @Override
    public String toString() {
        return "No Perecedero, " + codigo + ", " + descripcion + ", " + precio + ", " + tipo;
    }
}