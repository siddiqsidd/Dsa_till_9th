package assignment_dsa;
import java.util.*;
public class march_28 {
	//MARCH_28TH problems 
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
	int arr[]= {1,2,4,6,7,10,14,20,34,86,98};
	int[] arr1= {3,6,8};int arr2[]= {1,2,3,5,6,90,789};
	int value=2;
	//1.
	int finalValue=findelement(arr,value);
	if(finalValue==-1) {
	System.out.println(finalValue+ ", value is not present");
		}
	else {
		System.out.println(arr[finalValue]+ " is present and index position is : " +finalValue);
		}
	//2.
	int num=125;
	int cubeValue=cuberoot(num);
	System.out.println(cubeValue);
	//3.
	int find=0;
	for(int i=0;i<arr1.length;i++) {
		find=arr1[i];
		int finalintersct=intersection(find,arr2);
		System.out.print(arr2[finalintersct]+ " ");

	}
}//1. finding element using binary search
	private static int findelement(int[] arr, int value) {
		// TODO Auto-generated method stub
		int start=0,end=arr.length-1;
		while(start<=end) {
			int m=(start+end)/2;
			if(arr[m]==value) {
				return m;
			}
			else if(value>arr[m]) {
				start=m+1;
			
			}
			else
				end=m-1;
		}
		return -1;
	}
	//2.cuberoot using binary search
	private static int cuberoot(int num) {
		int start=0,end=num-1;
		while(start<=end) {
			int m=(start+end)/2;
			if(m*m*m==num) {
				return m;
			}
			else if(num>m*m*m) {
				start=m+1;
			}
			else
				end=m-1;
		}
		return -1;
	}

//3.finding intersection using binary search
	public static int intersection(int find,int[] arr2) {
		int start=0; int end=arr2.length-1;
			while(start<=end) {
				int m=(start+end)/2;
				if(arr2[m]==find) {
					return m;
				}
				else if(find>arr2[m]) {
					start=m+1;
				}
				else
					end=m-1;
			}
		
	return -1;	
	}

		
}


