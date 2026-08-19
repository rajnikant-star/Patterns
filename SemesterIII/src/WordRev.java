import java.util.Scanner;

public class WordRev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            StringBuilder rev = new StringBuilder(word);
            res.append(rev.reverse().toString()).append(" ");
        }
        System.out.println(res.toString().trim());
    }
}
