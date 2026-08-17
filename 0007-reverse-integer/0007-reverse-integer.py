class Solution(object):
    def reverse(self, x):
        num=str(x)
        if x<0:
            res="-"
            res+=num[:0:-1]
        else:
            res=num[::-1]
        res=int(res)
        if res>2**31-1 or res<-2**31:
            return 0
        return res
        