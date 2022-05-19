package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Operations {
    //Creating array List
    static ArrayList<Contacts> contactsDetails = new ArrayList();
    //Taking Scanner Class Object
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
//    method For Adding Multiple Address Book
    public static void AddressBook(Operations operations) {
        int num;
        do {
            System.out.println("Enter Name For Address Book");
            String AddressBookName = sc.next();
            if (hashmap.containsKey(AddressBookName)) {
                System.out.println("The AddressBook already contains");
                break;
            } else {
                ArrayList<Contacts> contactDetails = new ArrayList<>();
                operations.menuChoose(operations, contactDetails);
                hashmap.put(AddressBookName, contactDetails);
            }
            System.out.println("AddressBook Added" + hashmap + " ");
            System.out.println("Do You Want To Continue the Press 1");
            num = sc.nextInt();
        } while (num == 1);

    }
 /*
    Create addDetails method
    create info contact Class object
     */

    public static ArrayList<Contacts> addDetails(ArrayList<Contacts> contactsDetails) {
        Contacts info = new Contacts();
        if (contactsDetails.size() == 0) {

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
        } else {
            System.out.println("Enter your first name");
            String firstName = sc.next();
            /*
            For searching the duplicate names in arraylist
             */
            for (Contacts contacts : contactsDetails) {

//                checking the duplicate name.

                if (contacts.getFirstName().equals(firstName)) {
                    System.out.println("Your Name is already present ");
                    Operations.addDetails(contactsDetails);
                }
            }
            {
                info.setFirstName(sc.next());
                System.out.println("Enter Last Name");
                info.setLastName(sc.next());
                System.out.println("Enter contact Number:");
                info.setContactNo(sc.next());
                System.out.println("Enter Email: ");
                info.setEmail(sc.next());
                System.out.println("Enter Address: ");
                info.setAddress(sc.next());
                System.out.println("Enter City Name: ");
                info.setCity(sc.next());
                System.out.println("Enter State: ");
                info.setState(sc.next());
                System.out.println("Enter Zip Code:");
                info.setZip(sc.next());
                contactsDetails.add(info);
            }
        }
        return contactsDetails;
    }
    public void dispalyConatcts(ArrayList<Contacts> contactsDetails) {
        for (Contacts contactsDetailsValue : Operations.contactsDetails) {
            System.out.println(contactsDetailsValue);
            System.out.println("---------------------------");
        }
    }
    /*
        Another method is to create editDetails
        Edit details you want to editing in the respective information by using switch case
     */
    public void editDetails(ArrayList<Contacts> contactsDetails) {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        // taking for each loop
        for (Contacts contact : Operations.contactsDetails) {
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

    public void deleteContact(ArrayList<Contacts> contactsDetails) {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();

        Iterator<Contacts> removeContact = Operations.contactsDetails.iterator();
        /*  Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()) {
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }
    public static void menuChoose(Operations operations, ArrayList<Contacts> contactDetails){
        Scanner sc = new Scanner(System.in);

        int chooseNumber;
        do {
            System.out.println("Enter the no as u want too choose to perform the certain task");
            System.out.println("1. Add Deatils \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber){
                /*  Add contact details in address book */
                case 1:
                    System.out.println("Add Details");
                    operations.addDetails(contactsDetails);
                    break;
                case 2:
                    /*  Edit contact details in address book */
                    System.out.println("Edit details");
                    operations.editDetails(contactsDetails);
                    break;
                /*  Delete contact details */
                case 3:
                    System.out.println("Delete Details");
                    operations.deleteContact(contactsDetails);
                    break;
                /*  Display contact details */
                case 4:
                    System.out.println("Display details");
                    operations.dispalyConatcts(contactsDetails);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
        }while (chooseNumber !=5 );
    }
}