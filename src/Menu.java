
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amamune
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matsing Type");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(430, 150));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(467, 371));
        setPreferredSize(new java.awt.Dimension(485, 410));
        setSize(new java.awt.Dimension(467, 371));
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(636, 155, 0, 0);

        jLabel9.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel9.setText("         WELCOME TO  ");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 160, 226, 30);

        jLabel8.setBackground(new java.awt.Color(102, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("MATSING  TYPE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 170, 301, 57);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("START GAME");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(70, 260, 130, 20);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("HIGHSCORES");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(290, 260, 130, 20);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("QUIT");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(200, 330, 100, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button33.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 250, 140, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button33.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 320, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button33.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 250, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 467, 371);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       this.dispose();
       GameMode g = new GameMode();
       g.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       this.dispose();
       Highscores h = new Highscores();
       h.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setForeground(Color.orange);
        jButton8.setForeground(Color.white);
         jButton9.setForeground(Color.white);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
       jButton8.setForeground(Color.orange);
        jButton7.setForeground(Color.white);
         jButton9.setForeground(Color.white);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setForeground(Color.orange);
        jButton7.setForeground(Color.white);
         jButton8.setForeground(Color.white);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
         jButton9.setForeground(Color.white);
        jButton7.setForeground(Color.white);
         jButton8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}