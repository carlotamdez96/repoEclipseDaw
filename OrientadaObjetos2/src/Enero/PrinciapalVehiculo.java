package Enero;

public class PrinciapalVehiculo {

	public static void main(String[] args) {
		
		
		
		Coche1 coche1 = new Coche1();
		
		Coche1 coche2 =new Coche1("123456ABC","azul",50,100,5,4);
		
		Moto moto1 = new Moto();
		
		Moto moto2 = new Moto("98745ZY","blanco",2,80,200,1);
		

		System.out.println("El constructor por defecto");
		System.out.println(coche1.toString());
		
		System.out.println("El objeto creado pasando parametros");
		System.out.println(coche2.toString());
		
		System.out.println("El constructor por defecto");
		System.out.println(moto1.toString());
		
		System.out.println("El objeto creado pasando parametros");
		System.out.println(moto2.toString());
	}

}
