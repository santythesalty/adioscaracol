package funciones;

import java.util.Scanner;

public class recursividad1 {

	public static void main(String[] args) {

		
		int multiplicando;
		int multiplicador;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los numeros a multiplicar");
		multiplicando = sc.nextInt();
		multiplicador = sc.nextInt();
		System.out.println(multiplicar(multiplicando, multiplicador));
		
	}

	
	public static int multiplicar(int multiplicando, int multiplicador) {
		int res;
		if(multiplicador == 0) {
			res = 0;
	} else {
		res = (multiplicando + multiplicar(multiplicando, multiplicador-1));
	}
	return(res);
	}
}
