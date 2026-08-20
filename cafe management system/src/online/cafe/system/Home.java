
package online.cafe.system;

import javax.swing.JOptionPane;

import javax.swing.ImageIcon;



public class Home extends javax.swing.JFrame {
public String email;
 private BackgroundPanel backgroundPanel;
    
/* private void addMenuBar() {
    JMenuBar menuBar = new JMenuBar();

    JMenu userMenu = new JMenu("User");

    JMenuItem logoutItem = new JMenuItem("Log out");
    logoutItem.setIcon(new ImageIcon(getClass().getResource("/images/logout.png")));
    logoutItem.addActionListener(evt -> jButton1ActionPerformed(evt));
    userMenu.add(logoutItem);

    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.setIcon(new ImageIcon(getClass().getResource("/images/exit.png")));
    exitItem.addActionListener(evt -> jButton6ActionPerformed(evt));
    userMenu.add(exitItem);

    // 2. Orders Menu
    JMenu ordersMenu = new JMenu("Orders");

    JMenuItem placeOrderItem = new JMenuItem("Place Order");
    placeOrderItem.setIcon(new ImageIcon(getClass().getResource("/images/place order.png")));
    placeOrderItem.addActionListener(evt -> jButton2ActionPerformed(evt));
    ordersMenu.add(placeOrderItem);

    JMenuItem viewBillItem = new JMenuItem("View Bills & Order Details");
    viewBillItem.setIcon(new ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png")));
    viewBillItem.addActionListener(evt -> jButton3ActionPerformed(evt));
    ordersMenu.add(viewBillItem);

    // 3. Settings Menu
    JMenu settingsMenu = new JMenu("Settings");

    JMenuItem changePasswordItem = new JMenuItem("Change Password");
    changePasswordItem.setIcon(new ImageIcon(getClass().getResource("/images/change Password.png")));
    changePasswordItem.addActionListener(evt -> jButton4ActionPerformed(evt));
    settingsMenu.add(changePasswordItem);

    JMenuItem changeSecurityQuestionItem = new JMenuItem("Change Security Question");
    changeSecurityQuestionItem.setIcon(new ImageIcon(getClass().getResource("/images/change Security Question.png")));
    changeSecurityQuestionItem.addActionListener(evt -> jButton5ActionPerformed(evt));
    settingsMenu.add(changeSecurityQuestionItem);

    // 4. Admin Menu
    JMenu adminMenu = new JMenu("Admin");

    JMenuItem manageCategoryItem = new JMenuItem("Manage Category");
    manageCategoryItem.setIcon(new ImageIcon(getClass().getResource("/images/category.png")));
    manageCategoryItem.addActionListener(evt -> btnCategoryActionPerformed(evt));
    adminMenu.add(manageCategoryItem);

    JMenuItem newProductItem = new JMenuItem("New Product");
    newProductItem.setIcon(new ImageIcon(getClass().getResource("/images/new product.png")));
    newProductItem.addActionListener(evt -> btnNewProductActionPerformed(evt));
    adminMenu.add(newProductItem);

    JMenuItem editDeleteProductItem = new JMenuItem("View, Edit & Delete Product");
    editDeleteProductItem.setIcon(new ImageIcon(getClass().getResource("/images/view edit delete product.png")));
    editDeleteProductItem.addActionListener(evt -> btnViewEditDeleteProductActionPerformed(evt));
    adminMenu.add(editDeleteProductItem);

    JMenuItem verifyUsersItem = new JMenuItem("Verify Users");
    verifyUsersItem.setIcon(new ImageIcon(getClass().getResource("/images/verify users.png")));
    verifyUsersItem.addActionListener(evt -> btnVerifyUsersActionPerformed(evt));
    adminMenu.add(verifyUsersItem);

    // Add Menus
    menuBar.add(userMenu);
    menuBar.add(ordersMenu);
    menuBar.add(settingsMenu);

    if ("admin@gmail.com".equals(email)) {
        menuBar.add(adminMenu);
    }

    // Apply the menu bar
    setJMenuBar(menuBar);
}
*/
   public Home() {
        // ✅ Set background panel first to avoid flickering
        backgroundPanel = new BackgroundPanel();
        setContentPane(backgroundPanel);  // Set background panel as content
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());  // Set layout for the background

        initComponents(); // Initialize other components
     
        setSize(1922, 1080);
        setResizable(false);
        setLocationRelativeTo(null);
    }

 public Home(String userEmail) {
    // Set background first
    backgroundPanel = new BackgroundPanel();
    setContentPane(backgroundPanel);
    backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    initComponents(); // ✅ Place components after background
 this.email = userEmail;//changes here

     setSize(1922, 1080);
    setResizable(false);
    setLocationRelativeTo(null);
   //  addMenuBar();
    email = userEmail;
    

    // Hide admin buttons for non-admin users
    if (email != null && !email.equals("admin@gmail.com")) {
        btnCategory.setVisible(false);
        btnNewProduct.setVisible(false);
        btnViewEditDeleteProduct.setVisible(false);
        btnVerifyUsers.setVisible(false);
    } else if (email == null) {
        JOptionPane.showMessageDialog(this, "Warning: userEmail is null. Admin buttons may behave incorrectly.");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT.JPG"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jButton2.setText("Place Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jButton3.setText("View Bill & Order Placed Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jButton4.setText("Change Password");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        jButton5.setText("Change Security Question");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 30, -1, -1));

        btnCategory.setBackground(new java.awt.Color(0, 0, 0));
        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1000, -1, -1));

        btnNewProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1000, -1, -1));

        btnViewEditDeleteProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View, Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1000, -1, -1));

        btnVerifyUsers.setBackground(new java.awt.Color(0, 0, 0));
        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 1000, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 1050, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           String role = (email.equals("admin@gmail.com")) ? "Admin" : "Customer";
new ViewBillsOrderPlacedDetails(role, email).setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close the Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
         
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        // TODO add your handling code here:
        
            new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          
         new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
