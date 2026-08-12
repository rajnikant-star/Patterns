import java.util.Scanner;

public class ConCat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String u = " ";
        System.out.println(s.concat(u.concat(t)));
    }
}
