import java.util.Scanner;

public class CompareLexicographically {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int result = s.compareTo(t);
        if(result < 0) {
            System.out.println(s + " comes before " + t);
        } else if(result > 0) {
            System.out.println(s + " comes after " + t);
        } else {
            System.out.println(s + " and " + t + " are equal");
        }
    }
}
