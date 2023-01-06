package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookProcess {
	

	public ArrayList<String> display_plane() throws SQLException {// A function that displays all the flights available to the user on the screen
		String Line_details=null;
		 ArrayList<String>list=new ArrayList<String>();
		 
		 try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");

             ResultSet rs = null;
             String sql = "select * from plane";
             PreparedStatement p = conn.prepareStatement(sql);
             rs = p.executeQuery();

             while (rs.next()) {
                   int ID = rs.getInt("id");
                   String From = rs.getString("from");
                   String To = rs.getString("to");
                   String Date = rs.getString("Date");
                   String Time = rs.getString("time");
                   float Price = rs.getFloat("price");
                   int Seats = rs.getInt("seats");
                   String gate=rs.getString("gate");
                   
                   if(Seats>0) {
                	   Line_details= "ID: "+ID +"\t\t "+From +" -----> "+ To + "\t\t Date: "+Date+"\t\t Time: "+Time+"\t\t Price: "+Price+"\t\t Seats Left: "+Seats+"\t\t Gate: "+gate;
                       list.add(Line_details);}}}
		 catch (ClassNotFoundException e){e.printStackTrace();}return list;}
	
	
	public ArrayList<String> display_plane2() throws SQLException {//A function that display the flight for the user in a shorter version to choose from
		String Line_details=null;
		 ArrayList<String>list=new ArrayList<String>();
		 try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");

             ResultSet rs = null;
             String sql = "select * from plane";
             PreparedStatement p = conn.prepareStatement(sql);
             rs = p.executeQuery();

             while (rs.next()) {
                   int ID = rs.getInt("id");
                   String From = rs.getString("from");
                   String To = rs.getString("to");
                   String Date = rs.getString("Date");
                   float Price = rs.getFloat("price");
                   int Seats = rs.getInt("seats");
                   if(Seats>0) {
                	   Line_details= "ID: "+ID +", "+From + " --> "+ To + ", Date: "+Date+", Price: "+Price+".";
                       list.add(Line_details);
                       
                   }
                   }}

       catch (ClassNotFoundException e){e.printStackTrace();}return list;}

		
	public String add_visa(String Card_number,String Expiration_date,int Security_code,String name,String Phone_number) throws SQLException {// A function that allows the user the add a new visa
	
	try {if(!(Card_number.length()==14) || String.valueOf(Security_code).length()!=3){
		           return "1";}
	           else{
	        	name="'"+name+"'";
	            Expiration_date="'"+Expiration_date+"'";
	            Phone_number="'"+Phone_number+"'";
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
	            Statement stmt = (Statement) conn.createStatement();
	            
	            String query1 = "INSERT INTO visa " + "VALUES ("+Card_number+", "+Expiration_date+", "+Security_code+", "+name+", "+Phone_number+")";
	            stmt.executeUpdate(query1); }}
	
	         catch (ClassNotFoundException e){e.printStackTrace();}
         catch (SQLIntegrityConstraintViolationException e){ return "-1"; }
	return"";}
	
	
public String delete_visa(String Last_4) throws SQLException {// A Function that deletes a visa by the last 4 digits in the card
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
			Statement stmt = (Statement) conn.createStatement();
			String sql = "select * from visa";
            PreparedStatement p = conn.prepareStatement(sql);
			ResultSet rs = null;
			rs = p.executeQuery();

             while (rs.next()) {
                   
             String card_num = rs.getString("card_number");
             if(card_num.substring(10, 14).equals(Last_4)){
            	 String query1 = "delete from visa " +
   			          "where card_number= "+card_num;
   			          stmt.executeUpdate(query1);
   			          return "";}
             else {continue;}}}
		
		catch (ClassNotFoundException e) {e.printStackTrace();} return "-1";}

