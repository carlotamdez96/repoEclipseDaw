package Febrero;

public class PrincipalInstrumento {

	public static void main(String[] args) {
		
		
		Campana c1 = new Campana();
		c1.añadirNotas(Notas.DO);
		c1.añadirNotas(Notas.SI);
		c1.añadirNotas(Notas.SOL);
		c1.añadirNotas(Notas.RE);
		c1.añadirNotas(Notas.MI);
		
		Piano p1 = new Piano();
		p1.añadirNotas(Notas.DO);
		p1.añadirNotas(Notas.SI);
		p1.añadirNotas(Notas.MI);
		p1.añadirNotas(Notas.FA);
		p1.añadirNotas(Notas.DO);
		
		
		c1.eliminarNotas();
		p1.eliminarNotas();
		
		c1.interpretacion();
		p1.interpretacion();

	}

}
