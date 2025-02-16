package PRA;

import java.util.*;

import java.util.Scanner;

class Collage {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    public Collage(int id, String name, int contactNo, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getcontact() {
        return contactNo;
    }

    public void setcontact(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getaddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getpincode() {
        return pincode;
    }

    public void setpinCode(int pincode) {
        this.pincode = pincode;
    }

}

public class PRA1 {
    public static Collage findCollegeWithMaximumPincode(Collage[] c) {
        int maxi = Integer.MIN_VALUE;
        Collage maxCollage = null;
        for (Collage collage : c) {
            if (collage.getpincode() > maxi) {
                maxi = collage.getpincode();
                maxCollage = collage;
            }
        }
        return maxCollage;
    }

    public static Collage searchCollegeByAddress(Collage[] c, String search) {
        Collage result = null;
        for (Collage collage : c) {
            if (collage.getaddress().equalsIgnoreCase(search)) {
                result = collage;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of collage");
        int num = sc.nextInt();
        sc.nextLine();
        Collage[] collage = new Collage[num];
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();
            collage[i] = new Collage(a, b, c, d, e);
        }

        Collage cop = findCollegeWithMaximumPincode(collage);
        if (cop != null) {
            System.out.println("ID " + cop.getId());
            System.out.println("name " + cop.getName());
            System.out.println("contact " + cop.getcontact());
            System.out.println("address " + cop.getaddress());
            System.out.println("pincode " + cop.getpincode());
        } else {
            System.out.println("null");
        }

        System.out.println("Enter the collage name to find");
        String search = sc.nextLine();

        Collage sameaddress = searchCollegeByAddress(collage, search);
        if (sameaddress != null) {
            System.out.println("ID " + sameaddress.getId());
            System.out.println("name " + sameaddress.getName());
            System.out.println("contact " + sameaddress.getcontact());
            System.out.println("address " + sameaddress.getaddress());
            System.out.println("pincode " + sameaddress.getpincode());
        } else {
            System.out.println("No such collage find");
        }

    }
}