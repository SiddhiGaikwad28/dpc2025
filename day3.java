import java.util.Scanner;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // detect cycle
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // find duplicate
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers (each between 1 and " + (size - 1) + "):");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate);

        sc.close();
    }
}
