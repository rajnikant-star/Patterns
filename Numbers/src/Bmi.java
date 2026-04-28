import java.util.Scanner;

public class Bmi {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight");
        Double n = sc.nextDouble();
        System.out.println("Enter Height");
        Double m = sc.nextDouble();
        Double o = n/(m*m);
        System.out.println(o);
    }
}
