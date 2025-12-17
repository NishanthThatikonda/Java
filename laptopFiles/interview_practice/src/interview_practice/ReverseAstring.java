package interview_practice;
import java.util.Scanner;
public class ReverseAstring {
public static void main(String[] args) {
System.out.println("Enter a value:");
Scanner sc= new Scanner(System.in);
//if you want to reverse a number then change nextLine into NextINT and also string into int.
String num=sc.nextLine();
String original_no=num;
//using stringBuilder class
/*StringBuilder rev=new StringBuilder();
rev.append(num);
StringBuilder number=rev.reverse();
System.out.println(number);*/
StringBuffer rev=new StringBuffer(num);
StringBuffer i=rev.reverse();
System.out.println(i);
if(original_no.equals(i.toString())) {
	System.out.println("given string is palindron");
}
else {
	System.out.println("given string is not palindrom");
}
sc.close();
	}

}
