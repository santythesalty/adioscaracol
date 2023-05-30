package funciones;

import java.util.Scanner;

public class funciones12 {

	public static void main(String[] args) {
		
		int factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero para factorizarlo");
		factorial = sc.nextInt();
		System.out.println(factorizar(factorial));
	}
	
	public static int factorizar(int factorial) {
		int res;
		if(factorial==0) {
			res = 1;
		} else {
			res = (factorial*factorizar(factorial-1));
		}
		 
		return(res);
	}

}
