package gr.iantoniou.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F1Drivers {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> drivers = new ArrayList<>();

        File sourceFile = new File("src/sourceFile/Formula1_Drivers.txt");

        Scanner uploadFile = new Scanner(sourceFile);

        while (uploadFile.hasNextLine()) {
            String driverName = uploadFile.nextLine();
            drivers.add(driverName);
        }
        System.out.println("\nΠίνακας με αρχικοποίηση απο αρχείο.");
        for (int pos = 0; pos < drivers.size(); pos++) {
            System.out.println((pos + 1) + ". Driver: " + drivers.get(pos));
        }

        // Κλείσιμο του Scanner
        uploadFile.close();
        System.out.println("\nΤέλος Εκτέλεσης.\nCreated by Antoniou Ioannis,\nJunior Full-Stack SW Engineer!\nThanks.");
    }
}

