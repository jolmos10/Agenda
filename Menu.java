System.out.println("Hola");
package Moviles;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	
	static Scanner sc =new Scanner(System.in);
	static Movil movil = new Movil();
	
	public static void main(String[] args) {
		HashMap<Double, Movil> listaMoviles = new HashMap<Double, Movil>();
		while (true) {
			System.out.println("Introduce la marca");
			movil.marca = sc.nextLine();
			System.out.println("Introduce el modelo");
			movil.modelo = sc.nextLine();
			System.out.println("Introduce el año de fabricación");
			movil.añoFabricacion = sc.nextInt();
			System.out.println("Introduce el IMEI");
			movil.imei = sc.nextDouble();

			listaMoviles.put(movil.imei, movil);
		}
	}
}