package instrumentos;

public class vientoMadera extends Instrumentos implements lustrables,afinables{

	
	
	public vientoMadera(String nombre, String descripcion) {
		
		super(nombre,descripcion);	
			
		}

		public void lustrarInstrumento() {
			
		System.out.println(super.getNombreInstrumento() + " ha sido lustrado");	
			
		}

		public void afinarInstrumento() {
			
			System.out.println(super.getNombreInstrumento() + " ha sido afinado manualmente");
		}
	
	
}
