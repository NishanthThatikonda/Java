package interview_practice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=123564;
int sum =0;
while(i>0){
     sum=sum+i%10;
     i=i/10;
}
System.out.println(sum);
	}

}
