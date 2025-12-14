
//package notepad;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class Window  extends JFrame{

      MyMenu  menu;
      JPanel mainPanel;
      Tabs tabbed;
       JPanel bigpan;
        FFont frame;
      public Window(){
          
            this.bigpan = new JPanel(new BorderLayout());
            this.mainPanel = new MainPanel(this);    
            this.tabbed = new Tabs();
            this.menu = new MyMenu((MainPanel) this.mainPanel,this.tabbed,this);
            this.setJMenuBar(this.menu);
            this.tabbed.addTab((MainPanel) mainPanel, "untitled");
            this.setSize(900, 500);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.bigpan.add(this.tabbed,BorderLayout.CENTER);
            
//        getContentPane().add(this.tabbed); 
            getContentPane().add(this.bigpan);
            
             this.frame = new FFont(this);
             
      }
      
      public static void main(String args[]){
           new Window();
      }
      
}
