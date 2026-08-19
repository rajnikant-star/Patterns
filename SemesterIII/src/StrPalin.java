import java.util.Scanner;

public class StrPalin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "ccaabdreeera";
        boolean[] visited = new boolean[s.length()];

        for(int i = 0; i < s.length(); i++){
            if(visited[i])
                continue;

            int count = 1;

            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    visited[j] = true;
                    count++;
                }
            }

            if(count > 1){
                System.out.println(s.charAt(i) + " occurs " + count + " times");
            }
        }
    }
}
