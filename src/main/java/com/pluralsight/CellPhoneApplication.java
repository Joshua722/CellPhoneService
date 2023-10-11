package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone myCellPhone = new CellPhone();
        CellPhone myCellPhone2 = new CellPhone(4589321,"samsung","ATT", "94001558", "John");

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

        myCellPhone.dial(myCellPhone.getPhoneNumber());
        myCellPhone2.dial(myCellPhone2.getPhoneNumber());

        display(myCellPhone,myCellPhone2);
        display(myCellPhone,myCellPhone2);


        }
        public static void display(CellPhone myCellPhone, CellPhone myCellPhone2) {
            System.out.println(myCellPhone.getPhoneOwner() + " 's phone is calling " + myCellPhone2.getPhoneNumber());
            System.out.println("Owner : " + myCellPhone.getPhoneOwner());
            System.out.println("Phone Number : " + myCellPhone.getPhoneNumber());
            System.out.println("Phone Model : " + myCellPhone.getPhoneModel());
            System.out.println("Phone Carrier : " + myCellPhone.getPhoneCarrier());
            System.out.println("Phone Serial Number : " + myCellPhone.getSerialNumber());


    }
}
