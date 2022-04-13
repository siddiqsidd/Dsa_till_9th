package assignment_dsa;

import java.util.*;

public class march_29 {
	/*
	 * 1. Find the smallest missing element from a sorted array 
	 * 2. Find the missing  term in a sequence in logarithmic time
	 */
	public static void main(String[] args) {
		//1.
		int[] a = { 0, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("smallestElement : " + smallestElement(a));
		//2.
		int[] arr = { 5, 7, 9, 13, 15 };
		System.out.println("The missing term : " + logarithmicMissingTerm(arr));
	}
//2
	public static int logarithmicMissingTerm(int[] nums) {
		//W C =O(Logn)
		int left = 0, right = nums.length - 1;
		int diff = (nums[nums.length - 1] - nums[0]) / nums.length;
		while (left <= right) {
			int mid = right - (right - left) / 2;
			if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
				return nums[mid + 1] - diff;
			}
			if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
				return nums[mid - 1] + diff;
			}
			if (nums[mid] - nums[0] != (mid - 0) * diff) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}
//1.
	public static int smallestElement(int[] a) {
		// W C=O(Logn)
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid == 0) {
				return mid;
			}
			if (a[mid] != mid && a[mid - 1] == mid - 1) {
				return mid;
			} else if (a[mid] == mid) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return a.length;
	}
}
