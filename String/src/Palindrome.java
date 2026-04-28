import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String str1 = str;

        str1 = str1.replace(" ","");

        String reversed = new StringBuilder(str).reverse().toString();

        if(str1.equals(reversed)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
