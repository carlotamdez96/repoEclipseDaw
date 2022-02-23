package EjemploHerencia;

public class PrincipalCuerpo {

	public static void main(String[] args) {
	

		
		Esfera esfera1 = new Esfera(Color.AMARILLO,12);
		Esfera esfera2 = new Esfera(Color.ROJO,2);
		
		Prisma prisma1 = new Prisma (Color.BLANCO,2,5);
		Prisma prisma2 = new Prisma (Color.ROSA,4,6);
		
		Cilindro cilindro1 = new Cilindro (Color.ROSA,2,4);
		Cilindro cilindro2 = new Cilindro(Color.VERDE,5,7);
		
		System.out.println("La superficie de esfera1 es : "+esfera1.CalcularSuperficie());
		System.out.println("El volumen  de esfera1 es : "+esfera1.CalcularVolumen());
		System.out.println("La superficie de esfera2 es : "+esfera2.CalcularSuperficie());
		System.out.println("El volumen  de esfera2 es : "+esfera2.CalcularVolumen());
		
		System.out.println("La superficie de prisma1 es : "+prisma1.CalcularSuperficie());
		System.out.println("El volumen  de prisma1 es : "+prisma1.CalcularVolumen());
		System.out.println("La superficie de prisma2 es : "+prisma2.CalcularSuperficie());
		System.out.println("El volumen  de prisma2 es : "+prisma2.CalcularVolumen());
		
		System.out.println("La superficie de cilindro1 es : "+cilindro1.CalcularSuperficie());
		System.out.println("El volumen  de cilindro1 es : "+cilindro1.CalcularVolumen());
		System.out.println("La superficie de cilindro2 es : "+cilindro2.CalcularSuperficie());
		System.out.println("El volumen  de cilindro2 es : "+cilindro2.CalcularVolumen());
		
		
		System.out.println("La esfera 1= "+esfera1.toString());
		System.out.println("La esfera 2= "+esfera2.toString());
		System.out.println("El prisma 1= "+prisma1.toString());
		System.out.println("El prisma 2= "+prisma2.toString());
		System.out.println("El cilindro 1= "+cilindro1.toString());
		System.out.println("El cilindro 2= "+cilindro2.toString());
		
	}

}
