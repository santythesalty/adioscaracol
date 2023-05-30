package funciones;

import java.util.Arrays;

public class tablas6v3 {

	public static void main(String[] args) {
		
		int t[] = {1,2,3,4,5,6,1,3,4,56,6,7,8};
		sinRepetidos(t);

	}
	
	public static void sinRepetidos (int t[]) {
		
		
		int t2[] = new int[t.length];
		int j = 0;
		int e = 0;
		boolean repetido = false;
		
		for(int i = 0;i<t.length;i++) {
			repetido = false;
			j = 0;
			
			while(!repetido && (j<e)) {
				if(t[i]==t2[j]) {
					repetido = true;
				}
				j++;
			}
			if(!repetido) {
			t2[e] = t[i];
			e++;
			}
		}
		for(int i = 0;i<e;i++) {
			System.out.println(t2[i]);
		}
	}

}
