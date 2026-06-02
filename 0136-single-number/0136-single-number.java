
//class Solution {

//  public int singleNumber(int[] nums) {

//      int n=nums.length;

//      int ans =0;

//      for (int i =0;i<n;i++){

//          if (nums[i]==nums[i]){

//              ans=nums[i];

//          }

//      }  

//      for(int i =0; i<n;i++){

//

//          if(nums[i]!=nums[n-i-1]){

//              ans=nums[i];

//

//          }

//      }return ans;

//      

//  }

class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }
}