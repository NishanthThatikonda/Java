package basicPrgn;

public class ClassStaticc {
	static int id =404; 
	public static void main(String[] args) {
System.out.println(id);
/*
here we don't use this statement an " Staticc static=new Staticc()";
we can  directly Access id. 
we can access the class variable in any object/main function
	**/
	}
	public static void one(String[] args) {
	System.out.println(id);
}
}