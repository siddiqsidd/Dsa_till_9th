package assignment_dsa;
import java.util.*;
public class april_8 {
/*
 * Solve the problems below using recursion-
1. Print odd numbers till 31
2. Find the factorial of a number
3. Find the nth power of any given number
4. Print the reverse of a string
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    int num1=1,num2;
		    System.out.print("Enter your Limit:");
		    num2=s.nextInt();
		    System.out.println("All odd number given range are:");
		    odd(num1,num2);
		    int number=5;
		    System.out.println();
		    System.out.println(factorial(number));
		    int n=2;int p=3;
			int finalValue=power(n,p);
			System.out.println(finalValue);
			String str="siddiq";
			reverseString(str);
	}
	//4.
	private static void reverseString(String s) {
		if(s.length()-1==0) {
			System.out.print(s);
			return;
		}
		System.out.print(s.charAt(s.length()-1));
		reverseString(s.substring(0,s.length()-1));
	}
	
	//3.
	public static int power(int n,int p){    
		  if ( p==0) {
		    return  1;
		    } 
		     else
		     return (n * power(n, p - 1));
		  }  
	
	//2.
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else
		return n*(factorial(n-1));
	}
	//1.
	static int odd(int num1, int num2)
	{
		 if(num1>num2)
			    return 0;
			   System.out.printf(num1+" ");
			return odd(num1+2,num2);
		}

}
