package productos;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Perecedero(1, "Leche", 2000, 1));
        productos.add(new Perecedero(2, "Pan", 1500, 2));
        productos.add(new Perecedero(3, "Carne", 5000, 4));

        productos.add(new NoPerecedero(4, "Arroz", 3000, 'A'));
        productos.add(new NoPerecedero(5, "Lentejas", 2500, 'B'));
        productos.add(new NoPerecedero(6, "Frijoles", 2800, 'c'));

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        for (Producto producto : productos) {
            System.out.println(producto + ", " + producto.calcularPrecioVenta());
        }
    }
}