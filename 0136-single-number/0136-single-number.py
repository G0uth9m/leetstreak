class Solution(object):
    def singleNumber(self, nums):
        r=0
        for i in nums:
            r^=i
        return r
            
            
            
        

        