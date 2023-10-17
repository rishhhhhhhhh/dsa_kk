class Solution{
public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        Set<Integer>[] childArr = new Set[n];
        int[] parent = new int[n];
        Arrays.fill(parent,-1);
        for (int i=0;i<n;i++) {
            childArr[i]= new HashSet<>();
        }

        for (int i=0;i<n;i++) {
            if(leftChild[i]!=-1) {
                
                if(parent[leftChild[i]]!=-1 || isCurrentChildAPreviousParent(leftChild[i],childArr,i)) {
                    return false;
                }
                parent[leftChild[i]]=i;
                childArr[i].add(leftChild[i]);
            }
            if(rightChild[i]!=-1) {

                if(parent[rightChild[i]]!=-1 || isCurrentChildAPreviousParent(rightChild[i],childArr,i)) {
                    return false;
                }
                parent[rightChild[i]]=i;
                childArr[i].add(rightChild[i]);
            }
        }

        int rootCount = 0;
        for (int x : parent) {
            if(x==-1) {
                rootCount++;
            }
        }

        return rootCount==1;
    }

    private boolean isCurrentChildAPreviousParent(int child, Set<Integer>[] childArr, int parent) {
        if(child==parent) {
            return true;
        }
        for (Integer c : childArr[child]) {
            boolean v =  isCurrentChildAPreviousParent(c,childArr,parent);
            if(v) {
                return v;
            }
        }
        return false;
    }
}
