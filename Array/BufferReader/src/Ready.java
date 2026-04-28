import java.io.*;

public class Ready {
    public static void main(String[] args) throws IOException {
        File myFile = new File("test.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Hello world\n");
        fileWriter.write("This is line two");
        fileWriter.close();
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//        String name = br.readLine();
        while (br.ready()) {
            System.out.println("Ready");
            String line = br.readLine();
            System.out.println("Line: " + line);
        }

        System.out.println("NoT Ready - End of File");
        br.close();
    }
}

