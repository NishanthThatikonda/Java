package interview_practice;

public class FindingDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"java","python","java"};
//here wwe are using boolean because, if we want to print if we don't have any same string
//if we don't want to print content not same then don't need to use boolen method
boolean flag=false;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			System.out.println("duplicate element is:"+a[i]);
			flag=true;
		}
	}
}
		if(flag==false) {
			System.out.println("doesnot found any duplicate element");
		}
}

	}

	

