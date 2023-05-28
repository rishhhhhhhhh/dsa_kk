class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
      var ans = new ArrayList<int[]>();
      var m = nums1.length;
      var n = nums2.length;
      int i = 0, j = 0;
      
      while (i < m || j < n) {
        if (i == m || (j != n && nums2[j][0] < nums1[i][0]))
          ans.add(new int[] {nums2[j][0], nums2[j++][1]});
        else if (j == n || (i != m && nums1[i][0] < nums2[j][0]))
          ans.add(new int[] {nums1[i][0], nums1[i++][1]});
        else
          ans.add(new int[] {nums1[i][0], nums1[i++][1] + nums2[j++][1]});
      }
      return ans.toArray(new int[ans.size()][2]);
    }
  }