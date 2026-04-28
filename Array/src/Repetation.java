import java.util.Arrays;
import java.util.Scanner;

public class Repetation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean Repeat = false;
        for(int i=0;i<x-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]);
                Repeat = true;
                break;
            }
        }
        if(!Repeat) {
            System.out.print("None");
        }
    }
}

//                for(int i=0;i<n.length;i++){             WithOut Sorting....
//        for(int j=i+1;j<n.length;j++) {
//        if (n[i] == n[j]) {
//        System.out.println(n[i]);
//                break;

