import java.io.*;

public class Skip {
    public static void main(String[] args) throws IOException {
        File myFile = new File("test.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Hello world\n");
        fileWriter.write("This is line two");
        fileWriter.close();
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        long skipped = br.skip(7);
        System.out.println("Skipped: " + skipped + " characters");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("Line: " + line);
        }
        br.close();
    }
}