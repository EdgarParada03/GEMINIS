/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas;

import baseDeDatos.EditarBaseDatos;
import baseDeDatos.EliminarBaseDatos;
import baseDeDatos.GuardarBaseDatos;
import baseDeDatos.MostrarBaseDatos;
import clases.pensumAcademico;
import clases.programaAcademico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author edgar
 */
public class pensumAcademicoScreen extends javax.swing.JFrame {

    /**
     * Creates new form programaAcademicoScreen
     */
    public pensumAcademicoScreen() {
        initComponents();
        cargarDatosPensum();
        this.setLocationRelativeTo(null);
        guardarBaseDatos.llenarComboBox(comboBoxPrograma, "programaacademico", "idProgramaAcademico");
    }

    GuardarBaseDatos guardarBaseDatos = new GuardarBaseDatos();
    EliminarBaseDatos eliminarBaseDatos = new EliminarBaseDatos();

    public void cargarDatosPensum() {
        MostrarBaseDatos dbHandler = new MostrarBaseDatos();
        try {
            Vector<Vector<String>> tableData = dbHandler.getTableData("pensum");
            Vector<String> columnNames = dbHandler.getColumnNames("pensum");

            DefaultTableModel dtm = new DefaultTableModel(tableData, columnNames);
            tablePensum.setModel(dtm);
        } catch (SQLException e) {
            e.printStackTrace();
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

        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnEliminarPensum = new javax.swing.JButton();
        btnEditarPensum = new javax.swing.JButton();
        btnCrearPensum = new javax.swing.JButton();
        txtCreditosPensum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePensum = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        comboBoxPrograma = new javax.swing.JComboBox<>();

        jLabel6.setText("Nivel Academico:");

        jButton4.setText("Buscar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btnEliminarPensum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarPensum.setText("Eliminar");
        btnEliminarPensum.setBorder(null);
        btnEliminarPensum.setBorderPainted(false);
        btnEliminarPensum.setContentAreaFilled(false);
        btnEliminarPensum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPensumActionPerformed(evt);
            }
        });

        btnEditarPensum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarPensum.setText("Modificar");
        btnEditarPensum.setBorder(null);
        btnEditarPensum.setBorderPainted(false);
        btnEditarPensum.setContentAreaFilled(false);
        btnEditarPensum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPensumActionPerformed(evt);
            }
        });

        btnCrearPensum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearObjeto.png"))); // NOI18N
        btnCrearPensum.setText("Crear");
        btnCrearPensum.setBorder(null);
        btnCrearPensum.setBorderPainted(false);
        btnCrearPensum.setContentAreaFilled(false);
        btnCrearPensum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPensumActionPerformed(evt);
            }
        });

        txtCreditosPensum.setBackground(new java.awt.Color(0, 153, 255));
        txtCreditosPensum.setBorder(javax.swing.BorderFactory.createTitledBorder("Total creditos"));

        tablePensum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PENSUM", "TOTAL CREDITOS", "ID PROGRAMA"
            }
        ));
        jScrollPane2.setViewportView(tablePensum);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seccion Pensum Academico");

        btnRegresar.setBackground(new java.awt.Color(0, 153, 204));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        comboBoxPrograma.setBackground(new java.awt.Color(0, 153, 255));
        comboBoxPrograma.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Programa"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCreditosPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreditosPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearPensum)
                            .addComponent(btnEditarPensum)
                            .addComponent(btnEliminarPensum)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPensumActionPerformed
        // TODO add your handling code here:

        btnCrearPensum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String programaSeleccionado = (String) comboBoxPrograma.getSelectedItem();
                // Crear un objeto ProgramaAcademico con los datos ingresados
                pensumAcademico pensum = new pensumAcademico(txtCreditosPensum.getText(),
                        Integer.parseInt(programaSeleccionado));
                // Llamar al método guardarPrograma
                guardarBaseDatos.guardarPensum(pensum);

                cargarDatosPensum();

                txtCreditosPensum.setText("");

            }
        });
    }//GEN-LAST:event_btnCrearPensumActionPerformed

    private void btnEliminarPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPensumActionPerformed
        // TODO add your handling code here:
        btnEliminarPensum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtén el nombre del programa que quieres eliminar
                int codigoPrograma = Integer.parseInt((String) comboBoxPrograma.getSelectedItem());
                if (codigoPrograma == 0) {
                    // Muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Selecciona el codigo de programa academico del pensum a eliminar");
                } else {
                    // Llama al método borrarPrograma
                    eliminarBaseDatos.borrarPensum(codigoPrograma);

                    cargarDatosPensum();
                }
            }
        });
    }//GEN-LAST:event_btnEliminarPensumActionPerformed

    private void btnEditarPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPensumActionPerformed
        // TODO add your handling code here:

        btnEditarPensum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tablePensum.getSelectedRow();
                if (selectedRow != -1) {
                    int creditos = Integer.parseInt(txtCreditosPensum.getText());
                    int idProgramaAcademico = Integer.parseInt((String) comboBoxPrograma.getSelectedItem());
                    int id = Integer.parseInt(tablePensum.getValueAt(selectedRow, 0).toString());

                    EditarBaseDatos dbHandler = new EditarBaseDatos();
                    try {
                        dbHandler.editarFila("pensum", creditos, idProgramaAcademico, id);
                        // Recarga los datos después de editar
                        cargarDatosPensum();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        txtCreditosPensum.setText("");
        
        tablePensum.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent event) {
        int selectedRow = tablePensum.getSelectedRow();
        if (selectedRow != -1) {
            txtCreditosPensum.setText(tablePensum.getValueAt(selectedRow, 1).toString());
            comboBoxPrograma.setSelectedItem(tablePensum.getValueAt(selectedRow, 2).toString());
            

        }
    }
});
        
    }//GEN-LAST:event_btnEditarPensumActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        AdministradorScreen adm = new AdministradorScreen();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(pensumAcademicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pensumAcademicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pensumAcademicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pensumAcademicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pensumAcademicoScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPensum;
    private javax.swing.JButton btnEditarPensum;
    private javax.swing.JButton btnEliminarPensum;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboBoxPrograma;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePensum;
    private javax.swing.JTextField txtCreditosPensum;
    // End of variables declaration//GEN-END:variables
}