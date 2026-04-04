public class StringCompression{
    public static void main(String[] args){
        char[] chars={'a'};
       StringBuilder str=new StringBuilder();
       int count=1;
       int ind=1;
       while(ind<chars.length){
        if(chars[ind-1]!=chars[ind]){
            str.append(chars[ind-1]);
            if(count>1) str.append(count);
            count=1;
        }
        else{
            count++;
        }
        ind++;
       }
       str.append(chars[ind-1]);
       if(count>1) str.append(count);
       for(int i=0;i<str.length();i++){
        chars[i]=str.charAt(i);
       }
       System.out.print(str.length());
    }
}