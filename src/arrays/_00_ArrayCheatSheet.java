package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = new String[5];
		String[] array2 = {"1st","2nd","3rd","4th","5th"};
		//2. print the third element in the array
		System.out.println(array2[2]);
		//3. set the third elemAent to a different value
		array2[2] = "test";
		//4. print the third element again
		System.out.println(array2[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
			
		}
		
		
		
		//6. make an array of 50 integers
		int array3[] = new int[50];
		
		
		//7. use a for loop to make every value of the integer array a random number
		
		Random ran = new Random();
		for(int i = 0; i < array3.length;i++) {
		array3[i] = ran.nextInt(50);
		}
		int e = array3[0];
		for(int i = 0; i < array3.length;i++) {
			if(array3[i] < e) {
				e=array3[i];
			}
		}
		System.out.println(e);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		for(int i = 0; i < array3.length;i++) {
		if(array3[i] > e)
			e=array3[i];
		}
		System.out.println(e);
		
		
		
		
	}
}
