public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int ind=0;
        for(int num:nums){
            if(num!=0){
                nums[ind++]=num;
            }
        }
        for(int i=ind;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}