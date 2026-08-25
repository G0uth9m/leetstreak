class Solution(object):
    def missingMultiple(self, nums, k):
        m=max(nums)
        i=k
        while i<max:
            if i in nums:
                i+=k
                continue
            else:
                return i

       
        