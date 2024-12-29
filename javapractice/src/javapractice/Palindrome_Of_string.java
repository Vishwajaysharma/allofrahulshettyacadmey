package javapractice;

public class Palindrome_Of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String x = "121";
         String reverse = "";
         
         for (int  i= x.length()-1; i>=0 ; i-- ) {
        	 
        	 
        	 reverse= reverse+x.charAt(i);
        	 }
         
         
        if (x.equals(reverse)) {
        	System.out.println("true pelendorme");
         }
         else {
        	 System.out.println("false pelenderiumm");
         }

		
		
		
		
	}

}
