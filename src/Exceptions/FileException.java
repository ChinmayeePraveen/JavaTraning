package Exceptions;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("txt.js");
        } catch (Exception e)
        {
            System.out.println("Exception caught" + e);
        } finally {
            File f1 = new File("C:\\");
            try
            {

                Boolean res = f1.createNewFile();
            }
            catch (Exception e){
                System.out.println("File createe ");
            }

        }
    }
}