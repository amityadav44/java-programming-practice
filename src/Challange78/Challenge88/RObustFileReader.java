package Challenge88;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class RObustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file you wish to read:");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);   // ✅ use print instead of printf
            }
            System.out.println("\nFile read successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s\n", exception.getMessage());
        }
    }
}
