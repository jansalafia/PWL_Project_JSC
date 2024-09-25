import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File fileCenter = new File("News Articles\\Center.txt");
        File fileRight = new File("News Articles\\Right.txt");
        File fileLeft = new File("News Articles\\Left.txt");

        try (
            BufferedReader br_center = new BufferedReader(new FileReader(fileCenter));
            BufferedReader br_right = new BufferedReader(new FileReader(fileRight));
            BufferedReader br_left = new BufferedReader(new FileReader(fileLeft));
        ) {
            // Read and print Center file
            String line;
            while ((line = br_center.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");

            // Read and print Right file
            while ((line = br_right.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");

            // Read and print Left file
            while ((line = br_left.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
