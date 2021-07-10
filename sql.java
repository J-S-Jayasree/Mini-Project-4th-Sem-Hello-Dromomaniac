import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class sql {
	String name1,password,dob,cn,email;
	int passenger;
	sql(){
		
	}
	sql(String name1,String password,String dob,String cn,String email,int passenger){
		this.name1=name1;
	this.password=password;
	this.dob=dob;
	this.cn=cn;
	this.email=email;
	this.passenger=passenger;
	}
	
	void create() throws ClassNotFoundException {
		 String name,pass,url;  
         Connection con = null;  
         try {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
         url="jdbc:mysql://localhost:3306/tourist";  
             name="root";  
             pass="indira@123";  
             con = DriverManager.getConnection(url,name,pass);  
             //System.out.println("Connection created"); 
             Statement myStmt=con.createStatement();
             
             String insert="INSERT INTO `tourist`.`tour table` (`Name`, `Password`, `Date of Birth`, `Contact Number`, `Email Address`, `Passenger Number(adult)`) VALUES ('"+name1+"', '"+password+"', '"+dob+"', '"+cn+"', '"+email+"', '"+passenger+"')";
             //String insert="INSERT INTO `tourist`.`tour table` (`Tour id` ,`Name`, `Password`) VALUES ('5', 'shiridi', 'kjxjhh',)";
             //String insert="INSERT INTO tour VALUES ('name1','password')";
             myStmt.executeUpdate(insert);
//             ResultSet myRs=myStmt.executeQuery("select * from `tour table` where row = 2");
//             while(myRs.next()) {
//             	System.out.println(myRs.getString(2)+","+myRs.getString(3));
//             }
             con.close();  
             //System.out.println("Connection closed");  
             }  
             catch (Exception e) {  
             System.out.println(e.toString());  
         }  
	}

	
}


