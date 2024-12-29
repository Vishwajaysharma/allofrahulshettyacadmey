package javapractice;

public class Allfirst_10primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 2;
		int count = 0,x;
		 while (count < 10) {
			 
			 for (int i = num; i <= count; i++) {

					for ( x = 2; x <= i; x++) {

						if (i % x == 0)
							break;
					    }
			 
			 
			 
			 
	            if (i==x) {
	                System.out.println(num);
	                count++;
	            }
	            num++;
	        }
			

		}

	}
	}


