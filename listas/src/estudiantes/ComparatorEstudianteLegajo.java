package estudiantes;

import java.util.Comparator;

public class ComparatorEstudianteLegajo implements Comparator<Estudiante>{

	public int compare(Estudiante e1, Estudiante e2) {
		
		return e1.getLegajo().compareTo(e2.getLegajo());
		
		
	}
	
	
}
