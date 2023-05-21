package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contactList;
    String addressBookName;

    public AddressBook(String addressBookName){
        contactList = new ArrayList<>();
        this.addressBookName = addressBookName;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                ", addressBookName='" + addressBookName + '\'' +
                '}';
    }
}
