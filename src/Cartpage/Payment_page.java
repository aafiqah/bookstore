package Cartpage;

import Homepage.Home_page;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @ALESSA_AFIQAH_012020021640
 */
public class Payment_page extends javax.swing.JFrame 
{
    /**
     * Creates new form CheckOut_page
     */
    public Payment_page() 
    {
        initComponents();
    }
    
    public Payment_page(String val)
    {
        initComponents();
        Totalprice_text.setText(val);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_1 = new javax.swing.JPanel();
        menu_label = new javax.swing.JLabel();
        bestseller_label = new javax.swing.JLabel();
        exit_label = new javax.swing.JLabel();
        minimize_label = new javax.swing.JLabel();
        cart_label = new javax.swing.JLabel();
        logout_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Totalprice_text = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panel_5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        card_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        expiration_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cuv_pwd = new javax.swing.JPasswordField();
        showpwd_check = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_textarea = new javax.swing.JTextArea();
        cancel = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_1.setBackground(new java.awt.Color(255, 51, 51));
        panel_1.setPreferredSize(new java.awt.Dimension(172, 41));
        panel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_1MouseClicked(evt);
            }
        });

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

        exit_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exit_label.setText("X");
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
        });

        minimize_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        minimize_label.setText("_");
        minimize_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_labelMouseClicked(evt);
            }
        });

        cart_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cart_label.setText("CART");
        cart_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cart_labelMouseClicked(evt);
            }
        });

        logout_label.setText("LOG OUT");
        logout_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logout_label)
                .addGap(29, 29, 29)
                .addComponent(menu_label)
                .addGap(34, 34, 34)
                .addComponent(bestseller_label)
                .addGap(42, 42, 42)
                .addComponent(cart_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_label, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit_label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_label)
                    .addComponent(minimize_label)
                    .addComponent(menu_label)
                    .addComponent(bestseller_label)
                    .addComponent(cart_label)
                    .addComponent(logout_label))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        Totalprice_text.setEditable(false);
        Totalprice_text.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Totalprice_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel12.setText("TOTAL (RM):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(Totalprice_text)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totalprice_text, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_5.setBackground(new java.awt.Color(255, 204, 204));
        panel_5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("CARD NUMBER:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("EXPIRATION:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("CUV:");

        showpwd_check.setBackground(new java.awt.Color(255, 204, 204));
        showpwd_check.setText("SHOW MESSAGE");
        showpwd_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpwd_checkActionPerformed(evt);
            }
        });

        address_textarea.setColumns(20);
        address_textarea.setRows(5);
        jScrollPane1.setViewportView(address_textarea);

        cancel.setBackground(new java.awt.Color(255, 153, 51));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(255, 153, 51));
        reset_button.setText("RESET");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        submit_button.setBackground(new java.awt.Color(255, 153, 51));
        submit_button.setText("CONFIRM");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("DELIVERY ADDRESS:");

        javax.swing.GroupLayout panel_5Layout = new javax.swing.GroupLayout(panel_5);
        panel_5.setLayout(panel_5Layout);
        panel_5Layout.setHorizontalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(expiration_text)
                    .addComponent(card_text)
                    .addComponent(cuv_pwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showpwd_check)
                .addGap(153, 153, 153))
            .addGroup(panel_5Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panel_5Layout.setVerticalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiration_text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuv_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(showpwd_check))
                .addGap(18, 18, 18)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_labelMouseClicked

    private void minimize_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_labelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_labelMouseClicked

    private void cart_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart_labelMouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to leave this page? If yes, your data will be delete","", JOptionPane.YES_OPTION);
        if(p==0)
        {
            Cart_page hp = new Cart_page();
            hp.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_cart_labelMouseClicked

    private void logout_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_labelMouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to leave this page? If yes, your data will be delete","", JOptionPane.YES_OPTION);
        if(p==0)
        {
            Home_page hp = new Home_page();
            hp.setVisible(true);
            this.setVisible(false);
            this.dispose(); 
        }
    }//GEN-LAST:event_logout_labelMouseClicked

    private void bestseller_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bestseller_labelMouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to leave this page? If yes, your data will be delete","", JOptionPane.YES_OPTION);
        if(p==0)
        {
            //Home_page hp = new Home_page();
            //hp.setVisible(true);
            //this.setVisible(false);
            //this.dispose();
        }
    }//GEN-LAST:event_bestseller_labelMouseClicked

    private void menu_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_labelMouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to leave this page? If yes, your data will be delete","", JOptionPane.YES_OPTION);
        if(p==0)
        {
            //Home_page hp = new Home_page();
            //hp.setVisible(true);
            //this.setVisible(false);
            //this.dispose();
        }
    }//GEN-LAST:event_menu_labelMouseClicked

    private void panel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_1MouseClicked

    }//GEN-LAST:event_panel_1MouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to cancel payment session. If yes, your data will be delete","", JOptionPane.YES_OPTION);
        if(p==0)
        {
            Cart_page hp = new Cart_page();
            hp.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        card_text.setText("");
        expiration_text.setText("");
        cuv_pwd.setText("");
        address_textarea.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        String totalprice = Totalprice_text.getText();
        new Successpayment_page(totalprice).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void showpwd_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpwd_checkActionPerformed
        if(showpwd_check.isSelected())
        {
            cuv_pwd.setEchoChar((char)0);
        }
        else
        {
            cuv_pwd.setEchoChar('*');
        }
    }//GEN-LAST:event_showpwd_checkActionPerformed

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
            java.util.logging.Logger.getLogger(Payment_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Totalprice_text;
    private javax.swing.JTextArea address_textarea;
    private javax.swing.JLabel bestseller_label;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField card_text;
    private javax.swing.JLabel cart_label;
    private javax.swing.JPasswordField cuv_pwd;
    private javax.swing.JLabel exit_label;
    private javax.swing.JTextField expiration_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout_label;
    private javax.swing.JLabel menu_label;
    private javax.swing.JLabel minimize_label;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_5;
    private javax.swing.JButton reset_button;
    private javax.swing.JCheckBox showpwd_check;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
