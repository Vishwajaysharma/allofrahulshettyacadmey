package javapractice;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String x = "vee";
         String reverse = "";
         
         for (int  i= x.length()-1; i>=0 ; i-- ) {	 
        	 reverse= reverse+x.charAt(i);
        	 }
         
        	System.out.println(reverse);
	}

}
