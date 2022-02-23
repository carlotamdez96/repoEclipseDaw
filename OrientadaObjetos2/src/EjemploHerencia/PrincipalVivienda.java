package EjemploHerencia;

public class PrincipalVivienda {

	public static void main(String []args) {
		
		
		boolean iguales;
		Piso piso1 = new Piso(Tipo.piso,4,45.78,100000,"Gijon","centro",12.50,true); // poniendo Tipo.y uno de los atributos enumerados en la clase enumerada
		
		Casa casa1 = new Casa (Tipo.casa,5,145.78,400000,"Gijon","somio",120.50,true);
		Casa casa2 = new Casa (Tipo.casa,5,145.78,40000,"Oviedo","somio",20.50,true);
		Casa casa3 = new Casa (Tipo.casa,5,145.78,400000,"Gijon","somio",120.50,true);
		
		
		System.out.println("El piso es : "+piso1.toString());
		System.out.println("La casa es: "+casa1);
		
	
		
		if(casa1.equals(casa3)) {
			System.out.println("Casa 1 y casa 3 Son iguales");
		}else {
			System.out.println("Son distintas");
		}
	}
	
}
