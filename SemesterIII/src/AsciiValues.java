import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + " - " + ascii);
        }
    }
}
