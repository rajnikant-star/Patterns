import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();
        if(s.equals(rev)){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
