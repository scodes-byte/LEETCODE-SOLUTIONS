class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        c=0
        n=len(nums)
        for i in range (1,n):
            if nums[i]!=nums[c]:
                c+=1
                nums[c]=nums[i]
        return c+1

        
