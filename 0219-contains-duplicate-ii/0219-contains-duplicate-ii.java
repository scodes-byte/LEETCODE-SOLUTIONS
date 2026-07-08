/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=nums.length -1 ;
        while(i<j){
            if(nums[i]!=nums[j] ||k<=0){
                return false;
            }
            else if(Math.abs(nums[i]-nums[j])<=k ){
                return true;
            }
        }return false;
        
    }
}*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k)
                    return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}