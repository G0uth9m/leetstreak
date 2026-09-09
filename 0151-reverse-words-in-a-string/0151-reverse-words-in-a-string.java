class Solution {
    public String reverseWords(String s) {
        int f=s.length()-1;
        int b=s.length()-1;
        StringBuilder res=new StringBuilder();
        while(f>=0){
            while(f>=0 && s.charAt(f)==' '){
                f--;
            }
            b=f;
            if(f<0){
                break;
            }
            while(f>=0 && s.charAt(f)!=' '){
                f--;
            }
            res.append(s.substring(f+1,b+1));
            res.append(' ');
        }
        return res.toString().trim();
    }   
}