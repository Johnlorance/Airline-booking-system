package application;


import java.sql.*;

public class Customer {
	 
	public String Register(String Email,String Password,String Name,String Dateofbirth,String Phone_number) throws SQLException { // Function to handle The customer registration process
	        String key = "false" ;
		try {
	            String d="/";
				if (passcheck(Password) && mailcheck(Email) && namecheck(Name) && (Dateofbirth.indexOf(d)==2) &&(Dateofbirth.lastIndexOf(d)==5)){
					

				key = "true";
	        	Email="'"+Email+"'";
	            Password="'"+Password+"'";
	            Name="'"+Name+"'";
	            Dateofbirth="'"+Dateofbirth+"'";
	            Phone_number="'"+Phone_number+"'";
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
	            Statement stmt = (Statement) conn.createStatement();
	             String query1 = "INSERT INTO customer " + "VALUES ("+Email+", "+Password+", "+Name+", "+Dateofbirth+", "+Phone_number+")";
	             stmt.executeUpdate(query1);}
				return key;
				}
		

	        catch (ClassNotFoundException e){e.printStackTrace();}
		
		catch (SQLIntegrityConstraintViolationException e){ return "The Email/Phone Number Might be Taken, Try Again"; }
		return key;
		
	
	}

	public boolean login(String Phone_number, String Password) throws SQLException {// Function to check the Phone number and the password of the user to allow login
	     boolean key=false;
	     try {
	              Class.forName("com.mysql.cj.jdbc.Driver");

	              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
	              ResultSet rs = null;
	              String sql = "select * from customer";
	              PreparedStatement p = conn.prepareStatement(sql);
	              rs = p.executeQuery();

	              while (rs.next()) {
	                    String phone_number = rs.getString("phone_number");
	                    String password = rs.getString("password");
	                    if(phone_number.equals(Phone_number)&password.equals(Password)){
	                       key=true;}}}

	        catch (ClassNotFoundException e){e.printStackTrace();}
	        return key;}
	
	 
	 public boolean passcheck(String pass) {// Checks the password to see if it follows the requirements
		 boolean numberFlag = false;
		 boolean upperFlag = false;
		 if (pass.length() > 7) {
			 for(int i=0 ; i < pass.length() ; i++) {
			        char ch = pass.charAt(i);
			        if( Character.isDigit(ch)) {
			            numberFlag = true;
			        }
			        if (Character.isUpperCase(ch)) {
			            upperFlag = true;
			        }
			        if(numberFlag && upperFlag)
			            return true;
			    }
			    return false;
		 }
		 return false;
		 }
	 
	 public boolean mailcheck(String mail) {// Checks the mail to see if it follows the requirements
	        boolean atflag = false;
	        
	        if (mail.length() > 3) {
	        for (int i=0 ; i < mail.length() ; i++) {
	            if (mail.indexOf('@') != -1) {
	                atflag = true;
	            }
	            if (atflag) {
	                return true;
	            }
	        }
	        return false;
	    }
	    return false;
	    }
	 
	 public boolean namecheck(String name) {// Checks the name to see if it follows the requirements
	        String[] illegalv = {".", "," ,"\\", "|", "/", "{", "}", "(", ")", "[", "]", "!", "@", "#", "$", "%", "^", "&", "*", "-", "_", "+", "=","`", "~", "0","1","2","3","4","5","6","7","8","9"};
	        for (String v: illegalv) {
	            if (name.contains(v)) {
	                return false;
	            }
	        }
	        return true;
	    }

}