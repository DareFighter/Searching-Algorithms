class Main {

    public static int TernarySearch(int[] array, int target) {
        return TernarySearch(array, target, 0, array.length - 1);
    }

    private static int TernarySearch(int[] array, int target, int left, int right) {

        if (left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target) {
            return mid1;
        }

        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return TernarySearch(array, target, left, mid1 - 1);

        if (target > array[mid2])
            return TernarySearch(array, target, mid2 + 1, right);

        return TernarySearch(array, target, mid1 + 1, mid2 - 1);
    }
}

public class TernarySearchApp {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6, 7 };
        var index = Main.TernarySearch(numbers, 5);
        System.out.println(index);
    }
}
