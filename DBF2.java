import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class DBF2 {
	Frame f;
	ResultSet Rs;
	Button b1;
	TextField T1, T2;
	Label L1, L2;
	String Name = "";
	int marks = 0;

	public DBF2() {
		T1=new TextField(10);
		T2=new TextField(10);
		
		b1=new Button("Save");
		L1=new Label("Name");
		L2=new Label("marks");
		
		f=new Frame();
		f.setLayout(new GridLayout(3,2));
		f.add(L1);
		f.add(T1);
		f.add(L2);
		f.add(T2);
		
		f.add(new Label());
		f.add(b1);
		f.setSize(300,250);
//add actionlister to b1
		
		
		
		b1.addActionListener(
				new ActionListener() {
			
				public void actionPerformed(ActionEvent x){
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/QA","root","");
						Statement st = con.createStatement();
						
						Rs = st.executeQuery("select max(RegNo)+1 from school");
						int NewReg=Rs.getInt(1);

						st.executeUpdate("insert into school values("+NewReg+",'"+ Name + "', "+"marks");
						
						
					}
					catch (Exception E) {
						System.out.println(E.toString());
					}
				}	
			}

		
		
			
		);
	}
}
