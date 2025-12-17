package tcs;

import java.util.*;


class Product{
	private  int orderid;
	private String orderName;
	private int noofproducts;
	private Map<String, Integer> productquantity;

public Product(int orderid,String orderName,int noofproducts,Map<String, Integer> productquantity) {

	this.orderid=orderid;
	this.orderName=orderName;
	this.noofproducts=noofproducts;
	this.productquantity=productquantity;
}


public void setProductquantity(Map<String, Integer> productquantity) {
	this.productquantity=productquantity;

}
public Map<String, Integer> getProductquantity(){
	return productquantity;
}

public void setOrderid( int orderid) {
	this.orderid=orderid;

}


public int getOrderid() {
	return orderid;
}


public String getOrderName() {
	return orderName;
}


public void setOrderName(String orderName) {
	this.orderName = orderName;
}


public int getNoofproducts() {
	return noofproducts;
}


public void setNoofproducts(int noofproducts) {
	this.noofproducts = noofproducts;
}

public void display() {
    System.out.println("Order ID: " + orderid);
    System.out.println("Order Name: " + orderName);
    System.out.println("Number of Products: " + noofproducts);
    for (Map.Entry<String, Integer> entry : productquantity.entrySet()) {
        System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
    }
}



}



public class  MapppFindproductbyID{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Product> Mmap=new HashMap<>();
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			
			int orderid=sc.nextInt();
			sc.nextLine();
			String orderName= sc.nextLine();
			int noofproducts=sc.nextInt();
			sc.nextLine();
			Map<String, Integer> productquantity= new HashMap<>();
			for(int j=0; j<noofproducts; j++) {
				String pname=sc.nextLine();
				int pquanty=sc.nextInt();
				sc.nextLine();
				productquantity.put(pname,pquanty);
				
			}
			
			Product p= new Product( orderid, orderName, noofproducts, productquantity) ;
			Mmap.put(orderid,p);
		}
		
		  System.out.println("Enter order ID to search:");
	        int searchId = Integer.parseInt(sc.nextLine());

	        if (Mmap.containsKey(searchId)) {
	            Mmap.get(searchId).display();
	        } else {
	            System.out.println("Order not found.");
	        }

	        sc.close();
		
		
	}

}

