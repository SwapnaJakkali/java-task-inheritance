
package com.vehicle;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter center name: ");
        String cn = sc.nextLine();

        System.out.println("Enter category: ");
        String c = sc.nextLine();

        System.out.println("Enter owner name: ");
        String on = sc.nextLine();

        System.out.println("Enter vehicle name: ");
        String vn = sc.nextLine();

        System.out.println("Enter vehicle type: ");
        String vt = sc.nextLine();

        ServiceVehicle sv = new ServiceVehicle(cn, c, on, vn, vt);

        boolean notExit = true;

        while (notExit) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Update Service Category");
            System.out.println("2. Update Service Center");
            System.out.println("3. View Profile");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Enter new category:");
                    String newcategory = sc.nextLine();
                    sv.updateCategory(newcategory);
                    break;

                case 2:
                    System.out.println("Enter new center name:");
                    String name = sc.nextLine();
                    sv.updateCenterName(name);
                    break;

                case 3:
                    System.out.println("Your profile:");
                    sv.display();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    notExit = false;
                    break;

                default:
                    System.out.println("Please enter valid choice");
            }
        }

        sc.close();
    }
}

