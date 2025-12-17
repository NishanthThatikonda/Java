package Practice;



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

    public String getCompany() {
        return company;
    }
}

public class Manufact {

    public static float Averageprice(List<Time> Mlist1, int manufactureid) {
        float avg = 0.0f;
        int count = 0;

        for (Time t : Mlist1) {
            if (t.getOrderId() == manufactureid) {
                List<Integer> priceList = t.getProductprice();
                count = priceList.size();

                for (int price : priceList) {
                    avg += price;
                }

                if (count > 0) {
                    return avg / count;
                }
            }
        }

        return 0.0f;
    }

    public static void findManufacturer(List<Time> Mlist, String ProductName) {
        boolean found = false;
        for (Time u : Mlist) {
            for (String j : u.getProductname()) {
                if (ProductName.equalsIgnoreCase(j)) {
                    System.out.println("Manufacturer: " + u.getCompany());
                    found = true;
                }
            }
        }
        if (found==false) {
            System.out.println("Product not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> Mlist = new ArrayList<>();

        try {
            System.out.println("Enter how many orders you want to add:");
            int n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Enter Order ID:");
                int orderId = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Company Name:");
                String company = sc.nextLine();

                System.out.println("Enter number of products:");
                int noofproducts = Integer.parseInt(sc.nextLine());

                List<String> productname = new ArrayList<>();
                List<Integer> productprice = new ArrayList<>();

                for (int j = 0; j < noofproducts; j++) {
                    System.out.println("Enter Product Name:");
                    String product = sc.nextLine();
                    productname.add(product);

                    System.out.println("Enter Product Price:");
                    int price = Integer.parseInt(sc.nextLine());
                    productprice.add(price);
                }

                Time obj = new Time(orderId, company, noofproducts, productname, productprice);
                Mlist.add(obj);
            }

            System.out.println("Enter Order ID to find average price:");
            int manufactureid = Integer.parseInt(sc.nextLine());

            float avg = Averageprice(Mlist, manufactureid);

            if (avg > 0.0f) {
                System.out.println("Average Price: " + avg);
            } else {
                System.out.println("Manufacturer not found or no products available.");
            }

            System.out.println("Enter Product Name to find manufacturer:");
            String ProductName = sc.nextLine();
            findManufacturer(Mlist, ProductName);

        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        } finally {
            sc.close();
        }
    }
}
