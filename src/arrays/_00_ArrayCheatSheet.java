package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Bob", "Kevin", "Steward", "Maddox", "Nick"};		
 		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[3]= names[0];
		//4. print the third element again
		System.out.println(names[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<names.length;i++) {
			System.out.println(i);
		}
		//6. make an array of 50 integers
		int [] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for(int o = 0; o<nums.length;o++) {
			nums[o] = random.nextInt(100);
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = nums[0];
		for(int e = 1; e<nums.length;e++) {
			if(nums[e]<smallest) {
				smallest = nums[e];
			}
				

		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	
	int largest = nums[0];
	for(int a = 1; a<nums.length;a++) {
		if(nums[a]>largest) {
			largest = nums[a];
		}
		
	}
	System.out.println(largest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}








































