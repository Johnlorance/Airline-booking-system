package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;


public class Admin {
	
	 public boolean login(String Email, String Password) throws SQLException {//Function to check the Email and the password of the Admin to allow login
		 boolean key=false;
		 try {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				
				  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
				  ResultSet rs = null;
				  String sql = "select * from admin";
				  PreparedStatement p = conn.prepareStatement(sql);
                                  rs = p.executeQuery();
			      
			      while (rs.next()) {
			    	String email = rs.getString("email");
		                String password = rs.getString("password");    
		                if(email.equals(Email)&password.equals(Password)){
		            	   key=true;}}}
			
			catch (ClassNotFoundException e){e.printStackTrace();}
		    return key;}
	 
	 
	 public String add_plane(int ID,String Name, String From,String To,String Date,String Time ,float Prices,int Seats,String Gate) throws SQLException{// Function that allows the Admin to add a new flight details in the flights table
		 
		 try {
				Name="'"+Name+"'";
				Date="'"+Date+"'";
				From="'"+From+"'";
				To="'"+To+"'";
				Time="'"+Time+"'";
				Gate="'"+Gate+"'";
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
				Statement stmt = (Statement) conn.createStatement();
			     String query1 = "INSERT INTO plane " + "VALUES ("+ID+", "+Name+", "+From+", "+To+", "+Date+", "+Time+", "+Prices+", "+Seats+", "+Gate+")";
			     stmt.executeUpdate(query1);} 
			
			catch (ClassNotFoundException e){e.printStackTrace();}
		 catch (SQLIntegrityConstraintViolationException e){ return "The ID is already taken"; }return"";}
	 


	 public String delete_plane(int ID) throws SQLException {//Function that allows the Admin to delete any Flight and delete all the tickets associated with it 
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
				Statement stmt = (Statement) conn.createStatement();
				ResultSet rs = null;
				String sql = "select * from plane"; 
				PreparedStatement p = conn.prepareStatement(sql);
		        rs = p.executeQuery();
		        
		        while (rs.next()) {
		        	int id2 = rs.getInt("id");
		        	
		        	if (id2 == ID) {
		        		String query1 = "delete from  plane " +
		      		          "where id="+ID;
		      		          stmt.executeUpdate(query1);
		      		          return "";}
		        	else {continue;}}} 
			
			catch (ClassNotFoundException e) {
				
				e.printStackTrace();}return "Cannot Remove a NoneExisting Flight";}


     public String delete_user(String phone_number) throws SQLException {//Function that allows the Admin to delete any User and its details from the database
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = null;
		String sql = "select * from customer";
		PreparedStatement p = conn.prepareStatement(sql);
		rs = p.executeQuery();
		while (rs.next()) {
			String pho = rs.getString("phone_number");
			if (pho.equals(phone_number)) {
				String query1 = "delete from customer " +
				          "where phone_number= "+phone_number;
				          stmt.executeUpdate(query1);return "";}
			else {
				continue;}}} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();} return "Cannot Remove a Nonexisting Customer.";}



  }