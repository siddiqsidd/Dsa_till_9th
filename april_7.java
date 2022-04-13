package assignment_dsa;

public class april_7 {
/*
 * "1. Print the matrix in the spiral form
2. Given a boolean matrix mat[M][N] of size M X N, 
modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
 */
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printSpiral(arr);
		System.out.println();
		
		//2.
		int a[][] = {{1,0},{0,0}};
		int row = -1;
		int column = -1;
		boolean found = true;
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j] == 1)
				{
					found = true;
					row = i;
					column = j;
				}
			}
		}
		
		
		//row 
		if(found==true)
		{
			for(int j =0;j<a.length;j++)
			{
				a[row][j] = 1;
			}
			
			//column
			for(int i=0;i<a.length;i++)
			{
				a[i][column] = 1;
			}
			
		}
		
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	//1.
	private static void printSpiral(int[][] a) {
		int rowSize = a.length;
		int colSize = a[0].length;
		int top = 0; 
		int bottom = rowSize -1;
		int left = 0 ;
		int right = colSize -1;
		int dir = 1;
		while(top<=bottom && left<=right)
		{
			if(dir ==1)
			{
				for(int i =left;i<=right;i++)
				{
					System.out.print(a[top][i]+ " ");
				}
				
				top++;
				dir = 2;
			}
			
			else if(dir ==2)
			{
				for(int i =top;i<=bottom;i++)
				{
					System.out.print(a[i][right]+ " ");
				}
				right --;
				dir = 3;
			}
			else if(dir ==3)
			{
				for(int i = right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom --;
				dir = 4;
			}
			else if(dir == 4)
			{
				for(int i =bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+ " ");
				}
				left++;
				dir = 1;
			}
		}
		
	}


}
