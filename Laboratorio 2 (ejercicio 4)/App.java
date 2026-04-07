package concesionario;

public class App {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Crear algunos autos
        Auto auto1 = new Auto(1, "Toyota", "Hilux", 2021, "Rojo", 30000, 10000);
        Auto auto2 = new Auto(2, "Honda", "crv", 2020, "Azul", 25000, 12000);
        Auto auto3 = new Auto(3, "Toyota", "Corolla", 2022, "Negro", 35000, 8000);

        // Crear algunos empleados
        Empleado empleado1 = new Empleado(1, "Juan Perez", "Calle Ficticia 123", 123456789, "Vendedor");
        Empleado empleado2 = new Empleado(2, "Maria Lopez", "Calle Imaginaria 456", 987654321, "Vendedor");

        // Crear algunos clientes
        Cliente cliente1 = new Cliente(1, "Carlos Garcia", "Calle Principal 789", 555123456, "carlos@email.com");
        Cliente cliente2 = new Cliente(2, "Lucia Ruiz", "Calle Secundaria 101", 555987654, "lucia@email.com");

        // Registrar autos, clientes y empleados
        sistema.registrarAuto(auto1);
        sistema.registrarAuto(auto2);
        sistema.registrarAuto(auto3);

        sistema.registrarCliente(cliente1);
        sistema.registrarCliente(cliente2);

        sistema.registrarVenta(new Venta(auto1, cliente1, empleado1, 30000));
        sistema.registrarVenta(new Venta(auto2, cliente2, empleado2, 25000));
        sistema.registrarVenta(new Venta(auto3, cliente1, empleado1, 35000));

        // Buscar autos
        System.out.println("Autos de marca Toyota: " + sistema.buscarAutoMarca("Toyota"));
        System.out.println("Autos de modelo crv: " + sistema.buscarAutoModelo("crv"));
        System.out.println("Autos con precio <= 30000: " + sistema.buscarAutoPrecio(30000));

        // Generar informes
        System.out.println(sistema.generarInformeVentaEmpleado(empleado1));
        System.out.println(sistema.generarInformeVentaMarca("Toyota"));
        System.out.println(sistema.generarInformeVentaModelo("crv"));
    }
}