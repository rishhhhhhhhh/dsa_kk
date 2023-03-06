package easy;

public class easy_1539 {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));       
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }
}
