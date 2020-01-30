package arraysListsAutoboxingUnboxing.listsAndArrayLists.arrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private Scanner scanner = new Scanner(System.in);
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private String getMyNumber() {
        return myNumber;
    }

    private ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public void mobileOperations() {
        boolean quit = false;
        int option;
        String option1;
        printOperations();
        while (!quit) {
            option = scanner.nextInt();
            scanner.nextLine();
            String name;
            String number;
            switch (option) {
                case 1:
                    System.out.println("Enter name:");
                    name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    number = scanner.nextLine();
                    addContact(name, number);
                    printOperations();
                    break;
                case 2:
                    System.out.println("Enter name of the contact to be updated:");
                    name = scanner.nextLine();
                    updateContact(name);
                    printOperations();
                    break;
//                case 3:
//                    searchContact();
//                    printOperations();
//                    break;
//                case 4:
//                    deleteContact();
//                    printOperations();
//                    break;
                case 5:
                    printAllContact();
                    printOperations();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option!!! Try again with a valid option");
                    printOperations();

            }
        }
    }

    private void printOperations() {
        System.out.println("You can perform the operations on your mobile. Press the option corresponding the operation you would like to perform:");
        System.out.println("0 - Switch off\n" +
                "1 - Add new contact\n" +
                "2 - Update existing contact\n" +
                "3 - Search contact\n" +
                "4 - Delete contact\n" +
                "5 - Print contacts\n" +
                "6 - Quit");
    }

    private boolean checkContactExist(Contact newContact) {
        boolean present = false;
        for (Contact contact : getMyContacts()) {
            if (contact.getName().equalsIgnoreCase(newContact.getName())) {
//                if (contact.getPhoneNumber().equals(newContact.getPhoneNumber())) {
//                    present = true;
//                } else {
//                    present = false;
//                }
                present = true;
            } else {
                present = false;
            }
        }
        return present;
    }

    private boolean checkContactWithNameExist(String name) {
        boolean present = false;
        for (Contact contact : getMyContacts()) {
            if (contact.getName().equalsIgnoreCase(name)) {
                present = true;
            } else {
                present = false;
            }
        }
        return present;
    }

    private void addContact(String name, String number) {
        Contact contact = new Contact(name, number);
        if (checkContactWithNameExist(name)) {
            System.out.println("Error: Contact not added. Contact with same name and number already exist");
        } else {
            myContacts.add(contact);
            System.out.println("New contact has been added to Contacts");
        }
    }

    private void updateContact(String name) {
        if (checkContactWithNameExist(name)) {
            System.out.println("Enter name of the contact to be updated:");
            String number = scanner.nextLine();
            Contact contact = new Contact(name, number);
            int indexOfContact = 0;
            for (int i = 0; i < getMyContacts().size(); i++) {
                if (getMyContacts().get(i).getName().equalsIgnoreCase(name)) {
                    indexOfContact = i;
                    break;
                }
            }
            getMyContacts().add(indexOfContact, contact);
            System.out.println("Contact updated");
            printContact(indexOfContact);
        } else {
            System.out.println("No contact with the given name exist.");
        }
    }

    private void printContact(int contactIndex) {
        System.out.println("Name: " + getMyContacts().get(contactIndex).getName());
        System.out.println("Phone Number: " + getMyContacts().get(contactIndex).getPhoneNumber());
    }

    private void printAllContact() {
        for (int i = 0; i < getMyContacts().size(); i++) {
            printContact(i);
        }
    }

}