package StudentManager;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class MySqlHelper {

	//Const
	public static String Student = "Student";
	public static String Physics = "Physics";
	public static String Math = "Math";
	public static String Chemistry = "Chemistry";
	
	Connection conn = null;
	String db = "StudentManager";
	String url = "jdbc:mysql://127.0.0.1:3306/";
	String className = "com.mysql.jdbc.Driver";
	String user = "root";
	String pass = "";
	
	public MySqlHelper(){
		
		try {
			Class.forName(className);
			conn = (Connection)DriverManager.getConnection(url+db,user,pass);
			System.out.println("Connect Complete.");
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("\nClass Name not exists.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("\nError connect.");
		}
	}
	
	public void addStudentInfor(Student st){
		
		String query = "Insert Into Student "+"(name,age,idclass)" + "Values"+"(?,?,?)";
		
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1,st.name);
			statement.setInt(2, st.age);
			statement.setInt(3, st.idclass);
			int row = statement.executeUpdate();
			if(row > 0){
				System.out.println("Insert into Student complete.");
			}else{
				System.out.println("Not insert Student.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudentMark(Student st,String nameTable){
		
		String query = "Insert Into "+nameTable+"(testmark,exmark,summark,idsudent)" + "Values(?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1,st.testmark);
			statement.setInt(2,st.exmark);
			statement.setInt(3,(st.exmark+st.testmark));
			statement.setInt(4, st.id);
			int n = statement.executeUpdate();
			if(n>0){
				System.out.println("Update into"+nameTable+" Complate.");
			}else{
				System.out.println("Update into"+nameTable+" fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet printStudent1(int id, String nameTable){
		ResultSet rs = null;
		String query = "Select * From "+nameTable+" Where id = ?";
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet printStudent(String nameTable){
		ResultSet rs = null;
		String query = "Select * From "+nameTable;
		try {
			Statement statement = (Statement)conn.createStatement();
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet printClass(int id){
		ResultSet rs = null;
		String query = "Select Student.* From Class,Student "+"Where Student.idclass = Class.id " + "and Class.id = ?";
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
}
