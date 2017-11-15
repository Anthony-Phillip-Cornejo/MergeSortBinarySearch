
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		int mid;
		if(lo < hi) {
			mid = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		
		//initialize split arrays
		int bottomLength = mid - lo + 1;
		int topLength = hi - mid;
		int[] bottomArray = new int[bottomLength];
		int[] topArray = new int[topLength];
		
		//initialize count integers
		int bottomCount = 0;
		int topCount = 0;
		int arrCount = lo;
		
		//store bottom half values in bottomArray[i]
		System.arraycopy(list, lo, bottomArray, 0, bottomLength);
		
		//store top half values in topArray[i]
		System.arraycopy(list, mid + 1, topArray, 0, topLength);

		
		//goes through both arrays, comparing and inputing values into list[]
		while(bottomCount < bottomLength && topCount < topLength) {
			if(bottomArray[bottomCount] <= topArray[topCount]) {
				list[arrCount] = bottomArray[bottomCount];
				bottomCount = bottomCount + 1;
			} else {
				list[arrCount] = topArray[topCount];
				topCount = topCount + 1;
			}
			arrCount = arrCount + 1;
		}
		
		//inputs any remaining values from bottomArray[] into list[]
		while(bottomCount < bottomLength) {
			list[arrCount] = bottomArray[bottomCount];
			bottomCount = bottomCount + 1;
			arrCount = arrCount + 1;
		}
		
		//inputs any remaining values from topArray[] into list[]
		while(topCount < topLength) {
			list[arrCount] = topArray[topCount];
			topCount = topCount + 1;
			arrCount = arrCount + 1;
		}
	}
}