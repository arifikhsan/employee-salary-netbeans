/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeSalary;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Arif Ikhsanudin
 */
public class Ui extends javax.swing.JFrame {

    public static final Integer NIP_COLUMN = 0;
    public static final Integer NAMA_COLUMN = 1;
    public static final Integer JABATAN_COLUMN = 2;
    public static final Integer GAJI_POKOK_COLUMN = 3;
    public static final Integer TRANSPORT_COLUMN = 4;
    public static final Integer GAJI_BERSIH_COLUMN = 5;

    /**
     * Creates new form Ui
     */
    public Ui() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFieldNIP = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        textFieldTransport = new javax.swing.JTextField();
        textFieldGajiPokok = new javax.swing.JTextField();
        textFieldGajiBersih = new javax.swing.JTextField();
        comboBoxJabatan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGaji = new javax.swing.JTable();
        buttonSave = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data Gaji Karyawan");

        jLabel3.setText("NIP");

        jLabel4.setText("Nama");

        jLabel5.setText("Jabatan");

        jLabel6.setText("Gaji Pokok");

        jLabel7.setText("Transport");

        jLabel8.setText("Gaji Bersih");

        textFieldNIP.setText("123456");
        textFieldNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNIPActionPerformed(evt);
            }
        });

        textFieldNama.setText("Nama");

        textFieldTransport.setEditable(false);
        textFieldTransport.setText("5");

        textFieldGajiBersih.setEditable(false);
        textFieldGajiBersih.setText("5");

        comboBoxJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Manager", "Staff" }));
        comboBoxJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxJabatanActionPerformed(evt);
            }
        });

        tableGaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIP", "Nama", "Jabatan", "Gaji Pokok", "Transport", "Gaji Bersih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGajiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableGaji);

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxJabatan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 43, Short.MAX_VALUE)
                                .addComponent(buttonSave)
                                .addGap(18, 18, 18)
                                .addComponent(buttonReset)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldGajiPokok)
                                    .addComponent(textFieldGajiBersih)
                                    .addComponent(textFieldTransport))))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldGajiPokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(textFieldTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textFieldGajiBersih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonReset)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNIPActionPerformed
       
    }//GEN-LAST:event_textFieldNIPActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int selectedRow = tableGaji.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableGaji.getModel();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void comboBoxJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxJabatanActionPerformed
//        System.out.println(comboBoxJabatan.getSelectedItem());
        if (comboBoxJabatan.getSelectedItem() == "Supervisor") {
            textFieldGajiPokok.setText("20");
        } else if (comboBoxJabatan.getSelectedItem() == "Manager") {
            textFieldGajiPokok.setText("15");
        } else {
            textFieldGajiPokok.setText("10");
        }
        Integer gajiBersih = Integer.parseInt(textFieldGajiPokok.getText()) + Integer.parseInt(textFieldTransport.getText());
        textFieldGajiBersih.setText(gajiBersih.toString());
    }//GEN-LAST:event_comboBoxJabatanActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String nip = textFieldNIP.getText();
        String name = textFieldNama.getText();
        String jabatan = comboBoxJabatan.getSelectedItem().toString();
        String gajiPokok = textFieldGajiPokok.getText();
        String transport = textFieldTransport.getText();
        String gajiBersih = textFieldGajiBersih.getText();

        Object[] row = {nip, name, jabatan, gajiPokok, transport, gajiBersih};
        DefaultTableModel model = (DefaultTableModel) tableGaji.getModel();
        model.addRow(row);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableGajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGajiMouseClicked
        int selectedRow = tableGaji.getSelectedRow();
        TableModel model = tableGaji.getModel();

        String nip = model.getValueAt(selectedRow, NIP_COLUMN).toString();
        String nama = model.getValueAt(selectedRow, NAMA_COLUMN).toString();
        String jabatan = model.getValueAt(selectedRow, JABATAN_COLUMN).toString();
        String gajiPokok = model.getValueAt(selectedRow, GAJI_POKOK_COLUMN).toString();
        String transport = model.getValueAt(selectedRow, TRANSPORT_COLUMN).toString();
        String gajiBersih = model.getValueAt(selectedRow, GAJI_BERSIH_COLUMN).toString();
        
        textFieldNIP.setText(nip);
        textFieldNama.setText(nama);
        comboBoxJabatan.setSelectedItem(jabatan);
        textFieldGajiPokok.setText(gajiPokok);
        textFieldTransport.setText(transport);
        textFieldGajiBersih.setText(gajiBersih);
    }//GEN-LAST:event_tableGajiMouseClicked

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableGaji.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        int selectedRow = tableGaji.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableGaji.getModel();
        
        String nip = textFieldNIP.getText();
        String name = textFieldNama.getText();
        String jabatan = comboBoxJabatan.getSelectedItem().toString();
        String gajiPokok = textFieldGajiPokok.getText();
        String transport = textFieldTransport.getText();
        String gajiBersih = textFieldGajiBersih.getText();
        
        model.setValueAt(nip, selectedRow, NIP_COLUMN);
        model.setValueAt(name, selectedRow, NAMA_COLUMN);
        model.setValueAt(jabatan, selectedRow, JABATAN_COLUMN);
        model.setValueAt(gajiPokok, selectedRow, GAJI_POKOK_COLUMN);
        model.setValueAt(transport, selectedRow, TRANSPORT_COLUMN);
        model.setValueAt(gajiBersih, selectedRow, GAJI_BERSIH_COLUMN);
    }//GEN-LAST:event_buttonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboBoxJabatan;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableGaji;
    private javax.swing.JTextField textFieldGajiBersih;
    private javax.swing.JTextField textFieldGajiPokok;
    private javax.swing.JTextField textFieldNIP;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldTransport;
    // End of variables declaration//GEN-END:variables
}
