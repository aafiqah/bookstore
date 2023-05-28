package Homepage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author sitin
 */
public class login extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
    
    Connection conn=null;
    PreparedStatement ps=null;
    Statement smt=null;
    ResultSet rst=null;  
    String username = "root";
    String password = "shellbt31_ofis";    
    String serverurl = "jdbc:mysql://localhost:3306/bookstore";
    String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public login() {
        initComponents();
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pwd_txt = new javax.swing.JPasswordField();
        name_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tab_panel = new javax.swing.JPanel();
        menu_label = new javax.swing.JLabel();
        bestseller_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cart_label = new javax.swing.JLabel();
        home_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 200, 30));

        pwd_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwd_txt.setText("password");
        pwd_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pwd_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd_txtFocusLost(evt);
            }
        });
        jPanel1.add(pwd_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 30));

        name_txt.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_txt.setText("Username");
        name_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_txtFocusLost(evt);
            }
        });
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Forgot password? Click here");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 170, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Member Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGO2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BOOKPIC.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, 380));

        Tab_panel.setBackground(new java.awt.Color(255, 51, 51));

        menu_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menu_label.setText("MENU");
        menu_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_labelMouseClicked(evt);
            }
        });

        bestseller_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bestseller_label.setText("BESTSELLER");
        bestseller_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bestseller_labelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("_");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        cart_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cart_label.setText("CART");
        cart_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cart_labelMouseClicked(evt);
            }
        });

        home_label.setText("HOME");
        home_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Tab_panelLayout = new javax.swing.GroupLayout(Tab_panel);
        Tab_panel.setLayout(Tab_panelLayout);
        Tab_panelLayout.setHorizontalGroup(
            Tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_label)
                .addGap(30, 30, 30)
                .addComponent(menu_label)
                .addGap(33, 33, 33)
                .addComponent(bestseller_label)
                .addGap(35, 35, 35)
                .addComponent(cart_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        Tab_panelLayout.setVerticalGroup(
            Tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu_label)
                    .addComponent(bestseller_label)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cart_label)
                    .addComponent(home_label))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(Tab_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void name_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_txtFocusGained
        // TODO add your handling code here:
        
        if(name_txt.getText().trim().toLowerCase().equals("username"))
        {
            name_txt.setText("");
            name_txt.setForeground(Color.black);
        }
        
        
    }//GEN-LAST:event_name_txtFocusGained

    private void name_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_txtFocusLost
        // TODO add your handling code here:
        
         if(name_txt.getText().trim().equals("") || 
           name_txt.getText().trim().toLowerCase().equals("username"))
        {
            name_txt.setText("email");
            name_txt.setForeground(new Color(0,0,0));
        }
        
        
    }//GEN-LAST:event_name_txtFocusLost

    private void pwd_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_txtFocusGained
        // TODO add your handling code here:
        
         String pass = String.valueOf(pwd_txt.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            pwd_txt.setText("");
            pwd_txt.setForeground(Color.black);
        }
        
        
    }//GEN-LAST:event_pwd_txtFocusGained

    private void pwd_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_txtFocusLost
        // TODO add your handling code here:
        
         String pass = String.valueOf(pwd_txt.getPassword());
        
        if(pass.trim().equals("") || 
           pass.trim().toLowerCase().equals("password"))
        {
            pwd_txt.setText("password");
            pwd_txt.setForeground(new Color(0,0,0));
        }
        
        
    }//GEN-LAST:event_pwd_txtFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String iname = name_txt.getText();
        String pass = String.valueOf(pwd_txt.getPassword());
        
        try {
            String query = "SELECT * FROM `userbookstore` WHERE `uname`=? and `upwd`=?;";
            conn = DriverManager.getConnection(serverurl+timezone,username,password);
            ps = conn.prepareStatement(query);
            
            ps.setString(1,iname);
            ps.setString(2, pass);
            rst = ps.executeQuery();
            
            if(rst.next())
            {
                    Welcome_page mf = new Welcome_page();
                    mf.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                    //dispose();
            }
            else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
         forgotpasw sc = new forgotpasw();

        sc.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void menu_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_labelMouseClicked
        JOptionPane.showMessageDialog(null, "You need to Login");
    }//GEN-LAST:event_menu_labelMouseClicked

    private void bestseller_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bestseller_labelMouseClicked
        JOptionPane.showMessageDialog(null, "You need to Login");
    }//GEN-LAST:event_bestseller_labelMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void cart_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart_labelMouseClicked
        JOptionPane.showMessageDialog(null, "You need to Login");
    }//GEN-LAST:event_cart_labelMouseClicked

    private void home_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_labelMouseClicked
        Home_page hp = new Home_page();
        hp.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_home_labelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tab_panel;
    private javax.swing.JLabel bestseller_label;
    private javax.swing.JLabel cart_label;
    private javax.swing.JLabel home_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu_label;
    private javax.swing.JTextField name_txt;
    private javax.swing.JPasswordField pwd_txt;
    // End of variables declaration//GEN-END:variables
}