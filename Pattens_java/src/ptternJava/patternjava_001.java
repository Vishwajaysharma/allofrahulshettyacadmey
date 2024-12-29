package ptternJava;

public class patternjava_001 {

	public static void main(String[] args) {
		
/*          * 
            *  * 
            *  *  * 
            *  *  *  *                          */
		int x = 4;
		for (int row = 1; row <= x; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(" * ");
			}
         System.out.println();
		}

	}

}
