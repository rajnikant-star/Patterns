import java.util.Scanner;

public class EvenOdd {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                System.out.println("Even:"+n[i]);
            }
                else{
                    System.out.println("Odd:"+n[i]);
                }
            }
        }
    }

