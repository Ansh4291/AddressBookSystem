package com.bridgelabz;

public class AddressBookSystem {
    public static void main(String[] args) {

        System.out.println("Welcome to the Address book System project......:-)");

        Contacts contacts = new Contacts( );
        contacts.setFirstName("Anshul");
        System.out.println(contacts.getFirstName());
        contacts.setLastName("Rathore");
        System.out.println(contacts.getLastName());
        contacts.setAddress("Talwandi");
        System.out.println(contacts.getAddress());
        contacts.setCity("Kota");
        System.out.println(contacts.getCity());
        contacts.setState("Rajasthan");
        System.out.println(contacts.getState());
        contacts.setZip("324005");
        System.out.println(contacts.getZip());
        contacts.setContactNo("8764314432");
        System.out.println(contacts.getContactNo());
        contacts.setEmail("anshulrathore1995@gmail.com");
        System.out.println(contacts.getEmail());

    }
}
