package Practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int sum=0;
		int temp=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				
				sum= sum+i;
			}
			
			
		}
		if(temp == sum ) {
			System.out.println("given no is perfect number");
		}
		else {
			System.out.println(" given no is not a factor");
		}

	}

}
