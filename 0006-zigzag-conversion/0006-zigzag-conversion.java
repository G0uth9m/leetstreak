class Solution {
    public String convert(String s, int numRows) {
        int i=0;
        int j=0;
        int ind=0;
        StringBuilder res=new StringBuilder();
        if(numRows<2 || numRows>s.length()) return s;
        char [][] m=new char [numRows][s.length()];
        while(ind<s.length()){
            while(i<numRows && ind<s.length()){
                m[i][j]=s.charAt(ind);
                ind++;
                i++;
            }
            i=numRows-2;
            j++;
            while(i>0 && ind<s.length()){
                m[i][j]=s.charAt(ind);
                ind++;
                i--;
                j++;
            }
        }
        for(i=0;i<numRows;i++){
            for(j=0;j<s.length();j++){
                if(m[i][j]!='\0'){
                    res.append(m[i][j]);
                }
            }
        }
        return res.toString();
    }
}