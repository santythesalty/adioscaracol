package funciones;

import java.util.Scanner;

public class funciones1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos eco");
		n = sc.nextInt();
		eco(n);
	}
	public static void eco(int n) {
		for(int i = 0;i<n;i++) {
			System.out.println("Eco...");
		}
	}
}
