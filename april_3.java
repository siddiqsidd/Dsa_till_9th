package assignment_dsa;
import java.util.*;
public class april_3 {
/*
 *  https://leetcode.com/problems/majority-element/
https://leetcode.com/problems/valid-anagram/
https://leetcode.com/problems/sorting-the-sentence/
Search for an element in the Circular Sorted Array.
Ex- {​12,15,2,4,7,9}​  Search for 7
 */
	public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 3, 2 };
        int[] nums= {12,15,2,4,7,9};
        int n = arr.length;
        //1.
        System.out.println(findMajority(arr , n));
        //2.
        isAnagram("anagram", "nagaram");  
        isAnagram("rat", "car"); 
        String s = "is2 sentence4 This1 a3";
        //3.
        System.out.println(sortSentence(s));
       //4.
        int key = 4;
        int index = searchCircularArray(nums, key);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
	}
	public static int searchCircularArray(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[mid] <= nums[right])
            {
                if (target > nums[mid] && target <= nums[right]){
                	left = mid + 1;
                }
                else {
                    right = mid - 1;       
                }
            }
            else {
                if (target >= nums[left] && target < nums[mid])
                {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;        
                }
            }
        }
        return -1;
    }
	public  static void isAnagram(String str1, String str2) {  
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println("true");  
	        } else {  
	            System.out.println("false");  
	        }  
	    }  
		public static int findMajority(int arr[], int n)
	    {
	        int maxCount = 0;int count = 0;
	        int index = -1; int i;
	        for ( i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (arr[i] == arr[j])
	                    count++;
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                index = i;
	            }
	        }
	        if (maxCount > n / 2)
	            return arr[index];
	 
	        else
	            System.out.println("No Majority Element");
	        return 0;
	    	
	    }
	    public static String sortSentence(String s) {
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        Arrays.sort(words, new Comparator<String>() {
	    
	            @Override
	            public int compare(String A, String B) {
	                return A.charAt(A.length() - 1) - B.charAt(B.length() - 1);
	            }
	        });
	        
	        for (int i = 0; i < words.length; i++) {
	            result.append(words[i].substring(0, words[i].length() - 1) 
	                          + (i == (words.length - 1) ? "" : " "));
	        }
	        
	        return result.toString();
	    }
}
	



