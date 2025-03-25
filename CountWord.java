import java.io.*;

public class CountWord {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Harma\\bridgeLabz-workspace\\Java-Linear-Binary-Search\\FileReader.txt";
        String targetString = "Harman";
        int wordCount = 0;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\W+");

                // Check each word
                for (String word : words) {
                    if (word.equals(targetString)) {
                        wordCount++;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            // Print the result
            System.out.println("The word \"" + targetString + "\" appeared " + wordCount + " times in the file.");
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
// The word "Harman" appeared 2 times in the file.
