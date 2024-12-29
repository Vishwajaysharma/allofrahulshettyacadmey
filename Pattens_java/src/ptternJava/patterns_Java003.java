package ptternJava;

public class patterns_Java003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4 ;
		
		for (int row = 1 ; row <= x; row++) {
			
			for (int col = 1; col<= x-row+1 ; col++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		

	}

}
