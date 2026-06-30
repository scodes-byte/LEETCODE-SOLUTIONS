/*class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]== nums[i+1]){
                return true;
               
            }
        }return false;

    }
}*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }return false;
        
    }
}