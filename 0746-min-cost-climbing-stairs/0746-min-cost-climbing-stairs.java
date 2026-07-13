class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int n=cost.length;
         int ans[]= new int[n+1];
        ans[0]=0; // zero stair
        ans[1]=0; //  1 stair

        for(int i=2;i<=n;i++){
            int case1=cost[i-1]+ans[i-1];  // came from i-1 by taking 1 step
            int case2=cost[i-2]+ ans[i-2];    // came from i-2 by taking 2 steps
            ans[i]=Math.min(case1,case2);
        } 


        return ans[n];       

    }
}