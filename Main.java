package ejerciciodivisas;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String cantidadinicial;
		 String tasacambio;
		 double cantidadfinal;
		 String moneda1;
		 String moneda2;
		 Scanner keyboard = new Scanner(System.in);
			
		System.out.println("Introduce la divisa que posee");
		moneda1=keyboard.nextLine();
		System.out.println("Introduce la cantidad que posee");
		cantidadinicial =keyboard.nextLine();
		System.out.println("Introduce la divisa que desea");
		moneda2=keyboard.nextLine();
		System.out.println("Introduce el tipo de cambio");
		tasacambio = keyboard.nextLine();
		cantidadfinal = Double.valueOf(cantidadinicial)*Double.valueOf(tasacambio);
		System.out.println("Sus "+ Double.valueOf(cantidadinicial) + moneda1+ "son "+ cantidadfinal+"  "+ moneda2);
		return ;
	}

}
