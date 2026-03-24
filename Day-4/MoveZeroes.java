import java.util.*;
public class  MoveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int i=0;
        for(int num:nums){
            if(num!=0){
            nums[i]=num;
            i++;
            }

        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }
        for(int k=0;k<size;k++){
        System.out.print(nums[k]+" ");
        }
    }
}