
package bfsi;
import java.util.HashMap;

public class HashMapEmp {
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();

        h1.put(1, "analyst");
        h1.put(2, "manager");

        h2.put(1, 2000);
        h2.put(2, 5000);

       
        int managerId = 2;
        int currentSalary = h2.get(managerId);
        int newSalary = currentSalary + 5000;

      
        HashMap<Integer, Integer> updatedSalaries = new HashMap<>(h2);
        updatedSalaries.put(managerId, newSalary);

        System.out.println(updatedSalaries.get(managerId));

    }
}