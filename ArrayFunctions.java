import java.util.*;
import java.lang.Math;

class ArrayFunctions {
	
	void display(ArrayList<Integer> array) {
		
		// while directly printing array in cmd, convert to string
		System.out.println("Array is: "+array);
		
	}
	
	void evenOdd() {
		
		Input in = new Input();
		int[] array = in.arrayInput();
		
		/*Array List allows array creation without declaring size
		(it is dynamic)*/
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				even.add(array[i]);
			}
			else {
				odd.add(array[i]);
			}
		}
		display(even);
		display(odd);
	}
	
