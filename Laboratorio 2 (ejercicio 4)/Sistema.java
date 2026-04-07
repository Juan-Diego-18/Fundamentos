package concesionario;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Venta> listaVenta = new ArrayList<>();
    private List<Auto> listaAuto = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void registrarAuto(Auto auto) {
        listaAuto.add(auto);
    }

    public void registrarVenta(Venta venta) {
        listaVenta.add(venta);
    }

    public List<Auto> buscarAutoMarca(String marca) {
        List<Auto> autosEncontrados = new ArrayList<>();
        for (Auto auto : listaAuto) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<Auto> buscarAutoModelo(String modelo) {
        List<Auto> autosEncontrados = new ArrayList<>();
        for (Auto auto : listaAuto) {
            if (auto.getModelo() == modelo) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public List<Auto> buscarAutoPrecio(int precio) {
        List<Auto> autosEncontrados = new ArrayList<>();
        for (Auto auto : listaAuto) {
            if (auto.getPrecio() <= precio) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    public String generarInformeVentaEmpleado(Empleado empleado) {
        int totalVentas = 0;
        for (Venta venta : listaVenta) {
            if (venta.getEmpleado().equals(empleado)) {
                totalVentas++;
            }
        }
        return "El empleado " + empleado.getNombre() + " vendió " + totalVentas + " autos.";
    }

    public String generarInformeVentaMarca(String marca) {
        int totalVentas = 0;
        for (Venta venta : listaVenta) {
            if (venta.getAuto().getMarca().equalsIgnoreCase(marca)) {
                totalVentas++;
            }
        }
        return "Se vendieron " + totalVentas + " autos de la marca " + marca + ".";
    }

    public String generarInformeVentaModelo(String modelo) {
        int totalVentas = 0;
        for (Venta venta : listaVenta) {
            if (venta.getAuto().getModelo() == modelo) {
                totalVentas++;
            }
        }
        return "Se vendieron " + totalVentas + " autos del modelo " + modelo + ".";
    }
}