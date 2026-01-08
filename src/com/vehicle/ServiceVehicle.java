package com.vehicle;

public class ServiceVehicle extends Vehicle {
    String centerName;
    String category;

    public ServiceVehicle(String cn, String c, String on, String vn, String vt) {
        super(on, vn, vt);
        this.centerName = cn;
        this.category = c;
    }

    public void updateCenterName(String newName) {
        if (newName == null || newName.trim().equals("")) {
            System.out.println("Enter valid center name");
        } else {
            centerName = newName;
            System.out.println("Center name updated successfully");
        }
    }

    public void updateCategory(String newCategory) {
        if (newCategory == null || newCategory.trim().equals("")) {
            System.out.println("Enter valid category");
        } else {
            category = newCategory;
            System.out.println("Category updated successfully");
        }
    }

    public void display() {
        System.out.println("Owner name   : " + ownerName);
        System.out.println("Vehicle name : " + vehicleName);
        System.out.println("Vehicle type : " + vehicleType);
        System.out.println("Center name  : " + centerName);
        System.out.println("Category     : " + category);
    }
}
