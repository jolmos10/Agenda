package Moviles;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		HashMap<Double, Movil> listaMoviles= new HashMap<Double,Movil>();
		Movil movil1 = new Movil("a","a",1,1.0);
		Movil movil2 = new Movil("b","b",2,2.0);
		Movil movil3 = new Movil("c","c",3,3.0);
		
		listaMoviles.put(movil1.imei, movil1);
		listaMoviles.put(movil2.imei, movil2);
		listaMoviles.put(movil3.imei, movil3);
		Double aux = movil1.imei;
		movil1.imei = 7.0;
		listaMoviles.replace(movil1.imei, movil1);
		System.out.println("cambio realizado");
	}

	
	
//	static Scanner sc =new Scanner(System.in);
//	static Movil movil = new Movil();
//	
//	public static void main(String[] args) {
//		HashMap<Double, Movil> listaMoviles = new HashMap<Double, Movil>();
//		while (true) {
//			System.out.println("Introduce la marca");
//			movil.marca = sc.nextLine();
//			System.out.println("Introduce el modelo");
//			movil.modelo = sc.nextLine();
//			System.out.println("Introduce el año de fabricación");
//			movil.añoFabricacion = sc.nextInt();
//			System.out.println("Introduce el IMEI");
//			movil.imei = sc.nextDouble();
//
//			listaMoviles.put(movil.imei, movil);
//		}
//	}
}