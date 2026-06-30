class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (set.contains(third)) {
                    ans.add(Arrays.asList(nums[i], third, nums[j]));
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}