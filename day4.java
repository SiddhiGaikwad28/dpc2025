public class MergeSortedArrays {

    
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = nextGap(m + n);

        while (gap > 0) {
            int i = 0;

            while (i + gap < m) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
                i++;
            }


            int j = (gap > m) ? (gap - m) : 0;
            while (i < m && j < n) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }


            if (j < n) {
                int k = j;
                while (k + gap < n) {
                    if (arr2[k] > arr2[k + gap]) {
                        int temp = arr2[k];
                        arr2[k] = arr2[k + gap];
                        arr2[k + gap] = temp;
                    }
                    k++;
                }
            }

            gap = nextGap(gap);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.print("arr1 = ");
        for (int x : arr1) System.out.print(x + " ");
        System.out.println();

        System.out.print("arr2 = ");
        for (int x : arr2) System.out.print(x + " ");
    }
}
