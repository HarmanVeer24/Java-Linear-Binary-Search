import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        // Define the output file path
        String filePath = "C:\\Users\\Harma\\bridgeLabz-workspace\\Java-Linear-Binary-Search\\FileData.txt"; // Change as needed

        try {
            // Step 1: Create an InputStreamReader to read from the console (System.in)
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader consoleReader = new BufferedReader(inputStreamReader);

            // Step 2: Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            // Step 3: Read user input and write to file until "exit" is entered
            while (!(userInput = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(userInput);
                bufferedWriter.newLine(); // Move to the next line
            }

            // Step 4: Close resources
            bufferedWriter.close();
            fileWriter.close();
            consoleReader.close();
            inputStreamReader.close();

            System.out.println("User input has been saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error: Unable to read input or write to file.");
        }
    }
}
//input stored in file
//My name is Harman
//I am currently Studying in Chitkara University