public ArrayList<String> Ticket_reservation(String Name,String Phone_number,String Passport,String T_class,String plane) throws SQLException { // A function to handle the Ticket reservation and returns the information of the user's ticket
	int Plane_ID;
	String Plane_name;
    String Plane_takeoff;
    String Plane_gate;
    int plane_seats=0;
    String ticket_seat=null;
    String flight_from;
    String flight_to;
    String plane_Date;
    ArrayList<String>ticket_list = new ArrayList<String>();
    
    
    int s= plane.indexOf(": ");
    int e= plane.indexOf(", ");
    
    int plane_id = Integer.parseInt(plane.substring(s+2, e));
	try {
		
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
        Statement stmt = (Statement) conn.createStatement();
        ResultSet rs = null;
		 String sql = "select * from plane";
		 PreparedStatement p = conn.prepareStatement(sql);
          rs = p.executeQuery();
	      while (rs.next()) {
	    	    Plane_ID = rs.getInt("id");
                Plane_name=rs.getString("name");
                plane_Date = rs.getString("Date");
                Plane_takeoff=rs.getString("time");
                Plane_gate=rs.getString("gate");
	            plane_seats=rs.getInt("seats");
	            flight_from = rs.getString("from");
	            flight_to = rs.getString("to");
	      if(plane_id==Plane_ID) {
	    if(plane_seats>50){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "A"+temp.charAt(1);
	    	}
	    else if(plane_seats>=40&plane_seats<50){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "B"+temp.charAt(1);
	    	}
	    else if(plane_seats>=30&plane_seats<40){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "C"+temp.charAt(1);
	    	}
	    else if(plane_seats>=20&plane_seats<30){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "D"+temp.charAt(1);
	    	}
	    else if(plane_seats>=10&plane_seats<10){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "E"+temp.charAt(1);
	    	}
	    else if(plane_seats>=1&plane_seats<10){
	    	String temp=String.valueOf(plane_seats);
	    	ticket_seat= "F"+temp.charAt(0);
	    	} 
	    
	    plane_seats= plane_seats-1;
	    String sqlUpdate = "UPDATE plane "
	                + "SET seats="+ plane_seats
	                + " WHERE id="+plane_id;
	    stmt.executeUpdate(sqlUpdate);
	       
	      String Phone_number1="'"+Phone_number+"'";
	      String Name1="'"+Name+"'";
	      String Passport1="'"+Passport+"'";
	      String Plane_name1="'"+Plane_name+"'";
	      String flight_from1="'"+flight_from+"'";
	      String flight_to1="'"+flight_to+"'";
	      String Date = "'"+plane_Date+"'";
	      String Plane_takeoff1="'"+Plane_takeoff+"'";
	      String Plane_gate1="'"+Plane_gate+"'";
	      String ticket_seat1="'"+ticket_seat+"'";
	      String T_class1="'"+T_class+"'";
	     
	    String query1 = "INSERT INTO ticket_reservation " + "VALUES ("+Phone_number1+", "+Name1+", "+Passport1+", "+Plane_ID+", "+Plane_name1+", "+flight_from1+", "+flight_to1+", "+Date+", "+Plane_takeoff1+", "+Plane_gate1+", "+ticket_seat1+", "+T_class1+")";
        stmt.executeUpdate(query1);
        String plid = String.valueOf(Plane_ID);
        ticket_list.add(Name);
        ticket_list.add(plid);
        ticket_list.add(Plane_takeoff);
        ticket_list.add(Plane_gate);
        ticket_list.add(ticket_seat);
        ticket_list.add(flight_from);
        ticket_list.add(flight_to);
        ticket_list.add(plane_Date);
        return ticket_list;}}}
	     
	catch (ClassNotFoundException f){f.printStackTrace();}return ticket_list;}



