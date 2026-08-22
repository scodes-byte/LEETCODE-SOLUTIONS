class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        profit=0
        min=prices[0]
        for i in range (n):
            if prices[i]<min:
                min=prices[i]
            temp =prices[i]-min
            if temp>profit:
                profit=temp
        return profit
        
        