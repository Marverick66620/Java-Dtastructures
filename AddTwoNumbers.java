import java.util.*;

public class AddTwoNumbers {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        int size1 = l1.size(), size2 = l2.size();
        int maxSize = Math.max(size1, size2);
        for (int i = 0; i < maxSize; i++) {
            int num1 = (i < size1) ? l1.get(i) : 0;
            int num2 = (i < size2) ? l2.get(i) : 0;
            int sum = num1 + num2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.add(carry);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        System.out.print("Enter the number of digits in first linked list: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the digits (in reverse order): ");
        for (int i = 0; i < n1; i++) {
            l1.add(scanner.nextInt());
        }
        System.out.print("Enter the number of digits in second linked list: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the digits (in reverse order): ");
        for (int i = 0; i < n2; i++) {
            l2.add(scanner.nextInt());
        }
        LinkedList<Integer> result = addTwoNumbers(l1, l2);
        System.out.println("Sum as a linked list (reverse order): " + result);
    }
}
