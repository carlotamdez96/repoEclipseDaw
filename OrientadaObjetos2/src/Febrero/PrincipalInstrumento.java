package Febrero;

public class PrincipalInstrumento {

	public static void main(String[] args) {
		
		
		Campana c1 = new Campana();
		c1.a�adirNotas(Notas.DO);
		c1.a�adirNotas(Notas.SI);
		c1.a�adirNotas(Notas.SOL);
		c1.a�adirNotas(Notas.RE);
		c1.a�adirNotas(Notas.MI);
		
		Piano p1 = new Piano();
		p1.a�adirNotas(Notas.DO);
		p1.a�adirNotas(Notas.SI);
		p1.a�adirNotas(Notas.MI);
		p1.a�adirNotas(Notas.FA);
		p1.a�adirNotas(Notas.DO);
		
		
		c1.eliminarNotas();
		p1.eliminarNotas();
		
		c1.interpretacion();
		p1.interpretacion();

	}

}
