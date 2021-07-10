import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class Travel extends sql {
	String name;
	static int ch1;
	static double dis4;
	static double cost;
	int c=0;
	//String acco="No";
	static int p2;
	Scanner sc=new Scanner(System.in);
	Travel(String name){
		this.name=name;
		p2=super.passenger;
		
	}
	 static String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    }
	 
	 void hotel() {
		 double rate=3000;
		
			 System.out.println("Do you want hotel accommodation?(1 or 0)");
			 c=sc.nextInt();
			 switch(c) {
			 case 1:System.out.println("Ac or non-Ac  (1 or 0)");
			 int n=sc.nextInt();
			 if(n==1){
				 rate+=2500;
				 System.out.println("charge is "+rate);
				 cost=cost+rate;
				 //acco="Yes";
			 }
			 else
			 {
				 rate+=1000;
				// acco="Yes";
			 System.out.println("charge is "+rate);
			 cost=cost+rate;
			 }
			 
			 break;
			 default: break;
			 }
		 
	 }
	 void transport() {
		 double dis=16.0;
		 double dis1=18.0; //with AC
		 double dis3=21.0; // Ac and innova,sedan,suv etc
		
		 System.out.println("Enter the type of mode:");
		 System.out.println("1.Normal (indica non AC)"+"\n"+"2.Indica with AC"+"\n"+"3.Innova/SUV/Sedan AC");
		 Scanner sc=new Scanner(System.in);
		 ch1=sc.nextInt();
		 if(ch1==1)
			dis4=dis;
		 else if(ch1==2)
			 dis4=dis1;
		 else if(ch1==3)
			 dis4=dis3;
			 
		
	 }
	 void guide() {
		 int g=8000;
		 System.out.println("Do you want guide(1 or 0) ?");
		 Scanner sc=new Scanner(System.in);
		 int ch2=sc.nextInt();
		 switch(ch2) {
		 case 1:System.out.println("Guide cost(with meals)"+g);
		 cost=cost+g;
		 break;
		 default:System.out.println("Thanks..");
		 
		 }
	 }
	void bookingpolicy() {
		try {
		      File myObj = new File("/C://Work//eclipse-workspace//Tour//booking.txt");
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
	}
void inclusion() {
try {
		      File myObj = new File("/C://Work//eclipse-workspace//Tour//inclusion.txt");
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
}
void total(){
	System.out.println("The total cost is"+cost);
}
}




