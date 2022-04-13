package assignment_dsa;
import java.util.*;
public class april_6 {
/*
 * 1. Merge two sorted Arrays without extra space. 

2. Find the index of a row containing the maximum number of 1’s in a binary matrix
3. Find the transpose of a given matrix. 
Transpose Matrix is formed by changing all the row elements to column elements and vice -versa

 */
	static int N=2;
	public static void main(String[] args) {
		int a[] = {1,3,5,7};
		int b[] = {2,4,6,8};
		merge(a,b);
		int mat[][] = { {0,0, 0, 1, 1},
                {0,0, 1, 1, 1},
                {0,0,0,0,0},
                {0,1, 1, 1, 1},
                {0, 0, 0, 0,1}};

		System.out.println("Index of row with maximum 1s is " + rowWithMax1s(mat));
		int A[][] = { {2, 3, 4},
                {5, 6, 4}};

		int B[][] = new int[N][N], i, j;

		transpose(A, B);
		
		System.out.println(Arrays.deepToString(B));
	}
	//3.
	public static void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }
        
    }
	//2.
	public static int first(int arr[], int low, int high)
	{
	    if(high >= low)
	    {
	        int mid = low + (high - low)/2;
	        if ( ( mid == 0 || arr[mid-1] == 0) && arr[mid] == 1)
	            return mid;
	        else if (arr[mid] == 0)
	            return first(arr, (mid + 1), high);
	        else
	            return first(arr, low, (mid -1));
	    }
	    return -1;
	}
	public static int rowWithMax1s(int mat[][])
	{
		 int R = 4 ;
		 int C  = 4 ;
	    int max_row_index = 0, max = -1;
	    int i, index;
	    for (i = 0; i < R; i++)
	    {
	        index = first (mat[i], 0, C-1);
	        if (index != -1 && C-index > max)
	        {
	            max = C - index;
	            max_row_index = i;
	        }
	    }
	 
	    return max_row_index;
	}
	
	//1.
	public static void merge(int []a,int[] b) {
		int i = a.length-1;
		int j = 0;
		
		int temp =0;
		
		while(i>=0 && j<b.length)
		{
			if(a[i]>=b[j])
			{
				//swap
				/*temp = a[i];
				a[i]= b[j];
				a[i] = temp;*/
				
				  a[i] = a[i]^b[j]; b[j] = a[i]^b[j]; a[i] = a[i]^b[j];
				 
			}
			
			i--;
			j++;
		}
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
