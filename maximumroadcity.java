class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int k[]=new int[n];
        int t[][]=new int[n][n];
        for(int r[]:roads){
            k[r[0]]++;
            k[r[1]]++;
            t[r[0]][r[1]]++;
            t[r[1]][r[0]]++;
        }
        int rank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val=k[i]+k[j]-t[i][j];
                if(rank<val){
                    rank=val;
                }
            }
        }
        return rank;
    }
}