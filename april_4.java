package assignment_dsa;
import java.util.*;
public class april_4 {
/* 1. Write a program to sort an array using insertion sort
2 .Add elements in arraylist and change the 3rd index element
3.Coply all elements from one list to another
4.Sort arraylist in descending order
5.https://leetcode.com/problems/find-the-difference/
 */
	public static void main(String[] args) {
		int[] arr= {1,4,3,5,6,9,8};
		int n=arr.length;
		System.out.println(Arrays.toString(insertionSort(arr,n)));
		listProblems();
		copyList();
		descending();
		System.out.println();
		String s = "abcd";
		String t = "abcde";
		char ans=findTheDifference(s,t);
		System.out.println(ans);
		}
	//5
	public static char findTheDifference(String s, String t) {
        int charCodeS=0, charCodeT=0;
    for(int i=0;i<s.length();i++){
        charCodeS +=(int)s.charAt(i);
    }
    for(int i=0;i<t.length();i++){
        charCodeT+=(int)t.charAt(i);
    }
    return (char) (charCodeT-charCodeS);
	}
	//4
	public static void descending()
	{
		  ArrayList<String> arraylist = new ArrayList<String>();
		    arraylist.add("siddiq");
		    arraylist.add("nehal");
		    arraylist.add("jayanth");
		    arraylist.add("virat");
		    for(String str: arraylist){
		   System.out.println(str);
		  }
		    Collections.sort(arraylist, Collections.reverseOrder());
		    System.out.println("ArrayList in descending order:");
		    for(String str: arraylist){
		   System.out.print(str+ " ");
		    }
	}
	//3.
	public static void copyList()
	{
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> copy = new ArrayList<>(list);
		System.out.println(copy.toString());
	
	}
	//2.
		public static void listProblems() {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.set(3-1, 25);
		System.out.println(list);
	}//1.
	public static int[] insertionSort(int[] arr, int n) {
		int key=0;
		for(int i=1;i<n;i++) {
			key=arr[i];	
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			}
		return arr;
	}
}
