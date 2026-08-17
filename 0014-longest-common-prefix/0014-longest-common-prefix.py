class Solution(object):
    def longestCommonPrefix(self, strs):
        strs.sort()
        first=strs[0]
        last=strs[len(strs)-1]
        res=""
        for i in range(len(first)):
            if first[i]!=last[i]:
                break
            res+=first[i]
        return res
            
    
        