package Enero;

public class TestCuenta1 {

	public static void main(String[] args) {
		
		float saldoMedio=0;
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Rosario");
		
		CuentaBancaria cuenta2 = new CuentaBancaria("Carmen",500);
		
		CuentaBancaria cuenta3 = new CuentaBancaria("Jose Luis",1000);
		
		//Cuentas iniciales con saldos iniciales
		CuentaBancaria.imprimir();// aqui llamo al metodo estatico 
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		
		cuenta1.realizaIngreso(100);
		cuenta2.realizaReintegro(200);
		cuenta3.realizaIngreso(300);
		cuenta3.realizaReintegro(400);
		
		
		//Cuentas modificadas
		CuentaBancaria.imprimir();
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		saldoMedio=(cuenta1.getSaldo()+cuenta2.getSaldo()+cuenta3.getSaldo())/3;
		System.out.println("El saldo medio de las tres cuentas es de: "+saldoMedio);
		
	}

}
