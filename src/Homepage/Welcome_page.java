package Homepage;

import BestSellerpage.BestSeller_page;
import Cartpage.Cart_page;
import Menupage.Menu_page;
import javax.swing.JFrame;

/**
 *
 * @ALESSA_AFIQAH_012020021640
 */
public class Welcome_page extends javax.swing.JFrame {

    /**
     * Creates new form Welcome_page
     */
    public Welcome_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab_panel = new javax.swing.JPanel();
        menu_label = new javax.swing.JLabel();
        bestseller_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cart_label = new javax.swing.JLabel();
        home_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        home_label.setText("LOGOUT");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
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

        getContentPane().add(Tab_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGO2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, 130));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setText("WELCOME TO PHONIEX");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jLabel3.setText("ONLINE BOOKSTORE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BOOKPIC.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_labelMouseClicked
        Menu_page lg = new Menu_page();
        lg.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menu_labelMouseClicked

    private void bestseller_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bestseller_labelMouseClicked
        BestSeller_page lg = new BestSeller_page();
        lg.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bestseller_labelMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void cart_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cart_labelMouseClicked
        Cart_page lg = new Cart_page();
        lg.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cart_labelMouseClicked

    private void home_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_labelMouseClicked
        Home_page lg = new Home_page();
        lg.setVisible(true);
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
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tab_panel;
    private javax.swing.JLabel bestseller_label;
    private javax.swing.JLabel cart_label;
    private javax.swing.JLabel home_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel menu_label;
    // End of variables declaration//GEN-END:variables
}
