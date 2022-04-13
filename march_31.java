package assignment_dsa;

public class march_31 {
/*
 *  https://www.techiedelight.com/find-number-1s-sorted-binary-array/
https://www.techiedelight.com/find-floor-ceil-number-sorted-array/
 */
	public static void main(String[] args) {
       //1.
		int[] ar = { 0, 0, 0, 0, 1,1,1,1,1, 1, 1 };
        System.out.println("Total 1's present is : "+ count(ar, 0, ar.length - 1));
      //2.
        int[] nums = { 1, 4, 6, 8, 9 };
        for (int i = 0; i <= 10; i++) {
          System.out.println("Number " + i + " - ceil : " + getCeil(nums, i)+ ", floor : " + getFloor(nums, i));
        }
    }
		//2.
	 public static int getCeil(int[] nums, int x)
	 {
		 int left = 0, right = nums.length - 1;
		 int ceil = -1;
		 while (left <= right){
		 int mid = (left + right) / 2;
		 if (nums[mid] == x) {
		  return nums[mid];
		 	}
		 else if (x < nums[mid]){
			 ceil = nums[mid];
			 right = mid - 1;
			 }
		 else {
			 left = mid + 1;
			 }
		 }
		 return ceil;
		 }
	 public static int getFloor(int[] nums, int x)
	 {
		 int left = 0, right = nums.length - 1;
		 int floor = -1;
		 while (left <= right){
			 int mid = (left + right) / 2;
			 if (nums[mid] == x) {
				 return nums[mid];
				 }
			 else if (x < nums[mid]){
				 right = mid - 1;
				 }
			 else {
				 floor = nums[mid];
				 left = mid + 1;
				 }
			 }
		 return floor;
		 }
	 //1.
		    public static int count(int[] nums, int left, int right)
		    {
				if (nums == null || nums.length == 0) {
		            return 0;
		        }
		        if (nums[right] == 0) {
		            return 0;
		        }
		        if (nums[left] == 1) {
		            return (right - left + 1);
		        }
		        int mid = (left + right) / 2;
		        return count(nums, left, mid) + count(nums, mid + 1, right);
		    }
}


