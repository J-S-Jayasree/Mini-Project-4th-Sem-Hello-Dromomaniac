import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Coorg extends Travel{
	String n;
	static int ch;

Coorg(String n){
	super(n);
}

void dis() {
	System.out.println("Enter the Package number");
	System.out.println("1.2 Day Planner"+"\n"+"2.3 Day planner"+"\n"+"3.Special Package"+"\n");
	Scanner sc=new Scanner(System.in);
	 ch=sc.nextInt();
	switch(ch) {
	case 1:try {
	      File myObj = new File("/C://Work//eclipse-workspace//Tour//Coorg//package1.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	break;
	case 2:try {
	      File myObj = new File("/C://Work//eclipse-workspace//Tour//Coorg//package2.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	break;
	case 3:try {
	      File myObj = new File("/C://Work//eclipse-workspace//Tour//Coorg//package3.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	break;
	default:
		System.out.println("Enter correct option");
	}


}
	void cost() {
		String name,pass,url;  
	    Connection con = null;  
	    try {  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	    url="jdbc:mysql://localhost:3306/tourist";  
	        name="root";  
	        pass="indira@123";  
	        con = DriverManager.getConnection(url,name,pass);  
	        System.out.println("Connection created"); 
	        Statement myStmt=con.createStatement();
	        ResultSet myRs=myStmt.executeQuery("select * from `gen table`");
	        if(myRs.next()&&ch==1) {
	        	//System.out.println("Cost = "+myRs.getString(3));
	        	//double d=myRs.getDouble(3);
	        	//System.out.println("i have "+d+" "+Travel.p2);
	        	Travel.cost=myRs.getDouble(3)*Travel.p2;
	        	
	        }
	        else if(ch==2) {
	        	//System.out.println("Cost = "+myRs.getString(5));
	        	Travel.cost=myRs.getDouble(5)*Travel.p2;
	        	
	        }
	        else if(ch==3) {
	        //System.out.println("Cost = "+myRs.getString(7));
	        Travel.cost=myRs.getDouble(7)*Travel.p2;
	    
	        }
	        con.close();  
	        System.out.println("Connection closed");  
	    }
	        catch (Exception e) {  
	        System.out.println(e.toString());  
	    }  
	}
	
	void transport() {
		super.transport();
		String name,pass,url;  
	    Connection con = null;  
	    try {  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	    url="jdbc:mysql://localhost:3306/tourist";  
	        name="root";  
	        pass="indira@123";  
	        con = DriverManager.getConnection(url,name,pass);  
	        System.out.println("Connection created"); 
	        Statement myStmt=con.createStatement();
	        ResultSet myRs=myStmt.executeQuery("select * from `gen table`");
	        if(myRs.next()&&ch==1) {
	        	System.out.println("Cost = "+myRs.getDouble(4)*Travel.dis4);
	        	Travel.cost=Travel.cost+myRs.getDouble(4)*Travel.dis4;
	        }
	        else if(ch==2) {
	        	System.out.println("Cost = "+myRs.getDouble(6)*Travel.dis4);
	        	Travel.cost=Travel.cost+myRs.getDouble(6)*Travel.dis4;
	        }
	        else if(ch==3) {
	        System.out.println("Cost = "+myRs.getDouble(8)*dis4);
	        Travel.cost=Travel.cost+myRs.getDouble(8)*Travel.dis4;
	        }
	        con.close();  
	        System.out.println("Connection closed");  
	    }
	        catch (Exception e) {  
	        System.out.println(e.toString());  
	    }  
		
	}
}
	



