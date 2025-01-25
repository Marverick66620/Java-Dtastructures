import java.util.Scanner;

public class FindMinimum {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
        int[] nums = new int[n];
        System.out.println("Enter the elements of the rotated sorted array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int minElement = findMin(nums);
        System.out.println("The minimum element in the array is: " + minElement);
    }
}