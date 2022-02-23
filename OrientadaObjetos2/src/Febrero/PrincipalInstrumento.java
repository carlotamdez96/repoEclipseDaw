package Febrero;

public class PrincipalInstrumento {

	public static void main(String[] args) {
		
		
		Campana c1 = new Campana();
		c1.aņadirNotas(Notas.DO);
		c1.aņadirNotas(Notas.SI);
		c1.aņadirNotas(Notas.SOL);
		c1.aņadirNotas(Notas.RE);
		c1.aņadirNotas(Notas.MI);
		
		Piano p1 = new Piano();
		p1.aņadirNotas(Notas.DO);
		p1.aņadirNotas(Notas.SI);
		p1.aņadirNotas(Notas.MI);
		p1.aņadirNotas(Notas.FA);
		p1.aņadirNotas(Notas.DO);
		
		
		c1.eliminarNotas();
		p1.eliminarNotas();
		
		c1.interpretacion();
		p1.interpretacion();

	}

}
