package QuickSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> listNumber = new ArrayList<Integer>();
		System.out.println("Input "+"\"Exit \"" + ":");
		do{
			System.out.print("Input Number: ");
			String number = input.nextLine();
			if(number.equalsIgnoreCase("exit")){
				break;
			}
			listNumber.add(Integer.parseInt(number));
		}while(true);
		
		int[] a = toIntArray(listNumber);
		QuickSort quickSort = new QuickSort(a);
		System.out.println("Min: "+quickSort.findMin());
		System.out.println("Min: "+quickSort.findMax());
		int maxCount = quickSort.maxCount();
		System.out.println("Most Freq: "+maxCount+"("+quickSort.count(maxCount)+" times"+")");
		quickSort.quickSort(1,a.length-1);
		quickSort.printSort();
	}
	
	static int[] toIntArray(ArrayList<Integer> list){
		  int[] ret = new int[list.size()];
		  for(int i = 0;i < ret.length;i++)
		    ret[i] = list.get(i);
		  return ret;
	}
	
	static boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	    	 System.out.println("Not is number.");
	         return false;  
	      }  
	}

}
