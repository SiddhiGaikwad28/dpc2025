import java.util.*;

public class ZeroSumSubarraysBeginner {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        int n = arr.length;

        
        for (int start = 0; start < n; start++) {
            int sum = 0;  

            for (int end = start; end < n; end++) {
                sum += arr[end]; 

                if (sum == 0) {
                    result.add(new int[]{start, end});
                }
            }
        }

        return result;
    }

  
    private static void printResult(List<int[]> res) {
        if (res.isEmpty()) {
            System.out.println("[]");
            return;
        }
        for (int[] sub : res) {
            System.out.print("(" + sub[0] + ", " + sub[1] + ") ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 3, -1, 2};
        printResult(findZeroSumSubarrays(arr1));

        int[] arr2 = {4, -1, -3, 1, 2, -1};
        printResult(findZeroSumSubarrays(arr2));

        int[] arr3 = {1, 2, 3, 4};
        printResult(findZeroSumSubarrays(arr3));

        int[] arr4 = {0, 0, 0};
        printResult(findZeroSumSubarrays(arr4));

        int[] arr5 = {-3, 1, 2, -3, 4, 0};
        printResult(findZeroSumSubarrays(arr5));
    }
}
