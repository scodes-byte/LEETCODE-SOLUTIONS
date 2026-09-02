class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        prefix = 0
        max_len = 0

        mp = {0: -1}

        for i in range(len(nums)):

            if nums[i] == 0:
                prefix -= 1
            else:
                prefix += 1

            if prefix in mp:
                max_len = max(max_len, i - mp[prefix])
            else:
                mp[prefix] = i

        return max_len