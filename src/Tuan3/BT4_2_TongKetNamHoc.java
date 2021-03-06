/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NHQ
 */
public class BT4_2_TongKetNamHoc extends javax.swing.JFrame {

    /**
     * Creates new form BT4_2_TongKetNamHoc
     */
    DefaultTableModel dtm;
    public BT4_2_TongKetNamHoc() {
        initComponents();
        dtm = (DefaultTableModel)jTable1.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboKhoiLop = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDiemTBHK1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiemTBHK2 = new javax.swing.JTextField();
        btnTiepTuc = new javax.swing.JButton();
        btnDocDanhSach = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tổng kết năm học");

        jLabel1.setText("Họ và tên");

        jLabel2.setText("Khối lớp");

        cboKhoiLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));

        jLabel3.setText("Điểm TB HK1");

        jLabel4.setText("Điểm TB HK2");

        btnTiepTuc.setText("Tiếp tục");
        btnTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTucActionPerformed(evt);
            }
        });

        btnDocDanhSach.setText("Đọc danh sách");
        btnDocDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocDanhSachActionPerformed(evt);
            }
        });

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Khối", "TB HK1", "TB HK2", "TB cả năm"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboKhoiLop, javax.swing.GroupLayout.Alignment.LEADING, 0, 72, Short.MAX_VALUE)
                        .addComponent(txtDiemTBHK1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDiemTBHK2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemMoi)
                    .addComponent(btnTiepTuc)
                    .addComponent(btnDocDanhSach)
                    .addComponent(btnThongKe))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDocDanhSach, btnThemMoi, btnThongKe, btnTiepTuc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboKhoiLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiepTuc))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDocDanhSach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThongKe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiemTBHK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiemTBHK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        try {
            // TODO add your handling code here:
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("danhsachhs.txt",true)));
//            String line = "";
//            line = txtHoTen.getText()+"|"+cboKhoiLop.getSelectedItem().toString()+"|"+txtDiemTBHK1.getText()+"|"+txtDiemTBHK2.getText();
            float tbhk1,tbhk2,tbcn;
            String hoTen,khoiLop;
            hoTen = txtHoTen.getText();
            khoiLop = cboKhoiLop.getSelectedItem().toString();
            tbhk1 = Float.parseFloat(txtDiemTBHK1.getText());
            tbhk2 = Float.parseFloat(txtDiemTBHK2.getText());
            tbcn = (tbhk1+tbhk2*2)/3;
            dos.writeUTF(hoTen);
            dos.writeUTF(khoiLop);
            dos.writeFloat(tbhk1);
            dos.writeFloat(tbhk2);
            dos.writeFloat(tbcn);
            dos.close();
            dtm.addRow(new Object[]{hoTen,khoiLop,tbhk1,tbhk2,tbcn});
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnDocDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocDanhSachActionPerformed
        try {
            // TODO add your handling code here:
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("danhsachhs.txt")));
            float tbhk1,tbhk2,tbcn;
            String hoTen,khoiLop;
            while (true) {                
                try {
                    hoTen = dis.readUTF();
                    khoiLop = dis.readUTF();
                    tbhk1 = dis.readFloat();
                    tbhk2 = dis.readFloat();
                    tbcn = dis.readFloat();
                    dtm.addRow(new Object[]{hoTen,khoiLop,tbhk1,tbhk2,tbcn});
                } catch (EOFException ex3) {
                    break;
                }
            }
        } catch (FileNotFoundException ex1) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (IOException ex2) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }//GEN-LAST:event_btnDocDanhSachActionPerformed

    private void btnTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTucActionPerformed
        // TODO add your handling code here:
        txtHoTen.setText("");
        txtDiemTBHK2.setText("");
        txtDiemTBHK1.setText("");
    }//GEN-LAST:event_btnTiepTucActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("danhsachhs.txt")));
            float tbhk1,tbhk2,tbcn;
            String hoTen,khoiLop;
            int soHSgioi=0,soHsKha=0,soHsTB=0,soHsYeu=0;
            
            while (true) {                
                try {
                    hoTen = dis.readUTF();
                    khoiLop = dis.readUTF();
                    tbhk1 = dis.readFloat();
                    tbhk2 = dis.readFloat();
                    tbcn = dis.readFloat();
                    if(tbcn>=8){
                        soHSgioi++;
                    }
                    else if(tbcn>=7){
                        soHsKha++;
                    }
                    else if(tbcn>=5){
                        soHsTB++;
                    }
                    else{
                        soHsYeu++;
                    }
                } catch (EOFException ex3) {
                    break;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Số HS giỏi:"+soHSgioi+"\n"+"Số HS Khá:"+soHsKha+"\n"+"Số HS TB:"+soHsTB+"\n"+"Số HS yếu:"+soHsYeu+"\n");
        } catch (FileNotFoundException ex1) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (IOException ex2) {
            Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

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
            java.util.logging.Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT4_2_TongKetNamHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BT4_2_TongKetNamHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocDanhSach;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JComboBox<String> cboKhoiLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiemTBHK1;
    private javax.swing.JTextField txtDiemTBHK2;
    private javax.swing.JTextField txtHoTen;
    // End of variables declaration//GEN-END:variables
}
