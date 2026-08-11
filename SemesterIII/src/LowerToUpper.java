import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sh = "";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder st = new StringBuilder(sh);
        for(int i=0;i<s.length();i++){
            char ch = sb.charAt(i);
            if(Character.isLowerCase(ch)){
                st.append(Character.toUpperCase(ch));
            }
            if(Character.isUpperCase(ch)){
                st.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(st);
    }
}
