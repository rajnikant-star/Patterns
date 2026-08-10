import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        String rev = "";
        for(int i=ch.length()-1;i>=0;i--){
            rev = rev + ch.charAt(i);
        }
        System.out.println(rev);
    }
}