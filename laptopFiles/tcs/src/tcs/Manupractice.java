package tcs;

import java.util.*;
class Manufacturer{
	private int Manufacturerid;
	private String Manufacturername;
	private int noofproducts;
	private List<String> products;
	private List<Integer> prices;
	
	
	
	public Manufacturer(int Manufacturerid,String Manufacturername,int noofproducts,List<String> products,List<Integer> prices) {
		this.Manufacturerid=Manufacturerid;
		this.Manufacturername=Manufacturername;
		this.noofproducts=noofproducts;
		this.products=products;
		this.prices=prices;
	}
	
	
	public int getManufacturerid() {
		return Manufacturerid;
	}
	
	public String getManufacturerName() {
		return Manufacturername;
	}
	
	
	public List<String>  getProducts() {
		return products;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	
	
	public List<Integer>  getPrices() {
		return prices;
	}
	
	
	public void setManufacturerid(int Manufacturerid) {
	
	this.Manufacturerid=Manufacturerid;
}

	public void setManufacturerName(String Manufacturername) {
		
		this.Manufacturername=Manufacturername;
	}

public void setNoofproducts(int noofproducts) {
		
	this.noofproducts=noofproducts;

	}

public void setProducts(List<String> products ) {
	
	this.products=products;
	}


public void setPrices(List<Integer> prices ) {
	this.prices=prices;

	}





}


public class Manupractice {

	
	public static  String  searchbyid(List<Manufacturer> list1,int searchid) {
		int total=0;
		int count=0;
		for(String l:list1) {
			if(l.getManufacturerid()==searchid) {
				List<Integer> prices =l.getPrices();
				for(int j:prices) {
					
					total += j;
				}
				count=prices.size();
				if(count==0) {
					System.out.println("no manufacture found");
				}else {
					System.out.println(total/count);
				}
				return l;
			}
		}
		System.out.println("no manufacture found");
	         return null;
	}
	
	
	
	public static  Manufacturer searchbyname(List<Manufacturer> list2,String searchname) {
		boolean found=false;
		for(Manufacturer m:list2) {
			
			if(m.getProducts().contains(searchname)){
		
			 System.out.println(m.getManufacturerName());  
				 found=true;
				
			}
			
			}
		if(!found) {
			System.out.println("not found");	
		
		}
		
		return null;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)throws Exception {
		List<Manufacturer> Mlist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
			try {int n=sc.nextInt();
			sc.nextLine();
		for(int i=0;i<n; i++) {
			int Manufacturerid=Integer.parseInt(sc.nextLine());
			String Manufacturername=sc.nextLine();
			int noofproducts=sc.nextInt();
			sc.nextLine();
			 List<String> products= new ArrayList<>();
			 List<Integer> prices= new ArrayList<>();
			 
			 
			  for (int j = 0; j < noofproducts; j++) {
			        String prod = sc.nextLine();
			        int pric = Integer.parseInt(sc.nextLine());
			        products.add(prod);
			        prices.add(pric);
			    }
				Mlist.add(new Manufacturer(Manufacturerid,Manufacturername,noofproducts,products,prices));
		}
			int searchid=sc.nextInt();
			sc.nextLine();
			searchbyid(Mlist,searchid);
			
			String searchname= sc.nextLine();
			searchbyname(Mlist,searchname);
			}catch(NumberFormatException e) {
				System.out.println(e);
			}
	}

}
