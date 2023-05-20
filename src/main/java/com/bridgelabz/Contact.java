package com.bridgelabz;

public class Contact {
    String firstName;
    String lastName;
    String city;
    int zip;
    String phoneNumber;

    public Contact(String firstName, String lastName, String city, int zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
