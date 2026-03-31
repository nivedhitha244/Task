import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        ArrayList<StringBuilder> rows =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            rows.add(new StringBuilder());
        }
        int currentRow=0;
        boolean goingDown=false;
        for(char c:s.toCharArray()){
            rows.get(currentRow).append(c);
            if(currentRow==0 || currentRow==numRows-1){
                goingDown=!goingDown;
            }
            if(goingDown){
                currentRow++;
            }
            else{
                currentRow--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder row:rows){
            res.append(row);
        }
        return res.toString();
    }
}