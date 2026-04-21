package institucionEducativa;

public class App {

    public static void main(String[] args) {

	Estudiante estudiante = new Estudiante(1, "Pedro", 18, 123);
	Docente docente = new Docente(1, "Alfredo", 42, "Quimica", 100, 20);
	Administrativo admin = new Administrativo(1, "Hector", 34, "secretario", "facultad de derecho", 1000);
		
	docente.calcularSalario();
	admin.calcularSalario();
	
	System.out.println("Existe un estudiante con codigo: " + estudiante.getCodigo() 
		+ ", el cual se llama: "	+ estudiante.getNombre());
			
}
}