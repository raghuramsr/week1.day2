package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if((i+1)!=arr[i] )
			{
				System.out.println("Missing Number in this array is "+ (i+1));
				break;
			}
		}

	}

}
