import java.util.*;
public class ReverseKGroupLinkedList {
    public static LinkedList<Integer> reverseKGroup(LinkedList<Integer> list, int k) {
        if (list == null || k <= 1) {
            return list;
        }
        LinkedList<Integer> result = new LinkedList<>();
        int n = list.size();
        for (int i = 0; i < n; i += k) {
            if (i + k > n) {
                result.addAll(list.subList(i, n));
            } else {
                LinkedList<Integer> temp = new LinkedList<>(list.subList(i, i + k));
                for (int j = temp.size() - 1; j >= 0; j--) {
                    result.add(temp.get(j));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        System.out.println("Original List: " + list);
        LinkedList<Integer> result = reverseKGroup(list, k);
        System.out.println("Reversed in Groups of k: " + result);
        scanner.close();
    }
}
