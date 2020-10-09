package estudiantes;

public class Estudiante {

private Integer legajo;
private String nombre;


public Estudiante(Integer legajo, String nombre) {

	this.legajo = legajo;
	this.nombre = nombre;
}
public Integer getLegajo() {
	return legajo;
}
public void setLegajo(Integer legajo) {
	this.legajo = legajo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Estudiante [legajo=" + legajo + ", nombre=" + nombre + "]";
}



	
	
	
}
