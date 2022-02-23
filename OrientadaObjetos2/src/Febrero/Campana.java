package Febrero;

public class Campana extends Instrumento {

	

	public Campana() {
		
	}
	
	public  void interpretacion () {
		
	
		for(int j=0; j<i ;j++) {
			if(notas[j]==Notas.DO) {
				System.out.print(" dolonnnnnnnnnnn ");
			}
			
			if(notas[j]==Notas.RE) {
				System.out.print(" reeeeennnn ");
			}
			if(notas[j]==Notas.MI) {
				System.out.print(" miiiiiiiiii ");
			}
			if(notas[j]==Notas.FA) {
				System.out.print(" faaaaaaaaaaa ");
			}
			if(notas[j]==Notas.SOL) {
				System.out.print(" sooooooooooollllll ");
			}
			if(notas[j]==Notas.LA) {
				System.out.print(" laaaaaaaaaaa ");
			}
			if(notas[j]==Notas.SI) {
				System.out.print(" siiiiiiiiiiiiii ");
			}
			
			
			/*
			 * switch(notas[i]){ // arrays de enumerados
			 * case DO: -- como sabe que ya es del tipo enumerado no hace falta poner notas.do
			 * syso 
			 * break;
			 * 
			 * case RE:
			 * syso 
			 * break;
			 * 
			 */
			
		}
		System.out.println("");
	}
}
