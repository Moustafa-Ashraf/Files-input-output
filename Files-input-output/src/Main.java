import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("FileRandome.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Random rand = new Random();
        try {
            FileWriter myWriter = new FileWriter("FileRandome.txt");
            for (int i = 0; i < 1000; i++) {
                int num = rand.nextInt(1000);
                myWriter.write(num + " ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
