class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        start=0
        seen={}
        res=0
        for i in range(0,len(s)):
           elem=s[i]
           if elem in seen and seen[elem]>=start:
            start=seen[elem]+1

           seen[elem]=i
           res=max(res,i-start+1)
        return res


     
        
        