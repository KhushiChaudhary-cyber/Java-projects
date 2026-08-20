
package university.management.system;

import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable {
    
    Thread t;
    
Splash(){
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/first.jpg"));//toput the image on the frame
    Image i2=i1.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT );
    ImageIcon i3= new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    add(image);//cant just past the image directly to add fumction so we have to make a jlabel function so that we can pass the image to the frame
    
    t=new Thread(this);
    t.start();
    
    setVisible(true);//to make the frame visible
    int x=1;
    for (int i=2;i<=600;i+=4,x+=1){//to create dynamic frame
         setLocation(600-((i+x)/2),350-(i/2));//to make the frame on the screen at a specific location
         setSize(i+3*x,i+x/2);//to )set the size of frame
         
         
         try{
             Thread.sleep(10);//to make the frame open slowly 
         }catch(Exception e){}
    }
   
}
public void run(){
    try{
        Thread.sleep(7000);//so that login page will  be open automatically after 7 seconds
        setVisible(false);
        
        //next frame
        new Login();
    }catch(Exception e){
}
    
}
 public  static void main(String[] args)   {
   new Splash();
 }
}
