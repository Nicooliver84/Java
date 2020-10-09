package estudiantes;

public class mainEscuela {

	public static void main(String[] args) {
		
		Escuela industrial= new Escuela();
		
		Estudiante lucas = new Estudiante(11,"Lucas");		
		
		Estudiante diego = new Estudiante(12,"Diego");
		
		Estudiante marcelo = new Estudiante(11,"Marcelo");
	
		industrial.agregarAlumno(marcelo);
		industrial.agregarAlumno(lucas);
		industrial.agregarAlumno(diego);
		
		
		industrial.mostrarAlumnos();
	}

}
