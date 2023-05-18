import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashMap<Integer, Integer> map = new HashMap<>();
		// initialize in-degrees of all nodes of graph
        for(int i=0; i<n; i++) {
            map.put(i, 0);
        }
		// based on edge falling over a node update indegree
        for(List<Integer> edge: edges) {
            map.put(edge.get(1),map.getOrDefault(edge.get(1), 0)+1);
        }
        // return all nodes with zero indegrees
        return map.keySet().stream().filter(k->map.get(k)==0).collect(Collectors.toList());
    }
}
