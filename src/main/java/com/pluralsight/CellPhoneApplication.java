package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone myCellPhone = new CellPhone();

        System.out.print("What is the serial number : ");
        myCellPhone.setSerialNumber(myScanner.nextInt());

        myScanner.nextLine(); //consumes the newline character

        System.out.print("What model is the phone : ");
        myCellPhone.setPhoneModel(myScanner.nextLine());

        System.out.print("Who is the carrier : ");
        myCellPhone.setPhoneCarrier(myScanner.nextLine());

        System.out.print("What is the phone number : ");
        myCellPhone.setPhoneNumber(myScanner.nextLine());

        System.out.print("Who is the owner of the phone : ");
        myCellPhone.setPhoneOwner(myScanner.nextLine());

        System.out.println("Owner : " + myCellPhone.getPhoneOwner());
        System.out.println("Phone Number : " + myCellPhone.getPhoneNumber());
        System.out.println("Phone Model : " + myCellPhone.getPhoneModel());
        System.out.println("Phone Carrier : " + myCellPhone.getPhoneCarrier());
        System.out.println("Phone Serial Number : " + myCellPhone.getSerialNumber());

    }
}
