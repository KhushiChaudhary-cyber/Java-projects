/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
/**
 *
 * @author hp
 */
public class CategoryDao {
 
    public static void save(Category category)
    {
        String query = "insert into Category(name)values('"+category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category Added Successfully");
    }
   /* public static ArrayList <Category> getAllRecords(){
        ArrayList <Category>  arrayList = new ArrayList<>();
        try{
          ResultSet rs=DbOperations.getData("select * from Category");
          while (rs.next()){
              Category category = new Category();
              category.setId(rs.getInt("id"));
              category.setName(rs.getString("name"));
              arrayList.add(category);
          }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }*/
    public static ArrayList<Category> getAllRecords() {
    ArrayList<Category> arrayList = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT * FROM Category");
        if (rs != null) {
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } else {
            System.out.println("No data found.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error fetching categories: " + e.getMessage());
        e.printStackTrace(); // You can log the stack trace for debugging purposes
    }
    return arrayList;
}

    public static void delete(String id ){
     String query = "delete from Category where id='"+id+"'";   
     DbOperations.setDataOrDelete(query, "Category Deleted Successfully");
    }
}
