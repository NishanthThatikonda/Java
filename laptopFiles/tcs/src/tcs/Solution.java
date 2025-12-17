package tcs;
import java.util.*;
 class Laptop{
	private int Id;
	private String company;
	private String model;
	private double price;
	
	public Laptop(int Id, String company, String model, double price) {
		this.Id= Id;
		this.company=company;
		this.model=model;
		this.price=price;
	}
		public   int  getId(){
			return Id;
		}
		 
		public void setId(int Id) {
			this.Id=Id;
		}
		
	
		
		public String getcompany() {
			return company;
		}
		
		public void setcompany(String company) {
			this.company=company;
		}
		
		
		
		
		
		public String getmodel() {
			return model;
		}
		
		public void setmodel(String model) {
			this.model= model;
		}
		
		
		public void  setprice(int price) {
			this.price=price;
		}
		
		
		public double getprice() {
			return price;
		}
		
		
	
}


public class Solution {
	public static Laptop SearchById(Laptop[]lap,int Id) {
		for(Laptop dell :lap) {
			if(dell.getId()==Id) {
				return dell;
			}
			
		}
		System.out.println("no laptop found");
		return null;
		
	
	}
	
	
	public static Double searchbyCompany(Laptop[] lap, String company ) {
		double total=0.0;
		int count=0;
		for(Laptop dell: lap) {
			if(dell.getcompany().equalsIgnoreCase(company)) {
				total +=dell.getprice();
				count ++;
				
			}
		}
		if(count==0) {
		System.out.println("No laptop found");
		return 0.0;
		}
		return total/count;
		
	}
	
	
public static void main(String[] Args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	Laptop[] lap = new Laptop[n];
	
	for(int i=0; i<n; i++) {
		System.out.println("enterr id:");
		int Id= sc.nextInt();
		sc.nextLine();
		String company= sc.nextLine();
		String model= sc.nextLine();
		int price= Integer.parseInt(sc.nextLine());
		lap[i]= new Laptop(Id,  company,  model,  price);
	}
	
	int searchid= Integer.parseInt(sc.nextLine());
	System.out.println("search name");
	String searchname=sc.nextLine();
	
	
	//by id
	Laptop flp=SearchById(lap,searchid);
	if(flp != null) {
		System.out.println("laptop Found");
		System.out.println(flp.getId());
		System.out.println(flp.getcompany());
		System.out.println(flp.getprice());

	}
	
	//avg
	double averageprice =searchbyCompany(lap,searchname);
		if(averageprice>0.0) {
			System.out.println("Average price of " + searchname + " laptops: " + averageprice);
		}
	
	
	
	sc.close();
}
}
