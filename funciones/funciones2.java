package funciones;

import java.util.Scanner;

public class funciones2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros");
		num1=sc.nextInt();
		num2=sc.nextInt();
		comprendidos(num1,num2);
	}

	public static void comprendidos(int num1, int num2){
		for(int i = num1+1;i<num2;i++) {
			System.out.println(i);
		}
	}
}
