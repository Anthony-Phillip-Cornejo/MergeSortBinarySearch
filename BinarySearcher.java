
public class BinarySearcher {
	
	public static int binarySearch(int[] list, int low, int high, int x) {
		int mid;	
		if(low <= high) {
			mid = low + (high - low) / 2;
			if(x == list[mid]) {
				return mid;
			}
			else if(x < list[mid]) {
				return binarySearch(list, low, mid - 1, x);
			} else {
				return binarySearch(list, mid + 1, high, x);
			}
		} else {
			return -1;
		}
	}
}
