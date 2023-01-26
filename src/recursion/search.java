package recursion;

public class search {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,10};
        System.out.println(linear(arr, 2, 0));
        System.out.println(index(arr, 7, 0));
        System.out.println(lastindex(arr, 10, arr.length-1));
    }
    static boolean linear(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linear(arr, target, index + 1);
    }

    static int index(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return index(arr, target, index + 1);
        }
    }

    static int lastindex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return lastindex(arr, target, index - 1);
        }
    }
}
