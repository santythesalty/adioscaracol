package funciones;

import java.util.Scanner;

public class funciones11iteracion {

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
		int res = 1;
		for(int i=1;i<=n;i++) {
			res*=a;
		}
		
		return(res);
	}
}
