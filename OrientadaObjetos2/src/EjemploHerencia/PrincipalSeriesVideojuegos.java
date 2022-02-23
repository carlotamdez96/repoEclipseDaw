package EjemploHerencia;

public class PrincipalSeriesVideojuegos {

	public static void main(String[] args) {
	
	
		Serie [] Series = new Serie[5]; 
		Videojuego [] Videojuegos = new Videojuego[5];
		
		
		Series[0] = new Serie("Juego de tronos",5,"accion","xxxxx"); // Serie seriemayor=Series[0]
		Series[1] = new Serie("Vikingos",7,"accion","xxxxx");
		Series[2] = new Serie("Emily en Paris",2,"comedia","xyx");
		Series[3] = new Serie("The Sinner ",3,"accion","yyyxx");
		Series[4] = new Serie("The Rain",3,"accion","yxxx");
		
		
		Videojuegos[0]  = new Videojuego("GTA",30,"accion","Rockstar");
		Videojuegos[1]  = new Videojuego("FIFA",25,"deportes","EA");
		Videojuegos[2]  = new Videojuego("call of duty",10,"accion","Activision");
		Videojuegos[3]  = new Videojuego("Animal Crossing",100,"simulacion","Nintendo");
		Videojuegos[4]  = new Videojuego("Minecraft",1000,"accion","Mojang");
		
		
	
		Videojuegos[0].entregar();
		Videojuegos[4].entregar();
		Series[1].entregar();
		Series[2].entregar();
		

		for(int i=0; i<5;i++) {
			int contador=0;
			if(Series[i].isEntregado()==true) {
				contador=contador+1;
				Series[i].devolver();
			}
			
			
			if(Videojuegos[i].isEntregado()==true) {
				contador=contador+1;
				Videojuegos[i].devolver();
		}
			
				
		
	}
		
		for(int i=0; i<5;i++) { //esta mal mimrarlo en las aulas, ejercicio2
			int mayor=0;
			
			
			if(Series[i].getNumTemp()>mayor) {
				mayor=Series[i].getNumTemp();
				
			}
			
			if(Videojuegos[i].getHoras()>mayor) {
				mayor=Videojuegos[i].getHoras();
				
			}
			
			
		
		}
		
		
		
		
		
	}		

}
