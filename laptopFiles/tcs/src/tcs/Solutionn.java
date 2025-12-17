package tcs;
import java.util.*;
 class Raju {

	 private static int orderid;
	 private String ordername;
	 private int noofproducts;
	 List<String> products;
	 List <Integer> quantities;
	 
	 public Raju( int orderid, String ordername,int noofproducts, List<String> products,List <Integer> quantities) {
		 this.orderid=orderid; 
		 this.ordername=ordername;
		 this.noofproducts=noofproducts;
		 this.products=products;
		 this.quantities=quantities;
	 }
		//getters
		 
		public static    int getOrderid() {
			 return orderid;
		 }
		 
		 public  void setOrderid(int orderid) {
			 this.orderid=orderid;	 
		 }
		 
		 public  String getOrdername() {
			return ordername;

}
		public  void setOrdername(String ordername) {
			this.ordername=ordername;
		}
		
		public int getNoofproducts() {
			return noofproducts;
		}
		public void setNoofproducts() {
			this.noofproducts=noofproducts;
		}
		
		
		public List<String> getProducts(){
			return products;
		}
		
		public void setProducts(List<String> products) {
			this.products=products;
			
		}
		
		public List<Integer> getQuantities(){
			return quantities;
		}
		public void setQuantities(List<Integer> quantities) {
			this.quantities=quantities;
		}

		
}

public class Solutionn{
	
	public  String maximumquantity(Raju[] anil,int orderid) {
		for(int i=0;i<anil.length;i++) {
			if(Raju.getOrderid()==orderid) {
				List<String> products=anil[i].getProducts();
				List<Integer> quantities=anil[i].getQuantities();
				if(products.size()==0) {
					return null;
				}
				int maxindex=0;
				for(int j=1;j<quantities.size();j++) {
					if(quantities.get(j)>quantities.get(maxindex)){
						maxindex=j;
					}
				}
				return products.get(maxindex);
			}
		}
		return null;
	}
	
	public  void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		
		Raju[] raj= new Raju[n];
		for(int i=0; i<n; i++) {
			int orderid=sc.nextInt();
			sc.nextLine();
			String ordername=sc.nextLine();
			int noofproducts= sc.nextInt();
			sc.nextLine();
			List<String> products=new ArrayList<String>();
			List<Integer>quantities= new ArrayList<Integer>();
			
			for(int j=0; j<noofproducts; j++) {
				String product= sc.nextLine();
				int quantity= sc.nextInt();
				products.add(product); 
				quantities.add(quantity);
			}
			raj[i]=new Raju(orderid,ordername,noofproducts,products,quantities);
		}
		int searchid= sc.nextInt();
		sc.nextLine();
		Solutionn obj=new Solutionn();
		
		 String maxProduct = obj.maximumquantity(raj, searchid);
	        if (maxProduct != null)
	        {
	            System.out.println(maxProduct);
	        }
	        else
	        {
	            System.out.println("Order Id Not Found");
	        }
	}
}
