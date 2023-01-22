
class Main {
    public static int BinarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;

            if (array[middle] == target)
                return middle;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }
}

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6, 7 };
        var index = Main.BinarySearch(numbers, 3);
        System.out.println(index);
    }
}
