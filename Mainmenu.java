package milkproject;

import java.awt.event.*;
import javax.swing.*;  
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  

class Mainmenu extends JFrame implements ActionListener
{
        private final JMenu master,report,exit;
        private final JMenuBar mb = new JMenuBar();
        private final JMenuItem showreport,branchdetail,salarypaymentdetail,salarycodedetail,buildingdetail,customerdetail,employeedetail,locationdetail,milkdetail,supplierdetail;
        private final JMenuItem yes,no,about;
        private final JLabel image;
        private final JPanel contentPane;
	//private final Container mycontainer;
	
	
        public Mainmenu()  //constructor
        {
     		 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                 contentPane = new JPanel() {  
                 public void paintComponent(Graphics g) {  
                      Image img = Toolkit.getDefaultToolkit().getImage(  
                                Mainmenu.class.getResource("img.png"));  
                      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
                 }  
            };    
            setContentPane(contentPane);
          
		         
             		
	    master=new JMenu("MASTER");
	    report=new JMenu("Report");
	    exit=new JMenu("Exit");

             master.setMnemonic('M');
             report.setMnemonic('R');
             exit.setMnemonic('E');
             setJMenuBar(mb);
             mb.add(master);
             mb.add(report);
             mb.add(exit);
             branchdetail=new JMenuItem("BRANCH DETAIL");
             salarycodedetail=new JMenuItem("SALARY CODE DETAIL");
             salarypaymentdetail = new JMenuItem("SALARY PAYMENT DETAIL");
             buildingdetail=new JMenuItem("BUILDING DETAIL");
             customerdetail= new JMenuItem("CUSTOMER DETAIL");
             employeedetail= new JMenuItem("EMPLOYEE DETAIL");
             locationdetail= new JMenuItem("LOCATION DETAIL");
             milkdetail= new JMenuItem("MILK DETAIL");
             supplierdetail= new JMenuItem("SUPPLIER DETAIL");
             showreport = new JMenuItem("SHOW REPORT");
             image = new JLabel("");
             
             master.add(branchdetail);
             master.add(salarycodedetail);
             master.add(salarypaymentdetail);
             master.add(buildingdetail);
             master.add(customerdetail);
             master.add(employeedetail);
             master.add(locationdetail);
             master.add(milkdetail);
             master.add(supplierdetail);
             report.add(showreport);
             
             add(image);
            
             
             
             
             yes= new JMenuItem("Yes");
             no=new JMenuItem("No");
             about=new JMenuItem("About");
      
             exit.add(yes);
             exit.add(no);
             exit.add(about);
             
             master.addActionListener(this);
             report.addActionListener(this);
                         
             
             branchdetail.addActionListener(this);
             salarycodedetail.addActionListener(this);
             buildingdetail.addActionListener(this); 
             salarypaymentdetail.addActionListener(this); 
             customerdetail.addActionListener(this); 
             employeedetail.addActionListener(this); 
             locationdetail.addActionListener(this); 
             milkdetail.addActionListener(this); 
             supplierdetail.addActionListener(this); 
             exit.addActionListener(this);
             yes.addActionListener(this);
	     about.addActionListener(this);
             showreport.addActionListener(this);
 		
		setVisible(true);
		setSize(1000,600);

     }
        public void actionPerformed(ActionEvent e)
                {
                
                	 if(e.getSource()== branchdetail )
                	                            {
					new BranchDetail().setVisible(true);
			}
                	 if(e.getSource()== salarycodedetail)
                	                            {
					new Salary_code_detail().setVisible(true);
			}
                        if(e.getSource()== buildingdetail)
                	                            {
                                        new building_detail().setVisible(true);
			}
                        if(e.getSource()== customerdetail)
                	                            {
					new customer_detail().setVisible(true);
			}
                        if(e.getSource()== employeedetail)
                	                            {
					new employee_detail().setVisible(true);
			}
                        if(e.getSource()== locationdetail)
                	                            {
					new locationDetail().setVisible(true);
			}
                        if(e.getSource()== milkdetail)
                	                            {
					new milk_detail().setVisible(true);
			}
                          
                         if(e.getSource()== supplierdetail)
                	                            {
					new supplier_detail().setVisible(true);
			}
                          if(e.getSource()== salarycodedetail)
                	                            {
					new Salary_code_detail().setVisible(true);
			}
                         if(e.getSource()== showreport)
                                {
				new report().setVisible(true);
				}
				
			
                    	if(e.getSource()== yes)
			{
				dispose();
			}
                    
                      
                      	 if(e.getSource()== about)
                                {
						String msg = "DEVELOPED BY : ISHWAR  ";
JOptionPane.showMessageDialog (this, msg, "ABOUT SALES AND PURCHASE MANAGEMENT SYSTEM FOR MOBILE", JOptionPane.PLAIN_MESSAGE);

                                }	
			
			  } 

        public static void main (String arg[])
        {

               new Mainmenu();
        }
}

 
