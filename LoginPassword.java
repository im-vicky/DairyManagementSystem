package milkproject;

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;	
import java.net.*;
import java.sql.*;

 public class LoginPassword extends JFrame
  {
   private JLabel l1,l2;
   private JTextField t1;
   private JButton change,ok,cancle;
   private JPasswordField password;
   
	String str,str1,str2,user,pass;
	ResultSet rs;	
	Connection connection;
	Statement statement;
	
   public LoginPassword()
    {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      l1=new JLabel("Username");
      getContentPane().setBackground(new Color(255, 102, 51));
      l1.setFont(new Font("Serif",Font.BOLD,22));
      l2=new JLabel("Password");
      l2.setFont(new Font("Serif",Font.BOLD,22));   		
      t1=new JTextField(10);
      password=new JPasswordField(10);
     change=new JButton("Change");
       ok=new JButton("ok");
      ok.addActionListener(new okListener());
      cancle=new JButton("cancel");
    cancle.addActionListener(new cancleListener());
    connect();
     l1.setBounds(10,10,130,25);t1.setBounds(120,10,130,25);
      l2.setBounds(10,50,130,25);password.setBounds(120,50,130,25);
      change.setBounds(10,90,80,25); ok.setBounds(105,90,50,25);
      cancle.setBounds(170,90,80,25); 
       add(l1);add(t1);add(l2);
       add(password);add(change);add(cancle);add(ok);
       pack();
      setSize(300,200);
      setVisible(true);
    }//End of constructor
public void connect()
	{
            try{
		 Connection connection;
                    
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/orphanagesystem","root","password");
                     JOptionPane.showMessageDialog(null,"CONNECTED");    
       		
			statement = connection.createStatement();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Not Connected");
            }
		
          	
}
private class okListener  implements ActionListener	 
{
public void actionPerformed(ActionEvent e)
	{
		try
		{
		rs=statement.executeQuery("select * from  `orphanagesystem`.`logindata`");
		rs.next();
		str=rs.getString(1);
		str1=rs.getString(2);
		user=t1.getText();
		pass=String.format("%s", new String(password.getPassword()));
		if(user.compareTo(str)==0 && pass.compareTo(str1)==0)
		{
		new Mainmenu().setVisible(true);
		 dispose();
		}
		else
		JOptionPane.showMessageDialog(null,"wrong password:Try Again");
		}
		catch(SQLException sqle)
		{
		}
	}
}
private class cancleListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			dispose();
		}
		catch(Exception eg)
		{}
	}
}	
public static void main(String arg[])
{
	LoginPassword lp=new LoginPassword();
}
}
