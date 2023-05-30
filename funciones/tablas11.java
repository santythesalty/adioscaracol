package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class tablas11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t[] = new int [8];
		int t2[];
		int contPar = 0;
		
		System.out.println("Introduce los digitos");
		t[contPar] = sc.nextInt();
		while((contPar<5 || t[contPar]!=(-1))&& (contPar<7)) {
			contPar++;
			t[contPar] = sc.nextInt();
		}
		System.out.println(Arrays.toString(t) + "" + contPar);
		t2 = ajustar(t);
		
		System.out.println(Arrays.toString(t2));
		
		t2 = ordenar(t2);
		System.out.println(Arrays.toString(t2));
	}
	
	public static int[] ordenar (int[] t2) {
		int temp;
		for(int i = 0;i<t2.length-1;i++) {
			for(int j = 0;j<t2.length-1;j++) {
				if(t2[j]>t2[j+1]) {
					temp = t2[j];
					t2[j] = t2[j+1];
					t2[j+1] = temp;
				}
				
			}
		}
		
		return t2;
	}
	
	public static int[] ajustar(int[] t) {
		int aux = 0;
		
		for(int i = 5;i<t.length;i++) {
			if(t[i] == -1) {
				aux = i;
			} 
			
		}
		if (aux == 0) {
			aux = 8;
		}
		t = Arrays.copyOf(t, aux);
		
		return t;
	}
}
