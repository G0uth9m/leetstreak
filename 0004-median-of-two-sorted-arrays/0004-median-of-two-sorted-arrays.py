class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        low1=0
        low2=0
        temp=[]
        high1=len(nums1)-1
        high2=len(nums2)-1
        while low1<=high1 and low2<=high2:
            if nums1[low1]<=nums2[low2]:
                temp.append(nums1[low1])
                low1+=1
            else :
                temp.append(nums2[low2])
                low2+=1
        while low1<=high1:
            temp.append(nums1[low1])
            low1+=1
        while low2<=high2:
            temp.append(nums2[low2])
            low2+=1
        l=len(temp)
        if l%2!=0:
            return temp[l//2]
        else:
            r=temp[l//2]
            r1=temp[(l//2)-1]
            return (float(r)+float(r1))/2