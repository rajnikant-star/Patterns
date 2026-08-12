import java.util.Scanner;

public class countconsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                if("aeiouAEIOU".indexOf(ch) == -1) {
                    count++;
                }
            }
        }

        System.out.println("Number of consonants: " + count);
    }
}
