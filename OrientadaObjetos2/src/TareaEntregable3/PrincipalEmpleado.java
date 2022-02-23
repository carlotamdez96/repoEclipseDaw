package TareaEntregable3;

import TareaEntregable3.Analista.tipoProyecto;

public class PrincipalEmpleado  {

	public static void main(String[] args) {
		
		double sumaC=0;
		double sumaA=0;
		double sumaP=0;
		double sumaT=0;
		
		Comercial c1 = new Comercial("Sergio",37,1100,300);
		Comercial c2 = new Comercial("Manuel",22,1000,300);
		Comercial c3 = new Comercial("Pedro",37,900,100);
		
		
		Analista a1 = new Analista("Fer",33,900,tipoProyecto.Administracion);
		Analista a2 = new Analista("Alb",46,850,tipoProyecto.BigData);
		Analista a3 = new Analista("Jua",21,110,tipoProyecto.Turismo);
		
		
		Programador i1 = new Programador ("Toni",23,1200,false);
		Programador i2 = new Programador("Pep", 43, 1500, true);
		
		sumaC=c1.salarioTotal()+c2.salarioTotal()+c3.salarioTotal();
		sumaA=a1.salarioTotal()+a2.salarioTotal();
		sumaP=i1.salarioTotal()+i2.salarioTotal();
		
		System.out.println("El salario total de los comerciales es: "+sumaC);
		System.out.println("El salario total de los analistas es: "+sumaA);

		System.out.println("El salario total de los programadores es: "+sumaP);
		
		sumaT=sumaA+sumaC+sumaP;
		
		System.out.println("El salario total de todos  es: "+sumaT);



		
		
	}
	

}