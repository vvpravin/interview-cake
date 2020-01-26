package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperation {

	public static void main(String[] args) {
		// Initialize array1
		
		int[] array1 = new int[5];
		for(int i=0;i<array1.length;i++) {
			array1[i] = i;
		};
		
		int[] array2 = new int[3];
		
		// Array splicing
		array2 = Arrays.copyOfRange(array1, 0, 3);
		for(int j=0;j<array2.length;j++) {
			System.out.println(array2[j]);
		}
		
		
		//Dynamic array (alias) ArrayList, Mutable List 
		
		List<Integer> dynamicArray = new ArrayList<Integer>();
		dynamicArray.add(10);
		
	}

}
