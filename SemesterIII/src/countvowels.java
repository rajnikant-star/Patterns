import java.util.Scanner;

public class countvowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] v = {"a","A","e","E","i","I","o","O","u","U"};
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(String vowel : v){
                if(vowel.charAt(0) == ch) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
