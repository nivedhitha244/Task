import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        System.out.println("Running Sum:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}