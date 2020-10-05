package instrumentos;

public class instrumentoCuerda extends Instrumentos implements afinables {



public instrumentoCuerda(String nombre, String descripcion) {

super(nombre,descripcion);	
	
}
	


public void afinarInstrumento() {

System.out.println(super.getNombreInstrumento() + " ha sido afinada");
}




}
