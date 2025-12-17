package interview_practice;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6};
boolean nani=false;
System.out.println("enter the value:");
Scanner sc=new Scanner(System.in);
int Raju=sc.nextInt();
int key=Raju;
int l=0;
int h=a.length;
while(l<=h) {
int mid= (l+h)/2;
if(mid==key) {
	System.out.println("we found the number");
	nani=true;
	break;
}
if(key>mid) {
	l=mid+1;
}
if(key<mid) {
	h=mid-1;
}
}
if(nani==false) {
	System.out.println("there is no number was present in a given array");
}

//another method for binary search is 
//System.out.println (Arrays.binarySearch(a, 3));
sc.close();
	}
}
