package Enero;

public class CuentaBancaria {

	private String titular;
	private float saldo;
	
	
	
	public CuentaBancaria(String titular) {
		this.titular=titular;
		saldo=0;
	}
	
	public CuentaBancaria(String titular, float saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float realizaReintegro(float r) {
		if (saldo>=r) {
		return saldo=saldo-r;
		}else {
		System.out.println("Operación no posible");
		return saldo;
		}
	}
	
	public float realizaIngreso (float a) {
		return saldo=saldo+a;
	}

	public static void  imprimir() {
		System.out.println("");
		System.out.println("DATOS DE LAS CUENTAS");
		System.out.println("------------------------------------");
		System.out.println("TITULAR           SALDO");
		System.out.println("------------------------------------");
		
		
		
	}

	@Override
	public String toString() {
		return titular + "             " + saldo;
	}
	
	

	
	
	
	
	
}
