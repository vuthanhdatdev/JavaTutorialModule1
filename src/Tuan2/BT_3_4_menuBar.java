/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Vu THanh Dat
 */
public class BT_3_4_menuBar extends javax.swing.JFrame {

    /**
     * Creates new form BT_3_4_menuBar
     */
    public BT_3_4_menuBar() {
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

        jMenu7 = new javax.swing.JMenu();
        mnbMenu = new javax.swing.JMenuBar();
        mnBT = new javax.swing.JMenu();
        mniBT3_1 = new javax.swing.JMenuItem();
        mniBT3_2 = new javax.swing.JMenuItem();
        mnApplication = new javax.swing.JMenu();
        mniSourceTree = new javax.swing.JMenuItem();
        mniExplorer = new javax.swing.JMenuItem();
        mnGioiThieu = new javax.swing.JMenu();
        mniGioiThieu = new javax.swing.JMenuItem();
        mniDangNhap = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        mnBT.setText("Bài tập");

        mniBT3_1.setText("Bài tập 3_1");
        mniBT3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBT3_1ActionPerformed(evt);
            }
        });
        mnBT.add(mniBT3_1);

        mniBT3_2.setText("Bài tập 3_2");
        mniBT3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBT3_2ActionPerformed(evt);
            }
        });
        mnBT.add(mniBT3_2);

        mnbMenu.add(mnBT);

        mnApplication.setText("Ứng dụng");

        mniSourceTree.setText("SourceTree");
        mniSourceTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSourceTreeActionPerformed(evt);
            }
        });
        mnApplication.add(mniSourceTree);

        mniExplorer.setText("Windows Explorer");
        mniExplorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExplorerActionPerformed(evt);
            }
        });
        mnApplication.add(mniExplorer);

        mnbMenu.add(mnApplication);

        mnGioiThieu.setText("Giới thiệu");

        mniGioiThieu.setText("Giới thiệu");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnGioiThieu.add(mniGioiThieu);

        mniDangNhap.setText("Đăng nhập");
        mnGioiThieu.add(mniDangNhap);

        mniThoat.setText("Thoát");
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        mnGioiThieu.add(mniThoat);

        mnbMenu.add(mnGioiThieu);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniBT3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBT3_2ActionPerformed
        // TODO add your handling code here:
        BT3_2_ThemMoiLienHe frm = new BT3_2_ThemMoiLienHe();
        frm.setVisible(true);
    }//GEN-LAST:event_mniBT3_2ActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Ứng dụng tổng quát bài tập\nPhát triển bởi : CoreJ Team Tech Tips");
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mniBT3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBT3_1ActionPerformed
        // TODO add your handling code here:
        BT3_1_ThongTinLienHe frm = new BT3_1_ThongTinLienHe();
        frm.setVisible(true);
    }//GEN-LAST:event_mniBT3_1ActionPerformed

    private void mniSourceTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSourceTreeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Process process = new ProcessBuilder("C:\\Program Files (x86)\\Atlassian\\SourceTree\\SourceTree.exe").start();
        } catch (IOException ex) {
            Logger.getLogger(BT_3_4_menuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniSourceTreeActionPerformed

    private void mniExplorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExplorerActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Process process = new ProcessBuilder("C:\\Windows\\Explorer.exe").start();
        } catch (IOException ex) {
            Logger.getLogger(BT_3_4_menuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniExplorerActionPerformed

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
            java.util.logging.Logger.getLogger(BT_3_4_menuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT_3_4_menuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT_3_4_menuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT_3_4_menuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BT_3_4_menuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu mnApplication;
    private javax.swing.JMenu mnBT;
    private javax.swing.JMenu mnGioiThieu;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniBT3_1;
    private javax.swing.JMenuItem mniBT3_2;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniExplorer;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniSourceTree;
    private javax.swing.JMenuItem mniThoat;
    // End of variables declaration//GEN-END:variables
}
