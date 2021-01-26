/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import warteg.Order;

/**
 *
 * @author user
 */
public class Pesanan extends javax.swing.JFrame {

    /**
     * Creates new form Pesanan
     */
    public Pesanan() {
        initComponents();
        List<String> list2 = Order.getList();
        getdata1.addAll(list2);
    }
    public ArrayList<String> getdata= new ArrayList<>();
    
    public ArrayList<String> getdata1 = new ArrayList<>();

    public void tampil(){
        int option = cmbPilihan.getSelectedIndex();
        TablePesan.setValueAt("Nama", 0, 0);
        TablePesan.setValueAt("Meja", 1, 0);
        TablePesan.setValueAt("Nasi", 2, 0);
        TablePesan.setValueAt("Ayam", 3, 0);
        TablePesan.setValueAt("Kerang", 4, 0);
        TablePesan.setValueAt("Ati Ampela", 5, 0);
        TablePesan.setValueAt("Cumi", 6, 0);
        TablePesan.setValueAt("Ikan", 7, 0);
        TablePesan.setValueAt("Kentang", 8, 0);
        TablePesan.setValueAt("Empal", 9,0);
        TablePesan.setValueAt("Udang", 10, 0);
        TablePesan.setValueAt("Air Mineral", 11, 0);
        TablePesan.setValueAt("Teh", 12, 0);
        TablePesan.setValueAt("Kopi", 13, 0);
        TablePesan.setValueAt("Kerupuk", 14, 0);
        TablePesan.setValueAt("Gorengan", 15, 0);
        TablePesan.setValueAt("Total", 16, 0);
        TablePesan.setValueAt("Bayar", 17, 0);
        TablePesan.setValueAt("Kembalian", 18, 0);
        TablePesan.setValueAt("Catatan", 19, 0);
        if(option == 0){
            TablePesan.setValueAt(getdata1.get(0), 0, 1);
            TablePesan.setValueAt(getdata1.get(1), 1, 1);
            TablePesan.setValueAt(getdata1.get(2), 2, 1);
            TablePesan.setValueAt(getdata1.get(3), 3, 1);
            TablePesan.setValueAt(getdata1.get(4), 4, 1);
            TablePesan.setValueAt(getdata1.get(5), 5, 1);
            TablePesan.setValueAt(getdata1.get(6), 6, 1);
            TablePesan.setValueAt(getdata1.get(7), 7, 1);
            TablePesan.setValueAt(getdata1.get(8), 8, 1);
            TablePesan.setValueAt(getdata1.get(9), 9, 1);
            TablePesan.setValueAt(getdata1.get(10), 10, 1);
            TablePesan.setValueAt(getdata1.get(11), 11, 1);
            TablePesan.setValueAt(getdata1.get(12), 12, 1);
            TablePesan.setValueAt(getdata1.get(13), 13, 1);
            TablePesan.setValueAt(getdata1.get(14), 14, 1);
            TablePesan.setValueAt(getdata1.get(15), 15, 1);
            TablePesan.setValueAt(getdata1.get(16), 16, 1);
            TablePesan.setValueAt(getdata1.get(17), 17, 1);
            TablePesan.setValueAt(getdata1.get(18), 18, 1);
            TablePesan.setValueAt(getdata1.get(19), 19, 1);
        } else {
            if(option == 1){
                TablePesan.setValueAt(getdata1.get(20), 0, 1);
                TablePesan.setValueAt(getdata1.get(21), 1, 1);
                TablePesan.setValueAt(getdata1.get(22), 2, 1);
                TablePesan.setValueAt(getdata1.get(23), 3, 1);
                TablePesan.setValueAt(getdata1.get(24), 4, 1);
                TablePesan.setValueAt(getdata1.get(25), 5, 1);
                TablePesan.setValueAt(getdata1.get(26), 6, 1);
                TablePesan.setValueAt(getdata1.get(27), 7, 1);
                TablePesan.setValueAt(getdata1.get(28), 8, 1);
                TablePesan.setValueAt(getdata1.get(29), 9, 1);
                TablePesan.setValueAt(getdata1.get(30), 10, 1);
                TablePesan.setValueAt(getdata1.get(31), 11, 1);
                TablePesan.setValueAt(getdata1.get(32), 12, 1);
                TablePesan.setValueAt(getdata1.get(33), 13, 1);
                TablePesan.setValueAt(getdata1.get(34), 14, 1);
                TablePesan.setValueAt(getdata1.get(35), 15, 1);
                TablePesan.setValueAt(getdata1.get(36), 16, 1);
                TablePesan.setValueAt(getdata1.get(37), 17, 1);
                TablePesan.setValueAt(getdata1.get(38), 18, 1);
                TablePesan.setValueAt(getdata1.get(39), 19, 1);
            } else {
                if(option == 2){
                    TablePesan.setValueAt(getdata1.get(40), 0, 1);
                    TablePesan.setValueAt(getdata1.get(41), 1, 1);
                    TablePesan.setValueAt(getdata1.get(42), 2, 1);
                    TablePesan.setValueAt(getdata1.get(43), 3, 1);
                    TablePesan.setValueAt(getdata1.get(44), 4, 1);
                    TablePesan.setValueAt(getdata1.get(45), 5, 1);
                    TablePesan.setValueAt(getdata1.get(46), 6, 1);
                    TablePesan.setValueAt(getdata1.get(47), 7, 1);
                    TablePesan.setValueAt(getdata1.get(48), 8, 1);
                    TablePesan.setValueAt(getdata1.get(49), 9, 1);
                    TablePesan.setValueAt(getdata1.get(50), 10, 1);
                    TablePesan.setValueAt(getdata1.get(51), 11, 1);
                    TablePesan.setValueAt(getdata1.get(52), 12, 1);
                    TablePesan.setValueAt(getdata1.get(53), 13, 1);
                    TablePesan.setValueAt(getdata1.get(54), 14, 1);
                    TablePesan.setValueAt(getdata1.get(55), 15, 1);
                    TablePesan.setValueAt(getdata1.get(56), 16, 1);
                    TablePesan.setValueAt(getdata1.get(57), 17, 1);
                    TablePesan.setValueAt(getdata1.get(58), 18, 1);
                    TablePesan.setValueAt(getdata1.get(59), 19, 1);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Data Tidak Ada");
                }
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablePesan = new javax.swing.JTable();
        cmbPilihan = new javax.swing.JComboBox();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TablePesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablePesan);

        cmbPilihan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbPilihan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ORD 1", "ORD 2", "ORD 3" }));
        cmbPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPilihanActionPerformed(evt);
            }
        });

        btnKembali.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel1.setText("NOTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPilihanActionPerformed
        tampil();
    }//GEN-LAST:event_cmbPilihanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        this.dispose();
        new Order().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arssguments
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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePesan;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox cmbPilihan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
