package funciones;

import java.util.Scanner;

public class funciones4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
System.out.println("Dime los numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(mayor(num1,num2));
	}
	public static int mayor(int num1, int num2) {
		
		if (num1>num2) {
			return(num1);
		} else {
			return(num2);
		}
		
	}
}
