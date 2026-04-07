package hospital;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Paciente> listaPacientes;

    // Constructor
    public Sistema() {
        this.listaPacientes = new ArrayList<>();
    }

    // Registrar paciente
    public void registrarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    // Agregar examen a un paciente
    public void agregarExamenes(Paciente paciente, Examen examen) {
        paciente.agregarExamen(examen);
    }

    // Agregar tratamiento a un paciente
    public void agregarTratamientos(Paciente paciente, Tratamiento tratamiento) {
        paciente.agregarTratamiento(tratamiento);
    }

    // Contar pacientes con Sarcoma
    public int numPacientesSarcoma() {
        int contador = 0;
        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer().equalsIgnoreCase("sarcoma")) {
                contador++;
            }
        }
        return contador;
    }

    // Contar pacientes con Leucemia
    public int numPacientesLeucemia() {
        int contador = 0;
        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer().equalsIgnoreCase("leucemia")) {
                contador++;
            }
        }
        return contador;
    }

    // Contar pacientes con Linfoma
    public int numPacientesLinfoma() {
        int contador = 0;
        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer().equalsIgnoreCase("linfoma")) {
                contador++;
            }
        }
        return contador;
    }
    
    public void registrarEstadoActual(Paciente paciente, String estado) {
    	paciente.estaditoActual(estado, paciente);
    }

    // Mostrar porcentajes por estado
    public void mostrarPorcentajesEstados() {
        int total = listaPacientes.size();

        if (total == 0) {
            System.out.println("No hay pacientes registrados.");
            return;
        }

        int remision = 0;
        int tratamiento = 0;
        int fallecido = 0;

        for (Paciente p : listaPacientes) {
            String estado = p.getEstadoActual().toLowerCase();

            if (estado.equals("en remision")) {
                remision++;
            } else if (estado.equals("en tratamiento")) {
                tratamiento++;
            } else if (estado.equals("fallecido")) {
                fallecido++;
            }
        }

        double porcentajeRemision = (remision * 100.0) / total;
        double porcentajeTratamiento = (tratamiento * 100.0) / total;
        double porcentajeFallecido = (fallecido * 100.0) / total;

        System.out.println("Porcentaje en remisión: " + porcentajeRemision + "%");
        System.out.println("Porcentaje en tratamiento: " + porcentajeTratamiento + "%");
        System.out.println("Porcentaje fallecidos: " + porcentajeFallecido + "%");
    }
}
