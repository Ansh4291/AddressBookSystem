package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBookSystem {
    //Creating array List
    ArrayList<Contacts> contactsDetails = new ArrayList<>();
    //Taking Scanner Class Object
    Scanner sc = new Scanner(System.in);
    /*
    Create addDetails method
    create info contact Class object
     */
    public void addDetails() {
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
    /*
        Another method is to create editDetails
        Edit details you want to editing in the respective information by using switch case
     */
    public void editDetails(String searchFirstName) {
        // taking for each loop
        for (Contacts contact : contactsDetails) {
            // taking name variable and store the first name that you want to edit
            String name = contact.getFirstName();
            // checking if condition your input first name is equal to search first name or not by equals function
            if (name.equals(searchFirstName)) {

            System.out.println("Enter the number to edit respective info: ");
            System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                    "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
            System.out.println("Enter value to update: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the first name You want to update");
                    String updatedFirstName = sc.next();
                    contact.setFirstName(updatedFirstName);
                    dispalyConatcts();
                    break;
                case 2:
                    System.out.println("Enter the Last NAme You want to update");
                    String updatedLastName = sc.next();
                    contact.setLastName(updatedLastName);
                    dispalyConatcts();
                    break;
                case 3:
                    System.out.println("Enter the Address You want to update");
                    String updatedAddress = sc.next();
                    contact.setAddress(updatedAddress);
                    dispalyConatcts();
                    break;
                case 4:
                    System.out.println("Enter the City You want to update");
                    String updatedCity = sc.next();
                    contact.setCity(updatedCity);
                    dispalyConatcts();
                    break;
                case 5:
                    System.out.println("Enter the State You want to update");
                    String updatedState = sc.next();
                    contact.setState(updatedState);
                    dispalyConatcts();
                    break;
                case 6:
                    System.out.println("Enter the Zip code You want to update");
                    String updatedZipCode = sc.next();
                    contact.setZip(updatedZipCode);
                    dispalyConatcts();
                    break;
                case 7:
                    System.out.println("Enter the Contact numberYou want to update");
                    String updatedContact = sc.next();
                    contact.setContactNo(updatedContact);
                    dispalyConatcts();
                    break;
                case 8:
                    System.out.println("Enter the email You want to update");
                    String updatedEmail = sc.next();
                    contact.setEmail(updatedEmail);
                    dispalyConatcts();
                    break;
                default:
                    System.out.println("Invalid number!");
            }
            }
                else{
                System.out.println("No record found!");

            }
        }

    }
            // create display contacts method to display the contact details
        public void dispalyConatcts(){
            System.out.println(contactsDetails);
        }
    public static void main(String[] args) {

        System.out.println("Welcome to the Address book System project......:-)");

        Scanner sc = new Scanner(System.in);
        AddressBookSystem person1 = new AddressBookSystem();
        person1.addDetails();
        person1.dispalyConatcts();
        System.out.println("Enter First Name for which you want to Edit info: ");
        String nameFirst = sc.next();
        person1.editDetails(nameFirst);






    }

}
