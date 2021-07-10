
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowImage extends JPanel {
 
BufferedImage  image;
  static String buf;
  static String[] a;
  static int n=8;
  static String file;
  public ShowImage() {
	  try {

		  	File input = new File("C:\\Work\\eclipse-workspace\\Tour\\om1.jpeg");
		  	image = ImageIO.read(input);
	  	} catch (IOException ie) {
	  		System.out.println("Error:"+ie.getMessage());
	  		}
  }
  static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
  public void paint(Graphics g) {
	 
	  g.drawImage( image, 0, 0, null);
	  g.setFont(new Font("Segoe Print",Font.BOLD,30));

	  g.setColor(Color.yellow);

	  for(int i=0,j=0;i<a.length;i++,j+=10) {
		  g.drawString(a[i], 50+2*i, 50+6*j);}
	
  }
 
   

   public static  void main(String args[])  {
	 
	  try {
			buf=readFile("C:\\Work\\eclipse-workspace\\Tour\\kar.txt");
			a=buf.split("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  JFrame frame = new JFrame("HELLO DROMOMANIAC !!!");
	  JButton button=new JButton("PROCEED !!!");
	  JPanel panel = new ShowImage();
  
	  frame.getContentPane().add(panel);


	  panel.add(button);
	  button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Karnataka window = new Karnataka();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});	
			
		}
	});
  frame.setSize(1000, 900000);  
  frame.setVisible(true);
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your name,date of birth,contact number,email address, passenger count:");
  String s=sc.nextLine();
  file=s+".txt";
  String p=Travel.getAlphaNumericString(n);
  String d=sc.nextLine();
  String c=sc.nextLine();
  String e=sc.nextLine();
  int p1=sc.nextInt();
 
 System.out.println("Your password is:"+p);
  PrintWriter outputStream;
try {
	outputStream = new PrintWriter(file);
	  outputStream.println(s);
	  outputStream.println(p);
	  outputStream.println(d);
	  outputStream.println(c);
	  outputStream.println(e);
	  outputStream.println(p1);
	  outputStream.close();
} catch (FileNotFoundException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
}
sql s1=new sql(s,p,d,c,e,p1);
try {
	s1.create();
} catch (ClassNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}		 
  Coorg t1=new Coorg(s);
t1.dis();
t1.bookingpolicy();
t1.inclusion();

t1.hotel();
t1.guide();
t1.transport();
t1.total();
sc.close();
    }
}



  
