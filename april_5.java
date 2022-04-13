package assignment_dsa;
import java.util.*;
public class april_5 {
/*
 * 	"1. Segregate the prime numbers and non- prime numbers in an array. 
Prime numbers should appear left in the array and non prime numbers should appear right in the array 
a[] = {1,4,23,78,54,13,89}
2. move zeros to end in linear TC and single pass.
3. Sort 0s 1s 2s in linear TC
4. Find if a given String is Palindrome or not in 2 pointer approach"tea
 */
	public static void main(String[] args) {
		int a[] = {1,4,23,78,54,13,89};
		segregate(a);
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        zerosToEnd(arr, n);
        System.out.println(Arrays.toString(arr));
        int a1[] = { 2, 2, 2, 1, 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0, 0 };
        sort(a1);
        System.out.println(Arrays.toString(a1));
        String str = "mom";
        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.print("it's a palindrome");
        else
            System.out.print("it's not a palindrome");
	}
	static boolean isPalindrome(String str)
    {
		int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
	
	//3.
	private static void sort(int[] a) {

		int count1 = 0;
		int count0 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count0++;
			}

			else if (a[i] == 1) {
				count1++;
			}

			else {
				count2++;
			}

		}
		
		System.out.println("count0 : "+count0);
		System.out.println("count1 : "+count1);
		System.out.println("count2 : "+count2);


		for (int i = 0; i < count0; i++) {
			a[i] = 0;
		}

		for (int i = count0; i < (count0+count1); i++) {
			a[i] = 1;
		}

		for (int i = count0+count1; i < a.length; i++) {
			a[i] = 2;
		}

	}
	
	//2.
	static void zerosToEnd(int arr[], int n)
    {
        int count = 0;  
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
        while (count < n)
            arr[count++] = 0;
    }
	//1.
    private static void segregate(int[] arr) {
    	int left = 0;
		int right = arr.length-1;
		
		while(left<right)
		{
			if(arr[left]%2==1)
				left++;
			else if(arr[right]%2==0)
				right--;
			else if(arr[left]%2==0 && arr[right]%2==1)
			{
				 
				 int temp=arr[left];
		          arr[left]=arr[right];
		          arr[right]=temp;
		          left++;
		          right--;
			}
		}	
		System.out.println(Arrays.toString(arr));
	}
}


