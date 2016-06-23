package QuickSort;

public class Main {

	public static void main(String[] args) {
		
		int[] a =new int[]{0,0,0,1,2,2,2,2,3,3,3,3,3,9,8};
		QuickSort quickSort = new QuickSort(a);
		System.out.println("Min: "+quickSort.findMin());
		System.out.println("Min: "+quickSort.findMax());
		int maxCount = quickSort.maxCount();
		System.out.println("Most Freq: "+maxCount+"("+quickSort.count(maxCount)+" times"+")");
		quickSort.quickSort(1,a.length-1);
		quickSort.printSort();
	}

}
