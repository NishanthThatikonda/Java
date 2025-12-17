package Practice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hellowww";
String temp="";
for(int i=0; i<s.length();i++) {
	if(temp.indexOf(s.charAt(i))==-1) {
		temp=temp+s.charAt(i);
	}
}
System.out.println(temp);
	}

}
