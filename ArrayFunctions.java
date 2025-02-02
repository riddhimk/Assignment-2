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
	
	/*gives the first index of the numbers with the smallest difference*/
	void smallestDifference() {
		Input in = new Input();
		int[] array = in.arrayInput();
		int minDiff = 9999;
		int minIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				int diff = array[i] - array[j];
				int absDiff = Math.abs(diff);
				if(absDiff < minDiff) {
					minDiff = absDiff;
					minIndex = i;
				}
			}
		}
		
		System.out.println("Minimum Index = "+minIndex);
	}

	// funtion to convert array to array list
	void arrayToArrayList(int[] array) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i : array) {
			arrayList.add(i);
		}

		System.out.println("Array List = "+arrayList);
	}

	// funtion to convert array list to array
	void arrayListToArray(ArrayList<Integer> arrayList) {

        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        System.out.println("Array: " + Arrays.toString(array));
    }
}