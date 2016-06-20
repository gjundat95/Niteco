package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	
	private String url;
	private double[] a;
	private File file;
	private FileInputStream fis;
	private FileOutputStream fos;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	public FileIO(String url) {
		this.url = url;
		
	}
	/**
	 * Check url exists, and create new url
	 */
	public void checkURL(){
		file = new  File(url);
		if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("Url khong ton tai.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void writeDouble(double[] a){
		checkURL();
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			for(double i : a){
				dos.writeDouble(i);
			}
			System.out.println("Nghi file thanh cong.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readDouble(){
		checkURL();
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			double d;
			while(dis.available() > 0){
				d = dis.readDouble();
				System.out.print(d+" ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Read double and sum2 double
	 * @return double Calculate sum of square of each number 
	 */
	public double sum2Double(){
		double d = 0;
		checkURL();
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			while(dis.available() > 0){
				double i = dis.readDouble();
				d += i*i;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return d;
	}
	
}
