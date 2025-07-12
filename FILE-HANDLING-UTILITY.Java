import java.io.*;
import java.util.Scanner;

/**
 * A utility program to demonstrate file handling operations:
 * - Reading from a file
 * - Writing to a file
 * - Modifying the content of a file
 */
public class FileHandlingUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example.txt";

        try {
            // 1. Writing to a file
            System.out.println("Writing to the file...");
            writeToFile(fileName, "Welcome to CodTech Internship Program!\nThis is a sample text file.");
            System.out.println("File written successfully.\n");

            // 2. Reading from a file
            System.out.println("Reading from the file...");
            readFromFile(fileName);

            // 3. Modifying the file
            System.out.println("\nModifying the file...");
            System.out.print("Enter the text to append: ");
            String newContent = scanner.nextLine();
            appendToFile(fileName, newContent);
            System.out.println("File modified successfully.\n");

            // Reading the modified file
            System.out.println("Reading the modified file...");
            readFromFile(fileName);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Writes content to a file. If the file exists, it will be overwritten.
     *
     * @param fileName The name of the file.
     * @param content  The content to write.
     * @throws IOException If an I/O error occurs.
     */
    public static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    /**
     * Reads and prints the content of a file.
     *
     * @param fileName The name of the file.
     * @throws IOException If an I/O error occurs.
     */
    public static void readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * Appends content to an existing file.
     *
     * @param fileName The name of the file.
     * @param content  The content to append.
     * @throws IOException If an I/O error occurs.
     */
    public static void appendToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // Add a new line before appending
            writer.write(content);
        }
    }
}
