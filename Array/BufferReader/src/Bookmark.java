import java.io.*;

public class Bookmark {
    public static void main(String[] args) throws IOException {
        File myFile = new File("test.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Hello world\n");
        fileWriter.write("This is line two");
        fileWriter.close();
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        if (br.markSupported()) {
            System.out.println("Mark/reset supported!");
        }
            else{
                System.out.println("Not Supported");
            }
            // Read first 5 characters
        for (int i = 0; i < 5; i++) {
            System.out.print((char) br.read());
        }

        // Mark the current position
        br.mark(100); // allow up to 100 characters to be read before reset

        System.out.println("\nMarked position");

        // Read next few characters
        for (int i = 0; i < 6; i++) {
            System.out.print((char) br.read());
        }

        // Reset back to marked position
        br.reset();
        System.out.println("\nAfter reset:");

        // Read again from the marked position
        for (int i = 0; i < 6; i++) {
            System.out.print((char) br.read());
        }

        br.close();
    }
}


