package Practice;
public class RemiveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String r= "r you";
int count=0;
for(int i=0; i<r.length();i++) {
	char s= r.charAt(i);
	if(s==' ') {
		count++;
	}}
	if(count>=3) {
		System.out.println(count);
	}
	else {
		System.out.println("NAN");
	}

	}

}
