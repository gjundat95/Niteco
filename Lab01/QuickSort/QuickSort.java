package QuickSort;

public class QuickSort {
	
	public int[] a;
	public QuickSort(int[] a) {
		this.a = a;
	}
	
	public int partition(int lef, int right){
		int i = lef,j = right;
		int tmp;
		int pivot = a[(int)(lef+right)/2];
		
		while(i <= j){
			while(a[i] < pivot)
				i++;
			while(a[j] > pivot)
				j--;
			if(i <= j){
				tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
			}
		}
		return i;
	}
	
	public void quickSort(int lef, int right){
		int index = partition(lef, right);
		if(lef < index - 1)
			quickSort(lef, index - 1);
		if(index < right)
			quickSort(index, right);
	}
	
	public int count(int number){
		int dem = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == number){
				dem++;
			}
				
		}
		return dem;
	}
	
	public int maxCount(){
		int count = count(a[0]);
		int number = 0;
		for(int i = 0; i < a.length; i++){
			if(count < count(a[i])){
				count = count(a[i]);
				number = a[i];
			}
		}
		return number;
	}
	
	public int findMin(){
		int min = a[0];
		for (int i : a) {
			if(i < min)
				i = min;
		}
		return min;
	}
	
	public int findMax(){
		int max = a[0];
		for (int i : a) {
			if(i > max)
				max = i;
		}
		return max;
	}
	
	public void printSort(){
		System.out.print("Sort ASC: ");
		for (int i : a) {
			System.out.print(" "+i);
		}
	}
	
}
