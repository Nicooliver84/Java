package estudiantes;

import java.util.*;

public class Escuela {

private List<Estudiante> alumnos;	
	
public Escuela() {
	
this.alumnos= new ArrayList<Estudiante>();	
}
	
public void agregarAlumno(Estudiante e) {
	
this.alumnos.add(e);	
	
}

public void mostrarAlumnos() {
	
for(Estudiante alumnos : this.alumnos) {
	
	System.out.println(alumnos);
}
}


public void ordenarPorLegajo() {
	
Collections.sort(this.alumnos, new ComparatorEstudianteLegajo());	
	
}

	
}
	


