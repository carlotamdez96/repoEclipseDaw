package Enero;

public class PrincipalMiClase {

	public static void main(String[] args) {
		
		
		MiClase primera=new MiClase();
	//	primera.a=0; el error seria que no es visible
		primera.setA(13);
		primera.b=23;// aqui trabajo directamente con la variable publica b
		System.out.println("Creo el primer objeto ");
		System.out.println("La variable a vale: "+primera.getA());
		
		
		MiClase segunda=new MiClase(16);
		System.out.println("Creo el segundo objeto");
		System.out.println("La variable b aqui vale: "+primera.b);
		segunda.b=2;
		System.out.println("La variable a vale: "+segunda.getA());
		System.out.println("Ahora la variable b vale: "+segunda.b);
		
		MiClase tercera=new MiClase(28,0);
		System.out.println("Creo el tercer objeto");
		System.out.println("La variable a vale: "+tercera.getA());
		System.out.println("La variable b, vale: "+tercera.b);
		
	}

}
