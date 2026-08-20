
package university.management.system;
import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    About(){
        setSize(900,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        
        
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/about.jpg"));//toput the image on the frame
     Image i2=i1.getImage().getScaledInstance(300, 200,Image.SCALE_DEFAULT );
     ImageIcon i3= new ImageIcon(i2);
     JLabel image= new JLabel(i3);
     image.setBounds(550,0,300,200);
     add(image);
        
        
        JLabel heading=new JLabel("<html>University <br/>Management System</html>");
       heading.setBounds(70,20,300,130);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
       add(heading);
        
         JLabel name=new JLabel("Developed by:Khushi,KhushiRani,Deepanshu,Dev");
       name.setBounds(70,220,800,40);
       name.setFont(new Font("Tahoma",Font.BOLD,30));
       add(name);
               
         JLabel rollno=new JLabel("Roll:6095,6099,6065,6069");
       rollno.setBounds(70,280,550,40);
       rollno.setFont(new Font("Tahoma",Font.PLAIN,30));
       add(rollno);
       JLabel contact=new JLabel("Contact us:vidya@gmail.com");
       contact.setBounds(70,340,550,40);
       contact.setFont(new Font("Tahoma",Font.PLAIN,30));
       add(contact);
       
        setLayout(null);
        
        
        
        setVisible(true);
    }
    public static void main(String[] args){
        new About();
        
    }
}
