package Febrero;
import java.util.*;
public class Piano extends Instrumento  {


	public Piano() {
		
	}
	
	public  void interpretacion () {
		
	
		for(int i=0; i< 100;i++) {
			if(notas[i]==Notas.DO) {
				System.out.print(" do ");
			}
			
			if(notas[i]==Notas.RE) {
				System.out.print(" re ");
			}
			if(notas[i]==Notas.MI) {
				System.out.print(" mi ");
			}
			if(notas[i]==Notas.FA) {
				System.out.print(" fa ");
			}
			if(notas[i]==Notas.SOL) {
				System.out.print(" sol ");
			}
			if(notas[i]==Notas.LA) {
				System.out.print(" la ");
			}
			if(notas[i]==Notas.SI) {
				System.out.print(" si ");
			}
			
			
			
			
		}
		System.out.println("");
	
	
	
	
	}
	
	
	
}
