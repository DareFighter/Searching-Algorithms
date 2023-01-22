

class Main {

	public static int LinearSearch(int[] array, int target){
		for(int i=0; i<array.length; i++){
			if (array[i] == target){
				return i;
			}
		}
		return -1;
	}

}


class LinearSearchApp {
	public static void main(String[] args){
		int[] numbers = {7,1,3,6,5};
		var index = Main.LinearSearch(numbers, 70);
		System.out.println(index);
	}
}