public boolean Ticket_cancellation(int Plane_id,String passport_id) throws SQLException {// Function to handle the ticket_cancellation
	boolean key=false;
	
	 try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");

		  
		  ResultSet rs = null;
		  String sql = "select * from ticket_reservation";
		  PreparedStatement p = conn.prepareStatement(sql);
		  Statement stmt = (Statement) conn.createStatement();
           rs = p.executeQuery();
         
	      
	      while (rs.next()) {
	    	   int plane_id = rs.getInt("plane_id");
               String Passport_id = rs.getString("passport_id");  
               
               if( Passport_id.equals(passport_id)){
               if((plane_id==Plane_id)){
                key=true;
          		String query1 = "delete from ticket_reservation " + "where plane_id="+plane_id;
          		stmt.executeUpdate(query1);break;}
}}
     
              if(key) { 
            	ResultSet rs2 = null;
            	String sql2 = "select * from plane";
            	PreparedStatement p2 = conn.prepareStatement(sql2);
            	Statement stmt2 = (Statement) conn.createStatement();
            	rs2 = p2.executeQuery();
       	        while (rs2.next()) {
       	        int plane_seats=rs2.getInt("seats");   
       	        int P_id=rs2.getInt("id");   
       	        if(P_id==Plane_id) {
       	        plane_seats= plane_seats+1;
       	        String sqlUpdate = "UPDATE plane "+ "SET seats="+plane_seats + " WHERE id="+Plane_id;
       	  	    stmt2.executeUpdate(sqlUpdate);}}}}
       	        


		catch (ClassNotFoundException e){e.printStackTrace();}return key;}

    public ArrayList<String> filtered(String fr, String to) throws SQLException {// Returns the values of the filtered list

	ArrayList<String>list = new ArrayList<String>();
	
		 try {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				
				  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
				  ResultSet rs = null;
				  String sql = "select * from plane";
				  PreparedStatement p = conn.prepareStatement(sql);
		          rs = p.executeQuery();
			      String Line_details;
			      while (rs.next()) {
			    	    String From = rs.getString("from");
		                String To = rs.getString("to");    
		                if(From.equals(fr)&To.equals(to)){
		                	int ID = rs.getInt("id");
		                    String Date = rs.getString("date");
		                    String Time = rs.getString("time");
		                    float Price = rs.getFloat("price");
		                    int Seats = rs.getInt("seats");
		                	Line_details= "ID: "+ID +"\t\t "+From +" -----> "+ To + "\t\t Date: "+Date+"\t\t Time: "+Time+"\t\t Price: "+Price+"\t\t Seats Left: "+Seats;
		                    list.add(Line_details);}}}
			
			catch (ClassNotFoundException e){e.printStackTrace();}
		    return list;}
    
    public ArrayList<String> from_countries() throws SQLException {// Return the available list of the countries to travel from
	ArrayList<String>list=new ArrayList<String>();
	 try {
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
         ResultSet rs = null;
         String sql = "select * from plane";
         PreparedStatement p = conn.prepareStatement(sql);
         rs = p.executeQuery();

         while (rs.next()) {
               String From = rs.getString("from");
               int Seats = rs.getInt("seats");
        
               
               if(Seats>0) {
            	   list.add(From); 
                  
            	   
               }
               }}

   catch (ClassNotFoundException e){e.printStackTrace();}return list;}

    public ArrayList<String> to_countries() throws SQLException {// Return the available list of the countries to travel to  
	ArrayList<String>list=new ArrayList<String>();
	 try {
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
         ResultSet rs = null;
         String sql = "select * from plane";
         PreparedStatement p = conn.prepareStatement(sql);
         rs = p.executeQuery();

         while (rs.next()) {
               String To = rs.getString("to");
               int Seats = rs.getInt("seats");
        
               
               if(Seats>0) {
            	  list.add(To); 
                   
               }
               }}

   catch (ClassNotFoundException e){e.printStackTrace();}return list;}



    public ArrayList<String> Existing_visa(String phone_num) throws SQLException{// Returns the list of visa of the user to pay with it
	ArrayList<String>list = new ArrayList<String>();
	 try {
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","root");
         ResultSet rs = null;
         String sql = "select * from visa";
         PreparedStatement p = conn.prepareStatement(sql);
         rs = p.executeQuery();
         String Line_details=null;
         while (rs.next()) {
               
        	   String phone = rs.getString("user_phone number");
               String Card_num = rs.getString("card_number");
               String expiration_date = rs.getString("expiration date");
               int code = rs.getInt("security code");

               if(phone.equals(phone_num)) {
            	   Line_details= "\nCard Number: "+Card_num+"\nExpiration Date: "+expiration_date+"\nCVV: "+code;
                   list.add(Line_details);}}}
	 
	   catch (ClassNotFoundException e){e.printStackTrace();}return list;}
}