package interview_practice;

public class Method {
	String name;
	int r;
Method(int n, String num) {
	r=n;
	name= num;
}
void sum() {
	System.out.println(r+" " +name);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method r=new Method(20,"Raju");
r.sum();


	}

}
