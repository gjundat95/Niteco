package FileIO;


import java.io.IOException;

public class Main {
	
	static String url = "/home/jundat95/laptrinh/exam.txt";
	static double[] data  = new double[]{1,2,4.5};
	
	public static void main(String[] args){
		
		FileIO fi = new FileIO(url);
		fi.writeDouble(data);
		fi.readDouble();
		System.out.println("\nSum2 Double: "+fi.sum2Double());
		
	}

}
