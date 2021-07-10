/*import java.sql.*;
public class MySqlCon {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		} 

}*/




/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcMySQLVersion {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String user = "testuser";
        String password = "test623";
        
        String query = "SELECT VERSION()";
Connection con=null;
        try {
        		 con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            
            Logger lgr = Logger.getLogger(JdbcMySQLVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } 
    }
    con.close();
}*/





/*import java.sql.*;
public class CloseConnection {
  public static void main(String [] args) {
    Connection con = null;
    try {

// Obtaining a connection to SQL Server
      con = DriverManager.getConnection(
          "jdbc:sqlserver://localhost\\SQLEXPRESS;"
        + "user=sa;password=HerongY@ng");

// Connection is ready to use
      DatabaseMetaData meta = con.getMetaData();
      System.out.println("Server name: " 
        + meta.getDatabaseProductName());
      System.out.println("Server version: "
        + meta.getDatabaseProductVersion());

// Closing the connection
      con.close();
      if (con.isClosed()) 
        System.out.println("Connection closed.");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}*/






///*import java.sql.*;
//
//public class JDBCExample {
//   // JDBC driver name and database URL
//   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
//   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
//
//   //  Database credentials
//   static final String USER = "username";
//   static final String PASS = "password";
//   
//   public static void main(String[] args) {
//   Connection conn = null;
//   Statement stmt = null;
//   try{
//      //STEP 2: Register JDBC driver
//      Class.forName(JDBC_DRIVER);
//
//      //STEP 3: Open a connection
//      System.out.println("Connecting to a selected database...");
//      conn = DriverManager.getConnection(DB_URL, USER, PASS);
//      if(conn!=null) {
//    	  System.out.println("1");
//stmt = conn.createStatement();
//      
//      String sql = "INSERT INTO Registration " +
//                   "VALUES (100, 'Zara', 'Ali', 18)";
//      stmt.executeUpdate(sql);
//     
//      /*System.out.println("Connected database successfully...");
//      
//      //STEP 4: Execute a query
//      System.out.println("Inserting records into the table...");*/
//      
//      sql = "INSERT INTO Registration " +
//                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
//      stmt.executeUpdate(sql);
//      sql = "INSERT INTO Registration " +
//                   "VALUES (102, 'Zaid', 'Khan', 30)";
//      stmt.executeUpdate(sql);
//      sql = "INSERT INTO Registration " +
//                   "VALUES(103, 'Sumit', 'Mittal', 28)";
//      stmt.executeUpdate(sql);
//      System.out.println("Inserted records into the table...");}
//      else
//      {
//    	  return;
//      }
//
//   }catch(SQLException se){
//      //Handle errors for JDBC
//      se.printStackTrace();
//   }catch(Exception e){
//      //Handle errors for Class.forName
//      e.printStackTrace();
//   }finally{
//      //finally block used to close resources
//      try{
//         if(stmt!=null)
//            conn.close();
//      }catch(SQLException se){
//      }// do nothing
//      try{
//         if(conn!=null)
//            conn.close();
//      }catch(SQLException se){
//         se.printStackTrace();
//      }//end finally try
//   }//end try
//   System.out.println("Goodbye!");
//}//end main
//}//end JDBCExample




/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;


// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class LoadDriver {
    public static void main(String[] args) {
    	 //final String DB_URL = ;
    	 
    	 //Connection conn = null;
    	   //Statement stmt = null;
    	 
       /* try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","abcd","sql");
            System.out.println("Connected database successfully...");
            
            //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO Registration " +
                         "VALUES (100, 'Zara', 'Ali', 18)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                         "VALUES (101, 'Mahnaz', 'Fatma', 25)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                         "VALUES (102, 'Zaid', 'Khan', 30)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration " +
                         "VALUES(103, 'Sumit', 'Mittal', 28)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        } catch (Exception ex) {
            // handle the error
        	System.out.println("0");
        }
    }
}*/
    	   /*Connection conn = null;
    	   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
           System.out.println("Connecting to a selected database...");
    	   try {
    	       // db parameters
    	       String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
    	       String user      = "root";
    	       String password  = "secret";
    	       
    	       // create a connection to the database
    	       conn = DriverManager.getConnection(url, user, password);
    	       System.out.print("1");
    	       // more processing here
    	       // ...    
    	   } catch(SQLException e) {
    	      System.out.println(e.getMessage());
    	   } finally {
    	       try{
    	              if(conn != null)
    	                conn.close();
    	       }catch(SQLException ex){
    	              System.out.println(ex.getMessage());
    	       }
    	   }
    	   
    }
    //conn.close();
}*/


import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
class JavaDriverManager{ 
	static String name;
	String password;
	JavaDriverManager(String n,String p){
		name=n;
		password=p;
	}
	
	
//        public static void main(String args[]) throws ClassNotFoundException 
	static void getconnection() throws ClassNotFoundException{
	
		 final String CREATE_TABLE_SQL="CREATE TABLE"+ name+".details ("
	             + "UID INT NOT NULL,"
	             + "NAME VARCHAR(45) NOT NULL,"+ "PASSWORD VARCHAR(45) NOT NULL)";
            String name,pass,url;  
            Connection con = null;  
            try {  
                Class.forName("com.mysql.cj.jdbc.Driver");  
            url="jdbc:mysql://localhost:3306/demo";  
                name="root";  
                pass="indira@123";  
                con = DriverManager.getConnection(url,name,pass);  
                System.out.println("Connection created"); 
                Statement myStmt=con.createStatement();
                ResultSet myRs=myStmt.executeQuery(CREATE_TABLE_SQL);
                String sql = "INSERT INTO course " +
                        "VALUES (0, name, password)";
                    myStmt.executeUpdate(sql);
                con.close();  
                System.out.println("Connection closed");  
                }  
                catch (Exception e) {  
                System.out.println(e.toString());  
            }  
	
}  }


