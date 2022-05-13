package com.bridgelabz;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class AddressBookSystem {
    //Creating array List
    static ArrayList<Contacts> contactsDetails = new ArrayList();
    //Taking Scanner Class Object
    static Scanner sc = new Scanner(System.in);

    /*
    Create addDetails method
    create info contact Class object
     */
    public void addDetails() {
        Contacts info = new Contacts();
        System.out.println("Enter your First Name");
        info.setFirstName(sc.next());

        System.out.println("Enter Last Name");
        info.setLastName(sc.next());

        System.out.println("Enter Your Address");
        info.setAddress(sc.next());

        System.out.println("Enter your city");
        info.setCity(sc.next());

        System.out.println("Enter your State");
        info.setState(sc.next());

        System.out.println("Enter your zip Code");
        info.setZip(sc.next());

        System.out.println("Enter your Contacts Number");
        info.setContactNo(sc.next());

        System.out.println("Enter your Email Id");
        info.setEmail(sc.next());

        contactsDetails.add(info);
        System.out.println("Contacts details added");
    }

    public void dispalyConatcts() {
        for (Contacts contactsDetailsValue : contactsDetails) {
            System.out.println(contactsDetailsValue);
            System.out.println("---------------------------");
        }

    }

    /*
        Another method is to create editDetails
        Edit details you want to editing in the respective information by using switch case
     */
    public void editDetails() {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        // taking for each loop
        for (Contacts contact : contactsDetails) {
        // taking name variable and store the first name that you want to edit
            String name = contact.getFirstName();
        // checking if condition your input first name is equal to search first name or not by equals function
        System.out.println(name);
        if (name.equals(searchFirstName)) {
            System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                    "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
            System.out.println("Enter value to update: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the first name You want to update");
                    String updatedFirstName = sc.next();
                    contact.setFirstName(updatedFirstName);
//                    dispalyConatcts();
                    break;
                case 2:
                    System.out.println("Enter the Last NAme You want to update");
                    String updatedLastName = sc.next();
                    contact.setLastName(updatedLastName);
//                    dispalyConatcts();
                    break;
                case 3:
                    System.out.println("Enter the Address You want to update");
                    String updatedAddress = sc.next();
                    contact.setAddress(updatedAddress);
//                    dispalyConatcts();
                    break;
                case 4:
                    System.out.println("Enter the City You want to update");
                    String updatedCity = sc.next();
                    contact.setCity(updatedCity);
//                    dispalyConatcts();
                    break;
                case 5:
                    System.out.println("Enter the State You want to update");
                    String updatedState = sc.next();
                    contact.setState(updatedState);
//                    dispalyConatcts();
                    break;
                case 6:
                    System.out.println("Enter the Zip code You want to update");
                    String updatedZipCode = sc.next();
                    contact.setZip(updatedZipCode);
//                    dispalyConatcts();
                    break;
                case 7:
                    System.out.println("Enter the Contact numberYou want to update");
                    String updatedContact = sc.next();
                    contact.setContactNo(updatedContact);
//                    dispalyConatcts();
                    break;
                case 8:
                    System.out.println("Enter the email You want to update");
                    String updatedEmail = sc.next();
                    contact.setEmail(updatedEmail);
//                    dispalyConatcts();
                    break;
                default:
                    System.out.println("Invalid number!");
            }
            System.out.println("details updated");
        } else
            System.out.println("No record found!");

    }


}
    public void deleteContact()
    {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();

        Iterator<Contacts> removeContact = contactsDetails.iterator();
        /*  Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()){
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname) ) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            }
            else {
                System.out.println("Contact not found.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Address book System project......:-)");

        AddressBookSystem addressDetails = new AddressBookSystem();
        while (true){
            System.out.println("Enter the no as u want too choose to perform the certain task");
            System.out.println("1. Add Deatils \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            int chooseNumber;
            chooseNumber = sc.nextInt();
            switch (chooseNumber){
                case 1:
                    addressDetails.addDetails();
                    System.out.println("Added Successfully");
                    break;
                case 2:
                    System.out.println("Edit Successfully");
                    addressDetails.editDetails();
                    break;
                case 3:
                    System.out.println("Delete Details");
                    addressDetails.deleteContact();
                    break;
                case 4:
                    System.out.println("Display details");
                    addressDetails.dispalyConatcts();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
        }


    }

}
