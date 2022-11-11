import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path customerPath = Paths.get("customers.txt");
        String customerID, fName, lName;
        double balOwed;

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(customerPath));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter ID or enter \"quit\"");
            customerID = scanner.next();

            while (!customerID.toLowerCase().equals("quit")) {
                System.out.print("Enter first name: ");
                scanner.next();
                System.out.print("Enter last name: ");
                scanner.next();
                System.out.print("Enter balance owed: ");
                scanner.nextInt();
                String customer = String.format("%s %s %s")
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
