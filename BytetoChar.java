import java.io.*;

public class BytetoChar {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Harma\\bridgeLabz-workspace\\Java-Linear-Binary-Search\\FileData.txt"; // Change this to the actual file path

        try {
            // Step 1: Create a FileInputStream to read raw bytes from the file
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Step 2: Wrap FileInputStream in InputStreamReader to convert bytes to characters
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            // Step 3: Wrap InputStreamReader in BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            // Step 4: Read and print each line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Step 5: Close resources
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
//I/O
//My name is Harman
//I am currently Studying in Chitkara University
