package nomina;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Vendedor(1, "Ana", 30, 2018, 1200000, 5000000));
        empleados.add(new Vendedor(2, "Luis", 28, 2000, 1100000, 3000000));
        empleados.add(new Vendedor(3, "Carlos", 35, 2015, 1500000, 7000000));

        empleados.add(new Repartidor(4, "Pedro", 40, 2017, 1000000, 50, 'C'));
        empleados.add(new Repartidor(5, "Maria", 25, 2022, 900000, 30, 'Z'));
        empleados.add(new Repartidor(6, "Sofia", 32, 2016, 950000, 45, 'D'));

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        for (Empleado empleado : empleados) {
            empleado.calcularPagoMensual();
        }

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}