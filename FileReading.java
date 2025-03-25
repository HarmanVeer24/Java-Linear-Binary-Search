import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Harma\\bridgeLabz-workspace\\Java-Linear-Binary-Search\\FileReader.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
//input file
// Hello, World!
//This is Harman Veer Singh. Harman is a student at Chitkara University
//output
// Hello, World!
//This is Harman Veer Singh. Harman is a student at Chitkara University