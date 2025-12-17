package interview_practice;

public class SubStrPresentINmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String MainSTR="HELLO WORLD";
String SubSTR="HELL";
int result=MainSTR.indexOf(SubSTR);
if(result==-1) {
	System.out.println("string is not present");
}
else{System.out.println(result +"String is present");

	}

}
}