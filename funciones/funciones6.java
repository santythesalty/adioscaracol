package funciones;

import java.util.Scanner;

public class funciones6 {

	public static void main(String[] args) {
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("dime una letra y te digo si es vocal");
		letra = sc.next();
		System.out.println(vocal(letra);
	}
	public static boolean vocal(char letra) {
		boolean esVocal=false;
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
		esVocal=true;
		}
		return(esVocal);
	}

}
