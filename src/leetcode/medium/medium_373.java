class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.sum - p2.sum);
        for(int i = 0; i < nums1.length; i++)
            pq.offer(new Pair(i, 0, nums1[i] + nums2[0]));
        while(!pq.isEmpty() && k-- > 0){
            List<Integer> temp = new ArrayList<>();
            Pair p = pq.poll();
            temp.add(nums1[p.i]);
            temp.add(nums2[p.j]);
            res.add(temp);
            if(p.j + 1 < nums2.length)
                pq.offer(new Pair(p.i, p.j + 1, nums1[p.i] + nums2[p.j + 1]));
        }
        return res;
    }
}

class Pair{
    int i,j,sum;
    Pair(int i,int j,int sum){
        this.i = i;
        this.j = j;
        this.sum = sum;
    }
}