package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*;


public class EnterMarks extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cbsemester;
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5;
    JButton submit,cancel,delete;
    
    
    EnterMarks(){
       setSize(1000,500);
       setLocation(300,150);
       setLayout(null);
        getContentPane().setBackground(Color.WHITE);
               
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/exam.jpg"));//toput the image on the frame
     Image i2=i1.getImage().getScaledInstance(400, 300,Image.SCALE_DEFAULT );
     ImageIcon i3= new ImageIcon(i2);
     JLabel image= new JLabel(i3);
     image.setBounds(500,40,400,300);
     add(image);
     JLabel heading=new JLabel("Enter marks of Students");
       heading.setBounds(50,0,500,50);
       heading.setFont(new Font("Tahoma",Font.BOLD,20));
       add(heading);
       
       JLabel lblrollnumber =new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50,70,150,20);
        add(lblrollnumber);
        
        crollno=new Choice();
        crollno.setBounds(200,70,150,20);
        add(crollno);
        
        try{
          Conn c=new Conn();
          ResultSet rs=c.s.executeQuery("select * from student");
          while(rs.next()){
              crollno.add(rs.getString("rollno"));
          }
        }catch(Exception e){
            e.printStackTrace();
        }
         JLabel lblsemester =new JLabel("Select Semester");
        lblsemester.setBounds(50,110,150,20);
        add(lblsemester);
        
        String semester[]={"1st semester","2nd semester","3rd semester","4th semester","5th semester","6th semester","7th semester","8th semester"};
        cbsemester=new JComboBox(semester);
        cbsemester.setBounds(200,110,150,20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
         JLabel lblentersubject =new JLabel("Enter Subject");
        lblentersubject.setBounds(110,150,200,40);
        add(lblentersubject);
        
         JLabel lblentermarks =new JLabel("Enter Marks");
        lblentermarks.setBounds(320,150,200,40);
        add(lblentermarks);
        
        tfsub1=new JTextField();
        tfsub1.setBounds(50,200,200,20);
        add(tfsub1);
        
          
        tfsub2=new JTextField();
        tfsub2.setBounds(50,230,200,20);
        add(tfsub2);
          
        tfsub3=new JTextField();
        tfsub3.setBounds(50,260,200,20);
        add(tfsub3);
          
        tfsub4=new JTextField();
        tfsub4.setBounds(50,290,200,20);
        add(tfsub4);
          
        tfsub5=new JTextField();
        tfsub5.setBounds(50,320,200,20);
        add(tfsub5);
        
        tfmarks1=new JTextField();
        tfmarks1.setBounds(250,200,200,20);
        add(tfmarks1);
        
        tfmarks2=new JTextField();
        tfmarks2.setBounds(250,230,200,20);
        add(tfmarks2);
        
        tfmarks3=new JTextField();
        tfmarks3.setBounds(250,260,200,20);
        add(tfmarks3);
        
        tfmarks4=new JTextField();
        tfmarks4.setBounds(250,290,200,20);
        add(tfmarks4);
         
        tfmarks5=new JTextField();
        tfmarks5.setBounds(250,320,200,20);
        add(tfmarks5);
         
         submit=new JButton("Submit");
        submit.setBounds(70,360,150,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(260,360,150,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);
        
        delete=new JButton("Delete");
        delete.setBounds(450,360,150,25);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        delete.setFont(new Font("Tahoma",Font.BOLD,15));
        add(delete);
        
       setVisible(true);
    }
     public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == submit) {
        // Check for empty fields
        if (tfsub1.getText().isEmpty() || tfsub2.getText().isEmpty() || tfsub3.getText().isEmpty() ||
            tfsub4.getText().isEmpty() || tfsub5.getText().isEmpty() ||
            tfmarks1.getText().isEmpty() || tfmarks2.getText().isEmpty() || 
            tfmarks3.getText().isEmpty() || tfmarks4.getText().isEmpty() || 
            tfmarks5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
            return; // Exit the method if any field is empty
        }

        try {
            Conn c = new Conn();
            String rollNo = crollno.getSelectedItem();
            String semester = (String)cbsemester.getSelectedItem();

            // Check if the record already exists
            String checkQuery = "SELECT * FROM subject WHERE rollno = '" + rollNo + "' AND semester = '" + semester + "'";
            ResultSet rs = c.s.executeQuery(checkQuery);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Record for this Roll No and Semester already exists.");
                return; // Exit the method if the record exists
            }
                String query1 = "insert into subject values('"+crollno.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"', '"+tfsub1.getText()+"', '"+tfsub2.getText()+"', '"+tfsub3.getText()+"', '"+tfsub4.getText()+"', '"+tfsub5.getText()+"')";
                String query2 = "insert into marks values('"+crollno.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"', '"+tfmarks1.getText()+"', '"+tfmarks2.getText()+"', '"+tfmarks3.getText()+"', '"+tfmarks4.getText()+"', '"+tfmarks5.getText()+"')";
            
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Marks Inserted Sucessfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
             
         }else if (ae.getSource() == delete) {
        // Handle delete action
        try {
            Conn c = new Conn();
            String rollNo = crollno.getSelectedItem();
            String semester = (String) cbsemester.getSelectedItem(); // Cast to String

            // Check if the record exists before attempting to delete
            String checkQuery = "SELECT * FROM subject WHERE rollno = '" + rollNo + "' AND semester = '" + semester + "'";
            ResultSet rs = c.s.executeQuery(checkQuery);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No record found for this Roll No and Semester.");
                return; // Exit the method if no record exists
            }

            // If record exists, proceed to delete
            String deleteQuery1 = "DELETE FROM subject WHERE rollno = '" + rollNo + "' AND semester = '" + semester + "'";
            String deleteQuery2 = "DELETE FROM marks WHERE rollno = '" + rollNo + "' AND semester = '" + semester + "'";

            c.s.executeUpdate(deleteQuery1);
            c.s.executeUpdate(deleteQuery2);

            JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
       }else{
             setVisible(false);
         }
     }
    public static void main (String[] args){
        new EnterMarks();
    }
}
