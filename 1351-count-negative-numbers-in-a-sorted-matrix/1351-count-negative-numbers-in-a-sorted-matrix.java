class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        
        for (int row=0;row<n;row++){
            int left=0,right=m-1;

            while(left<=right){
                int mid=left+(right-left)/2;
                if(grid[row][mid]<0){
                    right =mid-1;
                    
                }
                else{
                    left=mid+1;
                }
                
            }ans+=m-left;
        }return ans;
        
    }
}