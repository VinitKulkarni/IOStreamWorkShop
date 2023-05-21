package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextFileReadWrite {
    //path
    static final String FILE_PATH = "C:\\Users\\vinit\\IdeaProjects\\ReviewIO\\src\\main\\java\\com\\bridgelabz\\sample.txt";

    //write method
    public static void writeToFileDestination(List<AddressBook> addressBookList) {
        StringBuffer contactStringBuffer = new StringBuffer();
        addressBookList.forEach(addressBook -> {
            String contactString = addressBook.toString().concat("\n");
            contactStringBuffer.append(contactString);
        });

        try {
            Files.write(Paths.get(FILE_PATH), contactStringBuffer.toString().getBytes());
        }catch(IOException e){
            System.out.println(e);
        }
        /*if(contactStringBuffer != null){
            System.out.println("File Writing Completed");
        }*/
    }


    //read method
    public static void readFromFileDestination(){
        StringBuffer storeContactStringBuffer = new StringBuffer();
        String readData;
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((readData = bufferedReader.readLine()) != null){
                storeContactStringBuffer.append(readData.concat("\n"));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data From Given File....");
        System.out.println(storeContactStringBuffer);
    }
}
