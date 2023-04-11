class Solution {
    public boolean canFinish(int num, int[][] prerequisites) {
        int[] vis = new int[num];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<num; i++)
            adj.add(new ArrayList<>());
        
        for(int[] arr:  prerequisites)
            adj.get(arr[0]).add(arr[1]);
        
        for(int i=0; i<num; i++){
            if(vis[i] == 0){
                int[] dvis = new int[num];
                if(checkDfsCycle(adj, vis, dvis, i)) return false;
            }
        }
        
        return true;
    }
    
    
    private boolean checkDfsCycle(ArrayList<ArrayList<Integer>> adj, int[]vis, int[] dvis, int i){
        if(vis[i]==1 && dvis[i]==0) return false;
        if(vis[i]==1 && dvis[i]==1) return true;
        
        dvis[i]=1;
        vis[i]=1;
        
        for(Integer n: adj.get(i)){
             if(checkDfsCycle(adj, vis, dvis, n)) return true;
        }
        dvis[i] = 0;
        return false;
    }
}