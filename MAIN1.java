import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class MAIN1 {

	public static void main(String az[]) {
		DBF viewRecord = new DBF();
		DBF2 DataEntry = new DBF2();
		
		Frame f = new Frame();
		f.addWindowListener(new WindowEvents());
		f.setLayout(new GridLayout(2, 1));
		Button B1 = new Button("View Records");
		Button B2 = new Button("Data Entry");
		f.add(B1,BorderLayout.NORTH);
		f.add(B2);
		f.setVisible(true);
		f.setSize(400, 400);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				viewRecord.f.setVisible(true);
			}
		});
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				DataEntry.f.setVisible(true);
			}
		});

	}
}

class WindowEvents implements WindowListener{

	@Override
	public void windowActivated(WindowEvent x) {
		System.out.println("focuse");
		
	}

	@Override
	public void windowClosed(WindowEvent x) {
		System.out.println("closed");
		
	}

	@Override
	public void windowClosing(WindowEvent x) {
		System.out.println("closing");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent x) {
		System.out.println("out of focus");		
	}

	@Override
	public void windowDeiconified(WindowEvent x) {
		System.out.println("maximised");		
	}

	@Override
	public void windowIconified(WindowEvent x) {
		System.out.println("minimised");		
	}

	@Override
	public void windowOpened(WindowEvent x) {
		System.out.println("open");		
	}
		
}