package StudentManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManager {
	
	static MySqlHelper helper = new MySqlHelper();
	static Scanner input = new Scanner(System.in);
	
	

	public static void addStudentInfo(){
		String choose = null;
		do{
			Student st = new Student();
			System.out.println("Nhap thong tin Sinh Vien:---------------------------------------------");
			System.out.println("Nhap "+"\"Exit\"" +" de thoat--------------------------------------------------");
			System.out.println("Nhap ten sinh Vien: ");
			st.name = input.nextLine();
			choose = st.name;
			if(choose.equalsIgnoreCase("Exit")){
				break;
			}
			System.out.println("Nhap tuoi: ");
			st.age = Integer.parseInt(input.nextLine());
			System.out.println("Nhap ma lop: ");
			st.idclass = Integer.parseInt(input.nextLine());
			helper.addStudentInfor(st);
			
		}while(true);
	}
	

	public static void updateStudentMark(){
		ResultSet rs = null;
		rs = helper.printStudent(MySqlHelper.Student);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Update mark Student---------------------------------------------------");
		try {
			while(rs.next()){
				Student st = new Student();
				String subject = "";
				int n = 0;
				st.id = rs.getInt(1);
				st.name = rs.getString(2);
				st.age = rs.getInt(3);
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Student: "+st.name);
				
				for(int i = 0; i < 3; i++){
					if(n == 0){
						subject = "Math";
					}
					if(n == 1){
						subject = "Physics";
					}
					if(n == 2){
						subject = "Chemistry";
					}
					System.out.println("Subject: "+subject);
					System.out.println("Input testMark: ");
					st.testmark = Integer.parseInt(input.nextLine());
					System.out.println("Input exMark: ");
					st.exmark = Integer.parseInt(input.nextLine());
					autoMark(n, st);
					n++;
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Auto input to Mark
	 * @param i 					Subject
	 * @param st 					Sdtudent 
	 */
	public static void autoMark(int i,Student st){
		if(i == 0){
			helper.updateStudentMark(st, MySqlHelper.Math);
		}
		if(i == 1){
			helper.updateStudentMark(st, MySqlHelper.Physics);
		}
		if(i == 2){
			helper.updateStudentMark(st, MySqlHelper.Chemistry);
		}
	}
	

	public static void printOnceStudent(){
		ResultSet rs = null;
		
		System.out.println("Enter id Student: ");
		int id = Integer.parseInt(input.nextLine());
		rs = helper.printStudent1(id, MySqlHelper.Student);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Iformation Student------------------------------------------------");
		try {
			System.out.println("ID"+"     "+"Name"+"                  "+"Age");
			while(rs.next()){
			System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"                 "+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fail ID Student.");
		}
	}
	

	public static void printClass(){
		
		ResultSet rs = null;
		System.out.println("Enter id Class: ");
		int id = Integer.parseInt(input.nextLine());
		rs = helper.printClass(id);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Iformation Student------------------------------------------------");
		try {
			System.out.println("ID"+"     "+"Name"+"                  			 "+"Age");
			while(rs.next()){
			System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"                 "+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fail ID Student.");
		}
	}
	
	public static boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
}
