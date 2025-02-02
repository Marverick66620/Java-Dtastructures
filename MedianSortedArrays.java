import java.util.Scanner;

public class MedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int totalLength = m + n;
        int medianIndex1 = (totalLength - 1) / 2;
        int medianIndex2 = totalLength / 2;
        
        int i = 0, j = 0, count = 0;
        int median1 = 0, median2 = 0;

        while (count <= medianIndex2) {
            int value;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                value = nums1[i++];
            } else {
                value = nums2[j++];
            }

            if (count == medianIndex1) median1 = value;
            if (count == medianIndex2) median2 = value;
            count++;
        }

        return (totalLength % 2 == 0) ? (median1 + median2) / 2.0 : median2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        scanner.close();
    }
}
