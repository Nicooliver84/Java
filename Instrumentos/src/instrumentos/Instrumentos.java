package instrumentos;

public class Instrumentos {

private String nombre;

private String descripcion;
	
public Instrumentos(String nombre, String descripcion) {
	
this.descripcion=descripcion;

this.nombre=nombre;
	
}

public void tocarInstrumento() {
	
	System.out.println(this.nombre + " ha sido tocado");
}

public String getNombreInstrumento() {
	
return this.nombre;	
	
}

public String toString() {
	
return "El instrumento : " + this.nombre + " , tiene : " + this.descripcion;	
}



}
