package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        Contact c1 = new Contact("Guru","Hanchinmani","Hubli",591304,"9964333333");
        Contact c2 = new Contact("vinit","kishan","athani",591305,"88333333");
        Contact c3 = new Contact("kishan","kulkarni","jkd",58585,"777779999");

        contactList.add(c1);
        contactList.add(c2);
        contactList.add(c3);

        TextFileReadWrite object = new TextFileReadWrite();
        object.writeToFileDestination(contactList);

        object.readFromFileDestination();
    }
}
