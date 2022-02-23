package Enero;

public class Bombilla {

	private boolean interruptorParticular;
	private static  boolean  interruptorGeneral = true;
	private String  estancia;
	
	
	public Bombilla(String estancia) {
		interruptorParticular=false;
		this.estancia=estancia;
	}
	
	public boolean InterruptorParticular() {
	
		return interruptorParticular;
	}




	public void setInterruptorParticular(boolean interruptorParticular) {
	
		
		this.interruptorParticular = interruptorParticular;
	}




	public static boolean InterruptorGeneral() {
		return interruptorGeneral=true;
	}




	public static void setInterruptorGeneral(boolean interruptorGeneral) {
		Bombilla.interruptorGeneral = interruptorGeneral;
	}




	public String getEstancia() {
		return estancia;
	}




	public void setEstancia(String estancia) {
		this.estancia = estancia;
	}

	public void enciende() {
		interruptorParticular=true;
	}
	public void apaga() {
		interruptorParticular=false;
	}
	
	public static void activaGeneral() {
		interruptorGeneral=true;
	}
	
	public static void desactivaGeneral() {
		interruptorGeneral=false;
	}


	public  boolean encendida() {
	
		if (interruptorGeneral==true) {
				return interruptorParticular;
			}else {
				return false;
			}
		
	}


	public void mostrar () {
		
		if (interruptorGeneral) {
			System.out.println( "El estado de la bombilla de la estancia "+estancia+" es: "+interruptorParticular);
		}else {
			System.out.println( "El estado de la bombilla de la estancia "+estancia+" es: "+interruptorGeneral);
		}
	}
	
	
	
}
