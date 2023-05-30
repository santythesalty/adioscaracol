package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class tablas12 {

	public static void main(String[] args) {
		
		
		int t [] [] = new int [4] [4];
		boolean esMagicoDemagiaMagica = true;
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los numeros");
		for(int i = 0 ;i<4;i++) {
			for(int j = 0;j<4;j++) {
				t [i] [j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(t));
		
		esMagicoDemagiaMagica =magiaPotagia(t, esMagicoDemagiaMagica);
		System.out.println(esMagicoDemagiaMagica);
		
		
		
		
		
	}
	
	
	
	
	public static boolean magiaPotagia(int [] [] t, boolean magico) { //preguntar lo de los .length en este tipo
		
		int res[] = new int [10];
		int e = 0;
		
		for(int i = 0;i<4;i++) {	
			for(int j = 0;j<4;j++) {
				res[e] += t[i][j];
			}
			e++;
		}
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<4;j++)
				res[e] +=t[j][i];
			e++;
		}
		for(int i = 0;i<4;i++) {
			res[e] += t[i][i];
			
		}
		e++;
		for (int i = 0;i<4;i++) {
			res[e] += t[3-i][i];
		}
		
		
		
		//Todo esto se puede hacer con menos for estoy seguro pero me da pereza
		
		
		
		for(int i = 0;(i<res.length - 1) && (magico==true);i++) {
			if(res[i]!=res[i+1]) {
				magico = false;
			}
		}
		System.out.println(Arrays.toString(res));
		return magico;
	}

}
