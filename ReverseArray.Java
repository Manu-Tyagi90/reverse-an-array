import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[] {3,4,5,53};
        int[] rev = reverseArray2(arr1);
        System.out.println(Arrays.toString(rev));
        int[] reversed = reverseArray(arr);
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }

    }
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int[] reverseArray(int[] arr) {
        if(arr == null || arr.length == 0 || arr.length == 1){ 
            return arr;
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int[] reverseArray2(int [] arr){
        int num = arr.length/2;
        int left = 0, r = arr.length-1;
        while (left<r) {
            int temp = arr[left];
            arr[left] = arr[r];
            arr[r] = temp;
            left++;
            r--;
        }
        return arr;
    }
}
