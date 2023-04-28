class Solution {
    public int numSimilarGroups(String[] strs) {
        int visited[] = new int[strs.length];
        int count = 0;

        for(int i = 0 ; i < strs.length ; i++){
            if(visited[i] == 0){
                dfs(i,strs,visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int index, String[] strs, int visited[]){
        visited[index] = 1;
        String s1 = strs[index];

        for(int i = 0 ; i < strs.length ; i++){
            if(visited[i] == 0){
                if(isSimilar(s1,strs[i])){
                    dfs(i,strs,visited);
                }
            }
        }
    }

    public boolean isSimilar(String A, String B){
        int not_same_character = 0;

        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) != B.charAt(i)){
                not_same_character++;
            }
        }
        return (not_same_character == 2 || not_same_character == 0);
    }
}
