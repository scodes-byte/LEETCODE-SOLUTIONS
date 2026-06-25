class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n =nums.length;
        for(int i =0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);

            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }return 1;













       // HashMap<Integer,Integer> map = new HashMap<>();
       // int n = nums.length;
       // for (int num:nums){
//
       //     map.put(num,map.getOrDefault(num,0)+1);
       //      if (map.get(num) > n / 2) {
       //         return num;
       //      }
//
       // } return -1;
//        int n =nums.length;
//       // int count=0;
//        for(int i =0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                    count++;
//
//                 }
//
//            }
//            if(count > n / 2) {
//                return nums[i];
//            }
//        }
//        return -1;
    }
}

