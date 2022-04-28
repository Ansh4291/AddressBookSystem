package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

       ArrayList <Contacts> contactsDetails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public void addDetails(){
            Contacts info = new Contacts();
            System.out.println("Enter your First Name");
            info.setFirstName(sc.nextLine());

            System.out.println("Enter Last Name");
            info.setLastName(sc.nextLine());

            System.out.println("Enter Your Address");
            info.setAddress(sc.nextLine());

            System.out.println("Enter your city");
            info.setCity(sc.nextLine());

            System.out.println("Enter your State");
            info.setState(sc.nextLine());

            System.out.println("Enter your zip Code");
            info.setZip(sc.nextLine());

            System.out.println("Enter your Contacts Number");
            info.setContactNo(sc.nextLine());

            System.out.println("Enter your Email Id");
            info.setEmail(sc.nextLine());

            contactsDetails.add(info);
        }
        public void dispalyConatcts(){
            System.out.println(contactsDetails);
        }
    public static void main(String[] args) {

        System.out.println("Welcome to the Address book System project......:-)");

        AddressBookSystem person1 = new AddressBookSystem();
        person1.addDetails();
        person1.dispalyConatcts();
    }

}
