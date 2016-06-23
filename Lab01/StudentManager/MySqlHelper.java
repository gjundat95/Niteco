package StudentManager;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class MySqlHelper {

	//Const
	public static final String Student = "Student";
	public static final String Physics = "Physics";
	public static final String Math = "Math";
	public static final String Chemistry = "Chemistry";
	
	Connection conn = null;
	String db = "StudentManager";
	String url = "jdbc:mysql://127.0.0.1:3306/";
	String className = "com.mysql.jdbc.Driver";
	String user = "root";
	String pass = "";
	
	/**
	 *  Construct, create Connection in MySql
	 */
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
	
	/**
	 * Add one student to table student
	 * @param st 						Student 
	 */
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
	
	/**
	 * Update Mark for Student
	 * @param st 					Student
	 * @param nameTable 			Table Name
	 */
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
	
	/**
	 * Print once Student
	 * @param id 				Id Student
	 * @param nameTable 		Table name
	 * @return ResultSet 
	 */
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
	/**
	 * Print Student
	 * @param nameTable				Table Name
	 * @return	ResultSet
	 */
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
	
	/**
	 * Print Class
	 * @param id 					Id Class
	 * @return ResultSet
	 */
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
