package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class ContactManagerShort {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add  2. Update  3. Retrieve  4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt(); sc.nextLine(); // consume newline

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    if (contacts.containsKey(phone))
                        System.out.println("Already exists!");
                    else {
                        contacts.put(phone, name);
                        System.out.println("Contact added.");
                    }
                    break;

                case 2:
                    if (contacts.containsKey(phone)) {
                        System.out.print("New Name: ");
                        contacts.put(phone, sc.nextLine());
                        System.out.println("Contact updated.");
                    } else System.out.println("Contact not found.");
                    break;

                case 3:
                    if (contacts.containsKey(phone))
                        System.out.println("Name: " + contacts.get(phone));
                    else System.out.println("Contact not found.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
    
    }
}
}