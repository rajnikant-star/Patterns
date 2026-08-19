import java.util.Scanner;

public class CheckVolConst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0, consonants = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}