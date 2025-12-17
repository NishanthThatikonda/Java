package Practice;
import java.util.*;
class Laptop {
    private int id;
    private String company;
    private String model;
    private double price;

    // Constructor
    public Laptop(int id, String company, String model, double price) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return id + "\n" + company + "\n" + model + "\n" + price;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Laptop[] laptops = new Laptop[n];

        
        // Reading Laptop objects
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine().trim());
            String company = sc.nextLine().trim();
            String model = sc.nextLine().trim();
            double price = Double.parseDouble(sc.nextLine().trim());

            laptops[i] = new Laptop(id, company, model, price);
        }

        int searchId = Integer.parseInt(sc.nextLine().trim());
        String companyName = sc.nextLine().trim();

        Laptop result = searchById(laptops, searchId);
        if (result != null) {
            System.out.println(result.toString());
        }

        double average = findAveragePrice(laptops, companyName);
        if (average != 0.0) {
            System.out.println(average);
        }
    }

    public static Laptop searchById(Laptop[] laptops, int id) {
        for (Laptop laptop : laptops) {
            if (laptop.getId() == id) {
                return laptop;
            }
        }
        System.out.println("No Laptop Found");
        return null;
    }

    public static double findAveragePrice(Laptop[] laptops, String company) {
        double sum = 0.0;
        int count = 0;

        for (Laptop laptop : laptops) {
            if (laptop.getCompany().equalsIgnoreCase(company)) {
                sum += laptop.getPrice();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No Laptop by Company");
            return 0.0;
        }

        return sum / count;
    }
}
