class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zero=0,one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') zero++;
            if(s.charAt(i)=='1') one++;
        }
        String res="";
        for(int i=1;i<=(one-1);i++){
            res+="1";
        }
        for(int j=1;j<=zero;j++){
            res+="0";
        }
        res+="1";
        return res;
    }
}