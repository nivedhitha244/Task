
import java.util.*;
public class LastCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=s.length()-1;
        int length=0;
        while(i>=0 && s.charAt(i)==' '){
             i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        System.out.print(length);
    }
}