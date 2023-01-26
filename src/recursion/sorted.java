package recursion;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,1};
        System.out.println(checkk(arr, 0));
    }

    static boolean checkk(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index]<arr[index + 1] && checkk(arr, index + 1);
    }
    
}
