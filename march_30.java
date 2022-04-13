package assignment_dsa;
import java.util.*;
public class march_30 {
/*
 * 1. Finding Missing Number in an array binary search
2. https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
	public static void main(String[] args) {
		//1.
		int ar[] = {0, 1, 2, 3, 4, 5, 6, 8 }; int target=10;
		System.out.println("Missing number: " +search(ar));
		//2.
		int[] a= {1,3,5,7,8,9};
		System.out.print("the index position of the sums are : "+twoSum(a,target));
		System.out.print(","+twoSum1(a,target));
	}
	//1.
	public static int search(int ar[])
   	{
		int a = 0, b =ar.length- 1;
		int mid = 0;
		while ((b - a) > 1)
		{
		  mid = (a + b) / 2;
		  if ((ar[a] - a) != (ar[mid] - mid))
		      b = mid;
		  else if ((ar[b] - b) != (ar[mid] - mid))
		      a = mid;
		}
		return (ar[a] + 1);
	}
	//2.
	public static int twoSum(int[] ar, int target) {
        for(int i=1;i<ar.length;i++){
            for(int j=1;j<ar.length;j++){
                if(ar[i]+ar[j]==target)
                    return i;
                
            }
        }
        return 0;
    }
	public static int twoSum1(int[] ar, int target) {
        for(int i=1;i<ar.length;i++){
            for(int j=1;j<ar.length;j++){
                if(ar[i]+ar[j]==target)
                    return j;
                
            }
        }
        return 0;
    }

		
}
