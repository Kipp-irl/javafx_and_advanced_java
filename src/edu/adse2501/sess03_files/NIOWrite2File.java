package edu.adse2501.sess03_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class NIOWrite2File {

    // Target file path
    private static Path readWriteFile = Paths.get("src/edu/adse2501/files/"
            + "nioreadwrite.txt");

    public static void main(String[] args) {
        // This block creates the folders automatically if they don't exist yet.
        try {
            Path parentDir = readWriteFile.getParent();
            if (parentDir != null && Files.notExists(parentDir)) {
                Files.createDirectories(parentDir);
                System.out.println("Created missing directory: " + parentDir);
            }
        } catch (IOException e) {
            System.err.println("Could not create directories: " + e.getMessage());
            return;
        }
        // ------------------------

        try (Scanner sc = new Scanner(System.in).useDelimiter("\n")) {
            
            System.out.println("Please enter a message/some text to be written to the file ->");
            String appendString = "\n" + sc.next();

            // Write to file (now guaranteed to have a folder)
            Files.write(readWriteFile, appendString.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            
            System.out.println("Contents written to the file.");

            // Read back
            System.out.println("--- Reading File Content ---");
            List<String> fileContents = Files.readAllLines(readWriteFile);
            fileContents.forEach(System.out::println);

        } catch (IOException ioe) {
            System.err.println("The error " + ioe.getLocalizedMessage() + " occurred!");
        }
    }
}