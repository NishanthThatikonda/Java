package tcs;
import java.util.*;
 class Vehicles {
	 
	 private int id;
	 private String Brand;
	 private String model;
	 private double mileage;
	 
	 
	 public Vehicles( int id,String Brand,String model,double mileage) {
		 this.id= id;
		 this.Brand=Brand;
		 this.model= model;
		 this.mileage= mileage;
	 }
	 
	 public int getId() {
		 return id;
		 
	 }
	 
	 public String getBrand() {
	 return Brand;
		 
	 }
	 public String getModel() {
		 return model;
	 }
	 public double getMileage() {
		 return mileage;
	 }
	 
	 
	 
	 public void setId(int id) {
		 this.id=id;
	 }
	 public void setBrand(String brand) {
		 this.getBrand();
		 
	 }
	 
	 public void setModel(String model) {
		 this.model= model;
	 }
	 public void setMileage(double mileage) {
		 this.mileage=mileage;
	 }
	 

public class Bike{
	
	public static  Vehicles  searchbyid(List <Vehicles> l,int searchid ) {
		for(Vehicles v:l) {
			if(v.getId()== searchid) {
				return v;
			}
		}
		System.out.println("no bike found");
	
		return null;

	}
	
	public static Bike  seaarchbybrand(List <Vehicles> N,String searchBrand) {
		double mileagee=0.0;
		int count=0;
		for(Vehicles S:N) {
			if(S.getBrand().equalsIgnoreCase(searchBrand)) {
				mileagee+=S.getMileage();
				count++;
				
			}
			if(count==0) {
				System.out.println("Brand not found");
			}
			else {
				System.out.println(mileagee/count);
			}
		}
		
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	 
		
	
	
	

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List <Vehicles> mlist= new ArrayList<>();
		
	try {	System.out.println("how many vehicles u want to add : ");
	     int n= sc.nextInt();
		sc.nextLine();
		  int id= sc.nextInt();
		  sc.nextLine();
		  String Brand= sc.nextLine();
		  String model= sc.nextLine();
		  double mileage= sc.nextDouble();

		mlist.add(new Vehicles(id,Brand,model,mileage));
		
	
		int searchid= sc.nextInt();
	Vehicles result	=searchbyid(mlist,searchid);
		
		
	
	if(result!=null) {
		System.out.println(result.getId());
		System.out.println(result.getBrand());
		System.out.println(result.getModel());
		System.out.println(result.getMileage());
		
		
		
	}
	
	String searchBrand=sc.nextLine();
	seaarchbybrand(mlist,searchBrand);
	
	}catch(NumberFormatException e) {
		System.out.println("number not found exception");
	}catch(InputMismatchException e) {
		System.out.println("input miss match");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
}