class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
       // Arrays.sort(nums);
       // int n=nums.length;
       // for(int i =0; i<n;i++){
       //     if(nums[i]==target){
       //         ans.add(i);
//
       //     }
       // }return ans;

    int less = 0;
        int equal = 0;

        for (int num : nums) {
            if (num < target) {
                less++;
            } else if (num == target) {
                equal++;
            }
        }

        for (int i = 0; i < equal; i++) {
            ans.add(less + i);
        }

        return ans;
    }
}