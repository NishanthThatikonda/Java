package tcs;

import java.util.*;

class Time {
    private int orderId;
    private String company;
    private int noofproducts;
    private List<String> productname;
    private List<Integer> productprice;

    public Time(int orderId, String company, int noofproducts, List<String> productname, List<Integer> productprice) {
        this.orderId = orderId;
        this.company = company;
        this.noofproducts = noofproducts;
        this.productname = productname;
        this.productprice = productprice;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Integer> getProductprice() {
        return productprice;
    }

	public List<String> getProductname() {
		return productname;
	}

	public void setProductname(List<String> productname) {
		this.productname = productname;
	}

	public String getcompany() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
   
    






	public static float Averageprice(List<Time> Mlis, int manufactureid) {
        float avg = 0.0f;
        int count = 0;

        for (Time t : Mlis) {
            if (t.getOrderId() == manufactureid) {
                List<Integer> priceList = t.getProductprice();
                count = priceList.size();

                for (int price : priceList) {
                    avg = avg+price;
                }

                if (count > 0) {
                    return avg / count;
                }
            }
        }

        return 0.0f;
    }
    
    
    public static String manufacturer(List<Time> Mlist,String ProductName) {
    	String name=null;
    	for(Time u:Mlist) {
    		if(u.getProductname().contains(ProductName)) {
    			List<String>comp=u.getProductname();
    		}
    		
			for(String j: u.getProductname()) {
    			if(ProductName.equalsIgnoreCase(j)) {
    				name=u.getcompany();
    				System.out.println(name);
    			}
    			if(name==null) {
    				System.out.println("product not found");
    			
    		}
			
			}
    	}
		return null;
      
    }

    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> Mlist = new ArrayList<>();

        System.out.println("Enter how many orders you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Order ID:");
            int orderId = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.println("Enter Company Name:");
            String company = sc.nextLine();

            System.out.println("Enter number of products:");
            int noofproducts = sc.nextInt();
            sc.nextLine(); // Consume newline

            List<String> productname = new ArrayList<>();
            List<Integer> productprice = new ArrayList<>();

            for (int j = 0; j < noofproducts; j++) {
                System.out.println("Enter Product Name:");
                String product = sc.nextLine();
                productname.add(product);

                System.out.println("Enter Product Price:");
                int price = sc.nextInt();
                sc.nextLine(); // Consume newline
                productprice.add(price);
            }

            Time obj = new Time(orderId, company, noofproducts, productname, productprice);
            Mlist.add(obj);
        }

        System.out.println("Enter Order ID to find average price:");
        int manufactureid = sc.nextInt();

        float avg = Averageprice(Mlist, manufactureid);

        if (avg > 0.0f) {
            System.out.println("Average Price: " + avg);
        } else {
            System.out.println("Manufacturer not found or no products available.");
        }

        System.out.println("Enter Order productName to find manufacturers:");
       String ProductName = sc.nextLine();
        
        sc.close();
    }
}
