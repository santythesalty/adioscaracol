package funciones;

import java.util.Scanner;

public class recursividad3 {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		x = sc.nextInt();
		System.out.println(digitos(x));
		
		
		
	}
	
	
	public static int digitos(int x) {
		int contador = 0;
		if (x>0) {
			contador++;
			digitos(x/10);
		}
		return(contador);
		
	}
}
