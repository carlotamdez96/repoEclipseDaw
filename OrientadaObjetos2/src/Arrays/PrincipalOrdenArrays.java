package Arrays;

import java.util.*;

public class PrincipalOrdenArrays {

	public static void main(String[] args) {

		OrdenacionArrays o = new OrdenacionArrays(); // constructor por DEFECTO

		o.Inicializa();

		o.Mostrar();

		/*
		 * o.orden(); o.Mostrar();
		 */

		o.metodoBurbuja();

		o.metodoBaraja();

		o.seleccionDirecta();

		System.out.println("Arrays ordenados: ");
		o.Mostrar();

	}

}
