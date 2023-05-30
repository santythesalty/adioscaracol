package funciones;

import java.util.Scanner;

public class funciones11 {

	public static void main(String[] args) {

		int a;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la base");
		a = sc.nextInt();
		System.out.println("Dime el exponente");
		n = sc.nextInt();
		System.out.println(potencia(a,n));
	}
	public static int potencia(int a, int n) {
		int res;
		if(n==0) {
			res = 1;
		} else {
			res = (a*potencia(a, n-1));
		}
		return(res);
	}
}
