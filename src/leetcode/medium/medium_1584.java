class PointDistance {
    int point;
    int distance;
    
    PointDistance(int point, int distance) {
        this.point = point;
        this.distance = distance;
    }
    
    public String toString() {
        return "Point: " + this.point + ", Distance: " + this.distance;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        
        if(n<=1)
            return 0;
        
        PriorityQueue<PointDistance> pq = new PriorityQueue<PointDistance>((n1,n2) -> n1.distance - n2.distance);
        Set<Integer> visited = new HashSet<>();
        
        Map<Integer, List<PointDistance>> adj = new HashMap<Integer, List<PointDistance>>();
        
        for(int i=0; i<n; i++) {
            int[] p1 = points[i];
            
            for(int j=i+1; j<n; j++) {
                int[] p2 = points[j];
                int distance = Math.abs(p1[0]-p2[0]) + Math.abs(p1[1]-p2[1]);
                
                List<PointDistance> t1 = adj.getOrDefault(i,new ArrayList<PointDistance>());
                t1.add(new PointDistance(j, distance));
                adj.put(i, t1);
                
                List<PointDistance> t2 = adj.getOrDefault(j,new ArrayList<PointDistance>());
                t2.add(new PointDistance(i, distance));
                adj.put(j, t2);
            }
        }
        
        int cost = 0;
        pq.add(new PointDistance(0,0));
        
        while(visited.size() < n) {
            PointDistance p = pq.poll();
            
            if(visited.contains(p.point))
                continue;
            
            cost += p.distance;
            visited.add(p.point);
            
            for(PointDistance pd: adj.get(p.point)) {
                
                if(!visited.contains(pd.point)) {
                    pq.add(pd);
                }
            }
        }
        
        return cost;
    }
}
