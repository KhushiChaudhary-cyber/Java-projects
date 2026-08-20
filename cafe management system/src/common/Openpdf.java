/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package common;

import javax.swing.JOptionPane;
import java.io.File;
/**
 *
 * @author hp
 */
/*public class Openpdf {
 public static void OpenById(String Id){
     try{
         if((new File("D:\\"+id+".pdf")).exists()){
             Process p= Runtime
                     .getRuntime()
                     .exec("rund132 url.dll,FileProtocolHandler D:\\"+id+".pdf");
         }else{
             JOptionPane.showMessageDialog(null, "File does not Exists");
         }
     
 }
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
 }   
}*/

package common;

import java.awt.Desktop;
import java.io.File;

public class Openpdf {
    public static void OpenById(String id) {
        try {
            File file = new File("D:\\bills\\" + id + ".txt");
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

