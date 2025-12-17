package tcs;

import java.util.*;

class Lap {
    private int id;
    private String company;
    private String model;
    private double price;


    public Lap(int id, String company, String model, double price) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
    }

  
    	
    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

public class Laptop {

    public static List<Lap> searchById(List<Lap> laptops, int id) {
    	List<Lap>jj=new ArrayList<>();
        for (Lap l : laptops) {
            if (l.getId() == id) {
                jj.add(l);
            }
        }
        return jj;
    }

    public static void averagePriceByCompany(List<Lap> laptops, String company) {
        double total = 0;
        int count = 0;

        for (Lap l : laptops) {
            if (l.getCompany().equalsIgnoreCase(company)) {
                total = total+ l.getPrice();
                count++ ;
              
            }
        }

        if (count == 0) {
            System.out.println("No Laptop by Company");
           
        } else {
            System.out.println(total / count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Lap> laptops = new ArrayList<>();

        try {
            int n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                int id = Integer.parseInt(sc.nextLine());
                String company = sc.nextLine();
                String model = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());

                laptops.add(new Lap(id, company, model, price));
            }

            int searchId = Integer.parseInt(sc.nextLine());
            List<Lap> i = searchById(laptops, searchId);
            if(!i.isEmpty()) {
          for(Lap result: i) {
                System.out.println(result.getId());
                System.out.println(result.getCompany());
                System.out.println(result.getModel());
                System.out.println(result.getPrice());
            } }else {
                System.out.println("No Laptop Found");
            }

            String searchCompany = sc.nextLine();
            averagePriceByCompany(laptops, searchCompany);

        } catch (Exception e) {
            System.out.println("Invalid input. Please check and try again.");
        } finally {
            sc.close();
        }
    }
}
