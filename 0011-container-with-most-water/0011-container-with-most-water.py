class Solution(object):
    def maxArea(self, height):
        max_area=0
        left_wall=0
        right_wall=len(height)-1
        while left_wall<right_wall:
            area=min(height[left_wall],height[right_wall])*(right_wall-left_wall)
            max_area=max(max_area,area)
            if height[left_wall]<height[right_wall]:
                left_wall+=1
            else:
                right_wall-=1
        return max_area

        
        