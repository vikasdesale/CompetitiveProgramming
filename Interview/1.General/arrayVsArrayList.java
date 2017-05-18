import java.util.ArrayList;

public class arrayVsArrayList {

	public static void main(String[] args) {
		int[] myArray = new int[6];
		myArray[7]= 10; // ArraysOutOfBoundException

		//Declaration of ArrayList. Add and Remove of elements is easy.
		ArrayList<Integer> myArrayList = new ArrayList<>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		myArrayList.remove(0);
		
		for(int i = 0; i < myArrayList.size(); i++) {
		System.out.println("Element: " + myArrayList.get(i));
		}
		
		//Multi-dimensional Array 
		int[][][] multiArray = new int [3][3][3]; 
	}
}