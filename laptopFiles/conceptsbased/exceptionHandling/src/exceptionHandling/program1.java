package exceptionHandling;

public class program1 {

	public static void main(String[] args) {
int i=9;
int j=0;
try {
System.out.println(i/j);
	}catch(ArithmeticException ae) {
		System.out.println(ae.toString());
	}
finally {System.out.println("hello");

}
}
}