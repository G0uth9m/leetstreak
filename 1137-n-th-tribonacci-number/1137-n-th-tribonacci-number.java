class Solution {
    public int tribonacci(int n) {
        int[] arr=new int[3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        if(n<3){
            return arr[n];
        }
        for(int i=3;i<n+1;i++){
            int sum=0;
            for(int j:arr){
                sum+=j;
            }
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=sum;
        }
        return arr[2];
    }
}