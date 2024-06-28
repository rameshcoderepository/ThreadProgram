
package LinearSearch;

public class SearchingAlgorithm {

	public static void main(String[] args) {

		int numArray[] = { 2, 3, 4, 6, 7, 9, 10, 14, 15, 20 };

		int targetValue = 9;

		int result = linearSearch(numArray, targetValue);

		int result1 = binarySearch(numArray, targetValue);

		if (result != -1) {
			System.out.println("Linear Search Element found at Index:" + " " + result);
		} else {
			System.out.println("Linear Search Element not Found in corresponding given Array");
		}

		if (result1 != -1) {
			System.out.println("Binary Search Element found at Index:" + " " + result);
		} else {
			System.out.println("Binary Search Element not Found in corresponding given Array");
		}
	}

	private static int linearSearch(int[] numArray, int targetValue) {

		int countSteps = 0;
		for (int i = 0; i < numArray.length; i++) {
			countSteps++;
			if (numArray[i] == targetValue) {
				System.out.println("Number of steps Taken for Linear serach to find Target Value :" + " " + countSteps);
				return i;
			}
		}
		return -1;
	}

	private static int binarySearch(int[] numArray, int targetValue) {

		int startPoint = 0;
		int endPoint = numArray.length - 1;

		int countSteps = 0;

		while (startPoint <= endPoint) {

			countSteps++;
			int midValue = (startPoint + endPoint) / 2;

			if (numArray[midValue] == targetValue) {
				System.out.println("Number of steps Taken for Binary serach to find Target Value :" + " " + countSteps);
				return midValue;
			} else if (numArray[midValue] < targetValue) {
				startPoint = midValue + 1;
			} else {
				endPoint = midValue - 1;
			}
		}
		System.out.println("Number of steps Taken for Binary serach to find Target Value :" + " " + countSteps);
		return -1;
	}
}
