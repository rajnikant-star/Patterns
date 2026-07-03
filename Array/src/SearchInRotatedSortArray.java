import java.util.Scanner;

public class SearchInRotatedSortArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] num = new int[]{4,3,6,7,8,9,1,0};
        boolean find = false;
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                System.out.print(i);
                find = true;
                break;
            }
        }
        if(!find){
            System.out.print("-1");
        }
    }
}
