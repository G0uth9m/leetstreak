class Solution(object):
    def resultArray(self, nums):
        arr1=[]
        arr2=[]
        arr1.append(nums[0])
        arr2.append(nums[1])
        j=0
        k=0
        for i in range(2,len(nums)):
            if arr1[j]>arr2[k]:
                arr1.append(nums[i])
                j+=1
            else:
                arr2.append(nums[i])
                k+=1
                
        return arr1+arr2
        
        