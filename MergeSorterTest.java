import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MergeSorterTest {

	@Test
	public void testMerge() {
		int[] pre = {1, 3, 7, 4, 6, 2, 5};
		int[] sorted = {1, 2, 3, 4, 5, 6, 7};
		MergeSorter.mergeSort(pre, 0, 6);
		System.out.println("Merge Test 1");
		for(int i = 0; i < pre.length; i++) {
			System.out.println(pre[i]);
		}
		System.out.println("");
		assertTrue(Arrays.equals(pre, sorted));
	}
	
	@Test
	public void testMerge2() {
		int[] pre1 = {-5, -2, -3, -6, -7, -9, -1, -8, -4, 0};
		int[] sorted1 = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
		MergeSorter.mergeSort(pre1, 0, 9);
		System.out.println("Merge Test 2");
		for(int i = 0; i < pre1.length; i++) {
			System.out.println(pre1[i]);
		}
		System.out.println("");
		assertTrue(Arrays.equals(pre1, sorted1));
	}
	
	@Test
	public void testBinary() {
		int searchFor = 9;
		int[] pre2 = {-5, -2, -3, -6, -7, -9, -1, -8, -4, 0};
		MergeSorter.mergeSort(pre2, 0, 9);
		System.out.println("Binary Searcher Test 1");
		for(int i = 0; i < pre2.length; i++) {
			System.out.println(pre2[i]);
		}
		System.out.println("Index of " + searchFor + " is: " + BinarySearcher.binarySearch(pre2, 0, 9, searchFor));
		System.out.println("");
		assertEquals(-1, BinarySearcher.binarySearch(pre2, 0, 9, searchFor));
	}

}
