class Main {
	
	public static int BinarySearch(int[] array, int target){
		return BinarySearch(array, target, 0, array.length-1);
	}

	private static int BinarySearch(int[] array,int target, int left, int right){

		if (right < left)
			return -1;

		int middle = (left + right)/2;

		if(array[middle] == target)
			return middle;

		if(target < array[middle])
			return BinarySearch(array, target, left, middle-1);
		return BinarySearch(array, target, middle+1, right);
	}
}

class BinarySearchApp {
	public static void main(String[] args){
		int[] numbers = {1,3,5,6,7};
		var index = Main.BinarySearch(numbers, 70);
		System.out.println(index);
	}
}
