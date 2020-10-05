package instrumentos;

public class mainInstrumentos {

	public static void main(String[] args) {
		

	Instrumentos[] misInstrumentos= new Instrumentos[4];
	
	misInstrumentos[0]=new instrumentoCuerda("guitarra ", "tiene 6 cuerdas ");
	misInstrumentos[1]=new instrumentoPercusion("bateria ", "tiene 4 platillos ");
	misInstrumentos[2]=new vientoMadera("sicus ", "muy poca pesadez");
	misInstrumentos[3]=new vientoMetal("saxofon ", "mucho ruido ");
	
	
	for(Instrumentos i : misInstrumentos) {
		
	System.out.println(i.toString());	
		
	}
	
	
	}

}
