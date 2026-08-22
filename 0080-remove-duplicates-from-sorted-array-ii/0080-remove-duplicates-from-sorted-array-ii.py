class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n= len(nums)
        if n<=2:
            return n
        c=1
        for i in range(2,n):
            if nums[i]!= nums[c-1]:
                c+=1
                nums[c]=nums[i]
        return c+1
        