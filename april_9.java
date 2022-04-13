package assignment_dsa;
import java.util.*;
public class april_9 {
/*
 * Write a program to print the fibonacci numbers recursively till n
Output -> 0,1,1,2,3,5
Write a program to find the nth fiboanncii number. Ex - n -> 4
Output - 2
write a recursive function to compute the sum of a array  eg: input: [1,2,5,5,10] => o/p:  23
 */
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+ " "+n2+ " ");
		printFibonacci(count-2);
		System.out.println(); int n = 4;
		 System.out.println("F(n) = " + fib(n-1));
		 int arr[] = {1,2,5,5,10};
         int sum = calculateSum(arr, arr.length);
         System.out.println(sum);
	}
	
	private static int calculateSum(int arr[], int n) {
		if (n <= 0) {
           return 0;
         }
         return calculateSum(arr, n-1 ) + arr[n-1];
      }
	//2.
	public static int fib(int n)
    {
        if (n <=1) {
            return n;
        }
 
        return fib(n - 1) + fib(n - 2);
    }
 
	
	//1.
	public static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 } 

}
