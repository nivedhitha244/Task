import java.util.*;
public class ProductExceptSelf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4};
        int n=nums.length;
        int pre=1;
        int post=1;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i] =pre;
            pre *=nums[i];
        }    
        for(int i=n-1;i>=0;i--){
            res[i]*=post;
            post*=nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}