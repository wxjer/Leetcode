package zouf.primary.class01;

public class Test {


    public static void main(String[] args) {
        int[] origin = generateRandomArray(20, 100);
        printArray(origin);
        insert(origin);
        printArray(origin);
    }


    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insert(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[j+1] < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }


    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
