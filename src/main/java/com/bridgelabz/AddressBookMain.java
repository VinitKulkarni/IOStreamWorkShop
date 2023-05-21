package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    /*static void writeToFile(List<AddressBook> addressBooks){
        for (AddressBook addressBook: addressBooks) {
            TextFileReadWrite.writeToFileDestination();
        }
    }*/
    public static void main(String[] args) {
        List<AddressBook> addressBooks = new ArrayList<>();
        AddressBook addressBook1 = new AddressBook("family");
        AddressBook addressBook2 = new AddressBook("friends");

        Contact c1 = new Contact("Guru","Hanchinmani","Hubli",591304,"9964333333");
        Contact c2 = new Contact("vinit","kishan","athani",591305,"88333333");
        Contact c3 = new Contact("kishan","kulkarni","jkd",58585,"777779999");


        addressBook1.contactList.add(c1);
        addressBook1.contactList.add(c2);

        addressBook2.contactList.add(c3);

        addressBooks.add(addressBook1);
        addressBooks.add(addressBook2);
        TextFileReadWrite.writeToFileDestination(addressBooks);
    }
}
