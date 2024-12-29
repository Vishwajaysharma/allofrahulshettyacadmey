package javapractice;

public class Primeno_1_10000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fn1 = 1;
		int sn2 = 10000 ,x ;

		for (int i = fn1; i <= sn2; i++) {

			for ( x = 2; x <= i; x++) {

				if (i % x == 0)
					break;
			    }
if (i==x)
	System.out.println(x+" ");
		}

	}

}
