class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int low1=0;
        int low2=0;
        int [] arr=new int[m+n];
        int high1=m-1;
        int high2=n-1;
        int i=0;
        while(low1<=high1 && low2<=high2){
            if(nums1[low1]<nums2[low2]){
                arr[i]=nums1[low1];
                low1++;
            }else{
                arr[i]=nums2[low2];
                low2++;
            }
            i++;
        }
        while(low1<=high1){
            arr[i]=nums1[low1];
            low1++;
            i++;
        }
        while(low2<=high2){
            arr[i]=nums2[low2];
            low2++;
            i++;
        }
        for(i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
    }
}