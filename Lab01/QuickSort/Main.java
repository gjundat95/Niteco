package QuickSort;

public class Main {

	public static void main(String[] args) {
		int[] a =new int[]{0,1,9,2,3,8,7,6,5,4};
		QuickSort quickSort = new QuickSort(a);
		quickSort.quickSort(1, 9);
		quickSort.printSort();
		
	}

}
