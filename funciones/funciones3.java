package funciones;

import java.util.Scanner;

public class funciones3 {

	public static void main(String[] args) {
		int eleccion;
		int r;
		int h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el radio del cilindro");
		r = sc.nextInt();
		System.out.println("Dime sus altura");
		h = sc.nextInt();
		System.out.println("1 para el area 2 para el volumen");
		eleccion = sc.nextInt();
		if(eleccion == 1) {
			area(r,h);
		}
		else if(eleccion == 2) {
			volumen(r,h);
		} else {
			System.out.println("Operacion invalida resetea el programa");
		}
		

	}
	
	public static void area(int r, int h) {
		
		System.out.println(2*Math.PI*r*(h+r));
	}
	public static void volumen(int r, int h) {
		System.out.println(Math.PI*r*r*h);
	}
}
