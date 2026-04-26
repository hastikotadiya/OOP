import java.io.*;
public class pr28{
    public static void main(String[] args) {
        BufferedReader br = null;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newline): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
