# FILE-HANDLING-UTILITY

COMPANY: CODETECH IT SOLUTIONS

NAME: Soham Santosh Salunkhe

Intern ID :CITS0D507

DOMAIN: JAVA PROGRAMMING

BATCH DURATION: 4 Weeks

MENTOR NAME: NEELA SANTHOSH

This Java project titled "File Handling Utility" is a beginner-friendly console-based application that demonstrates the fundamental concepts of file input and output operations in Java. The program is designed to help users understand how to interact with text files using Java’s built-in I/O classes such as BufferedReader, BufferedWriter, FileReader, and FileWriter. These classes provide the foundation for reading from, writing to, and modifying text files. The utility performs three main operations: reading the content of a file, writing new content to a file (overwriting existing data), and appending content to an existing file without deleting the previous content.

The application starts by writing a predefined message to a text file named example.txt. This message includes a welcoming statement related to the CodTech Internship Program and a sample line of text. If the file doesn't already exist, it is automatically created by the program. The use of BufferedWriter in combination with FileWriter enables efficient character output stream handling, ensuring that the writing process is smooth and buffered for better performance. If the file already exists, this operation will overwrite any previous content, making it suitable for scenarios where fresh content is needed.

Once the file has been written to, the program proceeds to read the content using a BufferedReader wrapped around a FileReader. This part of the application demonstrates how to read a file line by line and display it to the console. Reading is one of the most critical aspects of file handling, and this implementation clearly shows how developers can retrieve and work with file data. After the reading operation, the user is prompted to enter new content via the console. This input is then appended to the existing file using BufferedWriter again, but this time with FileWriter set to append mode. This ensures that the new content is added at the end of the file on a new line, preserving the existing data. This feature is especially useful for maintaining logs, adding comments, or storing incremental updates.

The final step in the program is to read the modified file again, allowing the user to verify that the new content has been successfully appended. This full cycle—from writing to reading to modifying and reading again—provides a comprehensive demonstration of how basic file operations can be implemented and tested in Java. Moreover, the program uses Scanner to take user input, making the application interactive and user-friendly.

This project is ideal for beginners who are just starting with Java and want to understand file handling mechanisms. It provides hands-on experience with commonly used I/O classes, encourages structured coding practices, and introduces exception handling through try-catch blocks. The inclusion of a finally block to close the Scanner object shows attention to good resource management practices. Additionally, the logical flow of operations—from writing to modifying—makes it easy for learners to follow along and build on top of this foundation.

Overall, this Java file handling utility is a solid introductory project that illustrates the power and simplicity of working with files in Java. It’s well-suited for academic assignments, internship tasks, coding practice, or even as a base for more advanced applications that require persistent storage. By combining readability, simplicity, and practical utility, this project not only serves as an educational tool but also highlights core Java programming concepts in a real-world context.

#OUTPUT

<img width="1918" height="632" alt="Image" src="https://github.com/user-attachments/assets/584dc990-81fc-4fb6-a1f6-0ea95cbe22f9" />
<img width="1420" height="257" alt="Image" src="https://github.com/user-attachments/assets/3e2b2ae5-5da2-4504-9fdb-2d2a9ee1b44e" />


