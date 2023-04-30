package leetcode.hard;


class QuickUnion {
    private final int[] arr;

    public QuickUnion(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        arr[root(p)] = root(q);
    }

    public boolean isGraphConnected() {
        int p = root(0);
        for (int i = 1; i < arr.length; i++) {
            if (root(i) != p) {
                return false;
            }
        }
        return true;
    }
 
    private int root(int p) {
        while (arr[p] != p) {
            arr[p] = arr[arr[p]];
            p = arr[p];
        }
        return p;
    }

}

class Solution {
    private int n;
    private int[][] edges;

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> {
            return b[0] - a[0];
        });
        this.edges = edges;
        this.n = n;
        boolean[] skippedAlice = solve(1);
        if (skippedAlice == null) {
            return -1;
        }
        boolean[] skippedBob = solve(2);
        if (skippedBob == null) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < edges.length; i++) {
            if (!skippedAlice[i] && !skippedBob[i]) {
                count++;
            }
        }
        return count;
    }

    private boolean[] solve(int k) {
        var m = edges.length;
        var union = new QuickUnion(n);
        var arr = new boolean[m];
        for (var i = 0; i < m; i++) {
            var edge = edges[i];
            if (edge[0] != 3 && edge[0] != k) {
                continue;
            }
            if (union.connected(edge[1] - 1, edge[2] - 1)) {
                continue;
            }
            union.union(edge[1] - 1, edge[2] - 1);
            arr[i] = true;
        }
        return union.isGraphConnected() ? arr : null;
    }
}