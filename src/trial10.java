import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class trial10 {
    public static void main(String[] args){

//        char[] charArray = str.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//
//        String[] word = str.split(" ");
//        System.out.println(Arrays.toString(word));
//
//        String str1 = "1,2,3,4,5,6";
//        String[] number = str1.split(",");
//        System.out.println(Arrays.toString(number));

//        String[] parts = str1.split(",");
//        int[] nums = new int[parts.length];
//        for(int i=0;i<parts.length;i++){
//            nums[i] = Integer.parseInt(parts[i]);
//        }
//        System.out.println(Arrays.toString(nums));
        String str = "Rajnikant kumar Tarun";
        String nospace = str.replace(" ","");
        char[] charArray = nospace.toCharArray();
        int[] char1 = new int[charArray.length];
        for(int i=0;i<charArray.length;i++){
            char1[i] = charArray[charArray.length-1-i];
        }
        for (int val : char1) {
            System.out.println(val);
        }
        String reversed = new StringBuilder(nospace).reverse().toString();
        System.out.println(reversed);
    }
}
