class Solution(object):
    def judgeSquareSum(self, c):
        root=int(sqrt(c))
        left=0
        right=root
        while left<=right:
            sum=left**2+right**2
            if sum==c:
                return True
            if sum<c:
                left+=1
            else:
                right-=1
        return False

        
        