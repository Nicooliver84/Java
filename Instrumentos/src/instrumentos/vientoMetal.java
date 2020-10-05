package instrumentos;



public class vientoMetal extends Instrumentos implements afinables,lustrables{

	
	

	
	public vientoMetal(String nombre, String descripcion) {
		
		super(nombre,descripcion);	
			
		}

		public void lustrarInstrumento() {
			
		System.out.println(super.getNombreInstrumento() + " ha sido lustrado");	
			
		}

		public void afinarInstrumento() {
			
			System.out.println(super.getNombreInstrumento() + "ha sido afinado automaticamente");
		}
	
	
	
	
	
	
	
	
	
}
