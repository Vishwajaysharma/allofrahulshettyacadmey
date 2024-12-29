package javapractice;

public class Is_thenoPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 997,count = 0;
for (int i=1 ; i<=x ;i++) {
	if (x%i==0) {
		 count++;
	}
	
	}
		if(count==2) {
			
			System.out.println("true prime no.");
		}
		else{
			System.out.println("not prime no.");
		
		}
	}

}
