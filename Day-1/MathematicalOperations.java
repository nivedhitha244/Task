import java.util.*;
public class MathematicalOperations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("sum of a and b: "+ (a+b));//it will complete the operations in the brackets first then moves to sum of a and b
        System.out.println("diff of a and b: "+ (a-b));
        System.out.println("mul of a and b: "+ (a*b));
        System.out.println("div of a and b: "+ (a/b));
        System.out.println("mod of a and b: "+ (a%b));
        sc.close();
    }
}