package Enero;

public class TestAnimal {

	public static void main(String[] args) {
	
		
		Animal animal1=new Animal();
		animal1.setEdad(12);
		animal1.setNombre("Roni");
		animal1.nace();
		System.out.println("Me llamo "+animal1.getNombre()+" y tengo "+animal1.getEdad()+" años");
		
		
		System.out.println(animal1.toString());
	}

}
