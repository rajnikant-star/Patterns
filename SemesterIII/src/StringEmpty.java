import java.util.Scanner;

public class StringEmpty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.isEmpty()){
                System.out.println("empty");
            }
            else{
                System.out.println("Not Empty");
            }
    }
}
