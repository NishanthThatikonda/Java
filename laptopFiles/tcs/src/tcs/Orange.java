package tcs;
import java.util.*;
class Order{
	private int orderid;
	private String ordername;
	private int noofproducts;
	List<String> products;
	List<Integer> quantities;
	
	

	public Order(int orderid, String ordername, int noofproducts, List<String> products, List<Integer> quantities) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.noofproducts = noofproducts;
		this.products = products;
		this.quantities = quantities;
	}
	
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	
	public void setProducts(List<String> products) {
		this.products=products;
	}
	public List<String> getProducts(){
		return products;
	}
	
	public List<Integer> getQuantities() {
		return quantities;
	}
	public void setQuantities(List<Integer> quantities) {
		this.quantities = quantities;
	}
	
}









public class Orange {

public    String	 searchbyid(List<Order> list1,int orderid) {
	int maxquant=0;
	String maxproduct=null;
	for(Order l:list1) {
		if(l.getOrderid()==orderid) {
			List<String> product= l.getProducts();
			List<Integer> quantity= l.getQuantities();
			if(product==null || product.isEmpty() || quantity==null || quantity.isEmpty()) {
				System.out.println("order id not found");
				return null;
			}
			
			for(int i=0;i<quantity.size();i++) {
				if(quantity.get(i)>maxquant ) {
					maxquant=quantity.get(i);
					maxproduct=product.get(i);
					
				}
				
			}
			return maxproduct;
		}
	}
	System.out.println("id not found");
	return null;
	
	
}
	
	
	

    public static List<Order> findOrdersByProductName(List<Order> ordersList, String productToSearch) {
        List<Order> result = new ArrayList<>();

        for (Order order : ordersList) {
        	List<String> pro=order.getProducts();
            for (String product :pro ) {
                if (product.equalsIgnoreCase(productToSearch)) {
                    result.add(order);
                    break;
                }
            }
        }

        return result;
    }

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> Mlist=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			
			 int orderid =sc.nextInt();
			 sc.nextLine();
			 
			 String ordername= sc.nextLine();
			 int noofproducts=sc.nextInt();
			 sc.nextLine();
			List<String> products= new ArrayList<>();
			List<Integer> quantities= new ArrayList<>();
			for(int j=0;j<noofproducts;j++) {
				String prod=sc.nextLine();
				int quant=sc.nextInt();
				sc.nextLine();
				products.add(prod);
				quantities.add(quant);
				
			}
			
			Mlist.add(new Order( orderid,  ordername,  noofproducts, products, quantities));
			
		}
		int orderid=sc.nextInt();
		sc.nextLine();
		Orange or=new Orange();
		String result=or.searchbyid(Mlist,orderid);
		if(result !=null) {
			System.out.println(result);
		}
		
		  String productToSearch = sc.nextLine();
		  
		 // Orange.OrdersService service = new Orange().new OrdersService();
	        List<Order> result2 = findOrdersByProductName(Mlist, productToSearch);

	        if (result2.isEmpty()) {
	            System.out.println("Product Not Found");
	        } else {
	            for (Order order : result2) {
	                System.out.println(order.getOrderid());
	                System.out.println(order.getOrdername());
	            }
	        }
	
		
	}









	











}
