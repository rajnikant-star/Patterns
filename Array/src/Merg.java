import java.util.Arrays;

public class Merg {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // Step 1: Compare last of arr1 with first of arr2
        for (int i = n - 1; i >= 0; i--) {
            if (arr1[i] > arr2[0]) {
                // Swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Step 2: Re-sort arr2 (because its first element changed)
                Arrays.sort(arr2);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9};
        int[] arr2 = {2, 3, 8};

        merge(arr1, arr2);

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}

