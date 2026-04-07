package hospital;

public class App {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Paciente p1 = new Paciente(1, "Juan", 30, "M", "leucemia", "I");
        Paciente p2 = new Paciente(2, "Ana", 25, "F", "sarcoma", "II");
        Paciente p3 = new Paciente(3, "Luis", 40, "M", "linfoma", "III");
        Paciente p4 = new Paciente(4, "Maria", 35, "F", "leucemia", "II");
        Paciente p5 = new Paciente(5, "Carlos", 50, "M", "sarcoma", "IV");
        Paciente p6 = new Paciente(6, "Sofia", 28, "F", "linfoma", "I");

        sistema.registrarEstadoActual(p1, "en remision");
        sistema.registrarEstadoActual(p2, "en tratamiento");
        sistema.registrarEstadoActual(p3, "fallecido");
        sistema.registrarEstadoActual(p4, "en tratamiento");
        sistema.registrarEstadoActual(p5, "en remision");
        sistema.registrarEstadoActual(p6, "en tratamiento");
        
        sistema.registrarPaciente(p1);
        sistema.registrarPaciente(p2);
        sistema.registrarPaciente(p3);
        sistema.registrarPaciente(p4);
        sistema.registrarPaciente(p5);
        sistema.registrarPaciente(p6);

        Examen e1 = new Examen(1, "tomografía", "Normal");
        Examen e2 = new Examen(2, "biopsia", "Positivo");
        Examen e3 = new Examen(2, "resonancia", "Positivo");
        
        sistema.agregarExamenes(p1, e1);
        sistema.agregarExamenes(p2, e2);
        sistema.agregarExamenes(p3, e3);

        Tratamiento t1 = new Tratamiento(1, "Quimioterapia", 60, "Nauseas");
        Tratamiento t2 = new Tratamiento(2, "Radioterapia", 45, "Fatiga");
        Tratamiento t3 = new Tratamiento(3, "Inmunoterapia", 30, "Dolor");
        
        sistema.agregarTratamientos(p1, t1);
        sistema.agregarTratamientos(p2, t2);
        sistema.agregarTratamientos(p3, t3);

        System.out.println("Pacientes con Leucemia: " + sistema.numPacientesLeucemia());
        System.out.println("Pacientes con Sarcoma: " + sistema.numPacientesSarcoma());
        System.out.println("Pacientes con Linfoma: " + sistema.numPacientesLinfoma());

        System.out.println("\nPorcentajes por estado:");
        sistema.mostrarPorcentajesEstados();
    }
}