package DsaProblems.src.OtherTest;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\saura\\OneDrive\\Desktop\\data.csv");
            // Write the header row
            writer.append("Name, Age, City\n");

            // Write some data
            writer.append(centerAlign("John Doe")).append(",");
            writer.append(centerAlign("28")).append(",");
            writer.append(centerAlign("New York")).append("\n");

            writer.append(centerAlign("..12345")).append(",");
            writer.append(centerAlign("35")).append(",");
            writer.append(centerAlign("San Francisco")).append("\n");

            writer.close();
            System.out.println("Data written successfully to CSV file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static String centerAlign(String text) {
        int maxWidth = 15; // set the maximum width of the column
        int width = Math.min(text.length(), maxWidth);
        char[] padding = new char[(maxWidth - width) / 2];
        Arrays.fill(padding, ' ');
        return new String(padding) + text.substring(0, width) + new String(padding);
    }


}




