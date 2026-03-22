class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long)length*width*height;
        int bulk=0;
        int heavy=0;
        if(volume>=1000000000 || length>=10000 || width>=10000 ||height>=10000){
            bulk=1;
        }
        if(mass>=100){
            heavy=1;
        }
        if(bulk==1 && heavy==1) return "Both";
        else if(bulk!=1 && heavy!=1) return "Neither";
        else if(bulk==1 && heavy==0) return "Bulky";
        else{
            return "Heavy";
        }
    }
}