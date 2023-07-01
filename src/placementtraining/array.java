import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 100, 80, 40, 30,5};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            System.out.println(arr[right] + " " + arr[left]);
            left++;
            right--;
        }

         if (arr.length % 2 != 0) {
            System.out.println(arr[right]);
        }
    }
}
