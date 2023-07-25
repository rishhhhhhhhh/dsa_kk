package medium;

public class medium_852 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));

    }
   
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid+1]) {
               
                end = mid;
            } 
            else {
                
                start = mid + 1; 
            }
        }
        
        return start; 
    }
}

//class Solution {
    //public int peakIndexInMountainArray(int[] arr) {
    //    int i = 0;
      //  int j = arr.length - 1;
    //    int n = arr.length;
     //   while (i <= j) {
           // int mid = (i + j) / 2;
         //   if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid]))
        //        return mid;
       //     else if (mid > 0 && arr[mid - 1] > arr[mid])
            //    j = mid - 1;
        //    else
            //    i = mid + 1;
      //  }
    //    return -1;
  //  }
//}
