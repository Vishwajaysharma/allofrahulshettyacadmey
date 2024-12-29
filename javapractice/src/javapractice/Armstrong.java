package javapractice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g ,ar=0;
        int x= 154;
        int y=x;
        
        while (x>0) {
        	   g=x/10;   // 153 divided by 10 remindr = g
        	ar = (g*g*g)+ar;
        	x=x/10;
        	}
        
        if (ar == y) {
        	System.out.println("armstrong number");
        }
         else {System.out.println("not armstrong no.");	
		
		
        }
		
	}

}
