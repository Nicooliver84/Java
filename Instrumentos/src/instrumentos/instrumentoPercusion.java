package instrumentos;

public class instrumentoPercusion extends Instrumentos implements lustrables{

public instrumentoPercusion(String nombre, String descripcion) {
	
super(nombre,descripcion);	
	
}

public void lustrarInstrumento() {
	
System.out.println(super.getNombreInstrumento() + " ha sido lustrado");	
	
}





	
}
