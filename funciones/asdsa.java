package funciones;

public class asdsa {

	public class funciones9v3 {

		
		public static void main(String[] args) {

			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime el numero");
			num = sc.nextInt();
			
			System.out.println(contPrimos(num));
		}
		public static int contPrimos (int num) {
			int contador = 2;
			for(int i = 1;i<=num;i++)
			if(num%i==0) {
				if(esPrimo(i)) {
					contador++;
					System.out.println("Es primo" + i);
				}
			}
			System.out.println("Es primo" + num);
			return(contador);
		}
		
		public static boolean esPrimo( int num) {
			boolean primo = true;
			for(int i = 2; i<= num-1;i++) {
				if(num%i==0) {
					primo = false;
				}
			}
			return(primo);
		


	}
	}
}
