class Solution:
    def countOdds(self, low: int, high: int) -> int:
        #odd=[]
        #count=0
        #for i in range ( low, high+1):
        #    if i%2==0:
        #        count
        #    else:
        #        count+=1
        #return count

        return (high+1)//2 - (low//2)

        