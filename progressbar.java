/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milkproject;

/**
 *
 * @author Vicky
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*; 

public class progressbar extends JFrame implements Runnable
{
 public void run()
 {
     for(int i = 1;i<=100;i++)
     {
         try
         {
             Thread.sleep(20);
             if(i==100)
             {
                 lblpro.setText(i+"%Completed");
                 dispose();
                 LoginPassword lp = new LoginPassword();
                 lp.setVisible(true);
             }
             else
             { lblpro.setText(i+"%Completed");}
         }
         catch(InterruptedException e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
     }
 }
     
     JLabel lblpro = new JLabel("");
     
     
     JLabel lblimage = new JLabel("");
    progressbar()
            {
                 
                 ImageIcon img =new ImageIcon("loading.gif");
                 lblimage.setIcon(img);
                 add(lblimage);
                 add(lblpro);
                 Thread th = new Thread(this);
                 lblpro.setHorizontalAlignment(JLabel.CENTER);
                 lblimage.setHorizontalAlignment(JLabel.CENTER);
                 lblimage.setVerticalAlignment(JLabel.CENTER);
                 th.start();
                 setSize(500,500);
                 setVisible(true);
                 setResizable(false);
                 
                 setLocationRelativeTo(null);
                         setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
 
 public static void main(String []args)
 {
     new progressbar();
 }
 
}
