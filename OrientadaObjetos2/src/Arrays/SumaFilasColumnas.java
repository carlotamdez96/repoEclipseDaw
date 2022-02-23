package Arrays;

public class SumaFilasColumnas {

	public static void main(String[] args) {
		
		
		int [][]matriz = new int [5][5];
		int sumaF=0;
		int sumaC=0;
		
		
		for(int i=0; i<matriz.length;i++) {
			
			for (int j=0;j<matriz.length;j++) {
				matriz[i][j]=(int)Math.round(Math.random()*(50-(-50)+1)-50);
				
				sumaF=sumaF+matriz[i][j];
			
			}
			System.out.println("La suma de la fila "+i+" es : "+sumaF);
			sumaF=0;
		}
		
		
		
		
		for(int j=0; j<matriz.length;j++) {
			
			for (int i=0;i<matriz.length;i++) {
				
				
				sumaC=sumaC+matriz[i][j];
			
			}
			System.out.println("La suma de la columna "+j+" es : "+sumaC);
			sumaC=0;
		}
		
		
		
		System.out.println("Matriz aleatoria");
		for(int i=0; i<matriz.length;i++) {
			System.out.println();
			for (int j=0;j<matriz.length;j++) {
			System.out.print(matriz[i][j]+" ");
				
			}
		}
		

	}

}
