import java.util.*;
public class ColumnTitle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int columnNumber=sc.nextInt();
        StringBuilder str=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            str.append((char)('A'+rem));
            columnNumber/=26;
        }
        System.out.print(str.reverse().toString());
    }
}