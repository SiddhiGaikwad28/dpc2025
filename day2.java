public class MissingNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6, 8,11};
        int n =  arr[arr.length - 1];

        System.out.print("Missing numbers: ");

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}

