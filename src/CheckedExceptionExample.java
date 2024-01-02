import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonexistentfile.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}