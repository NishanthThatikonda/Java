package interview_practice;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=222222;
int even_count=0;
int odd_count=0;
while(i>0) {
	int rem= i%10;
	if(rem%2==0) {
		even_count++;
	}
	else {
		odd_count++;
	}
	i= i/10;
}
System.out.println("evencount:" +even_count);
System.out.println("oddcount:" +odd_count);

	}

}
