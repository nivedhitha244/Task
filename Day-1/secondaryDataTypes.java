public class secondaryDataTypes{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        for(int number : nums){
            System.out.println(number);
        }
        String s1="Hello";
        System.out.println( s1);
        String s2="Hello";
        System.out.println(s1+" "+s2);
        System.out.println(s1==s2);
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s3+" "+s4);
        System.out.println(s3==s4);
    }
}