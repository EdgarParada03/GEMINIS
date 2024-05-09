/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas;

import baseDeDatos.EditarBaseDatos;
import baseDeDatos.EliminarBaseDatos;
import baseDeDatos.GuardarBaseDatos;
import baseDeDatos.MostrarBaseDatos;
import clases.asignatura;
import clases.pensumAcademico;
import clases.programaAcademico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author edgar
 */
public class AsignaturasScreen extends javax.swing.JFrame {

    /**
     * Creates new form programaAcademicoScreen
     */
    public AsignaturasScreen() {
        initComponents();
        cargarDatosAsignatura();
        this.setLocationRelativeTo(null);

        guardarBaseDatos.llenarComboBox(comboBoxSemestre, "semestreacademico" , "idSemestre");

        guardarBaseDatos.llenarComboBox(comboBoxPensum, "pensum", "idPensum");
    }

    GuardarBaseDatos guardarBaseDatos = new GuardarBaseDatos();
    EliminarBaseDatos eliminarBaseDatos = new EliminarBaseDatos();

    public void cargarDatosAsignatura() {
        MostrarBaseDatos dbHandler = new MostrarBaseDatos();
        try {
            Vector<Vector<String>> tableData = dbHandler.getTableData("asignaturas");
            Vector<String> columnNames = dbHandler.getColumnNames("asignaturas");

            DefaultTableModel dtm = new DefaultTableModel(tableData, columnNames);
            tableAsignatura.setModel(dtm);
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
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEliminarAsignatura = new javax.swing.JButton();
        btnEditarAsignatura = new javax.swing.JButton();
        btnCrearAsignatura = new javax.swing.JButton();
        txtNombreAsignatura = new javax.swing.JTextField();
        txtHoraInicioAsignatura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAsignatura = new javax.swing.JTable();
        txtHoraFinAsignatura = new javax.swing.JTextField();
        txtCreditosAsignatura = new javax.swing.JTextField();
        txtDiaAsignatura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        comboBoxPensum = new javax.swing.JComboBox<>();
        comboBoxSemestre = new javax.swing.JComboBox<>();

        jLabel6.setText("Nivel Academico:");

        jButton4.setText("Buscar");

        jLabel8.setText("Programa Academico:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btnEliminarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarAsignatura.setText("Eliminar");
        btnEliminarAsignatura.setBorder(null);
        btnEliminarAsignatura.setBorderPainted(false);
        btnEliminarAsignatura.setContentAreaFilled(false);
        btnEliminarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAsignaturaActionPerformed(evt);
            }
        });

        btnEditarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarAsignatura.setText("Modificar");
        btnEditarAsignatura.setBorder(null);
        btnEditarAsignatura.setBorderPainted(false);
        btnEditarAsignatura.setContentAreaFilled(false);
        btnEditarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAsignaturaActionPerformed(evt);
            }
        });

        btnCrearAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearObjeto.png"))); // NOI18N
        btnCrearAsignatura.setText("Crear");
        btnCrearAsignatura.setBorder(null);
        btnCrearAsignatura.setBorderPainted(false);
        btnCrearAsignatura.setContentAreaFilled(false);
        btnCrearAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAsignaturaActionPerformed(evt);
            }
        });

        txtNombreAsignatura.setBackground(new java.awt.Color(0, 153, 255));
        txtNombreAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombreAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreAsignatura.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNombreAsignatura.setSelectionColor(new java.awt.Color(204, 204, 204));

        txtHoraInicioAsignatura.setBackground(new java.awt.Color(0, 153, 255));
        txtHoraInicioAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora inicio"));

        tableAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ASIGNATURA", "NOMBRE", "HORA INICIO", "HORA FIN", "DIA", "ID PENSUM"
            }
        ));
        jScrollPane2.setViewportView(tableAsignatura);

        txtHoraFinAsignatura.setBackground(new java.awt.Color(0, 153, 255));
        txtHoraFinAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora fin"));

        txtCreditosAsignatura.setBackground(new java.awt.Color(0, 153, 255));
        txtCreditosAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de creditos"));

        txtDiaAsignatura.setBackground(new java.awt.Color(0, 153, 255));
        txtDiaAsignatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seccion Asignaturas");

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
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        comboBoxPensum.setBackground(new java.awt.Color(0, 153, 255));
        comboBoxPensum.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Pensum"));
        comboBoxPensum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPensumActionPerformed(evt);
            }
        });

        comboBoxSemestre.setBackground(new java.awt.Color(0, 153, 255));
        comboBoxSemestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Semestre"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHoraInicioAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(comboBoxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHoraFinAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtNombreAsignatura))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCreditosAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxPensum, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrearAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(btnEditarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreditosAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraFinAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraInicioAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxPensum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarAsignatura)
                    .addComponent(btnEditarAsignatura)
                    .addComponent(btnCrearAsignatura))
                .addContainerGap(50, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAsignaturaActionPerformed
        // TODO add your handling code here:
        btnCrearAsignatura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pensumSeleccionado = (String) comboBoxPensum.getSelectedItem();
                String semestreSeleccionado = (String) comboBoxSemestre.getSelectedItem();

                // Crear un objeto ProgramaAcademico con los datos ingresados
                asignatura asignaturas = new asignatura(txtNombreAsignatura.getText(),
                        txtHoraInicioAsignatura.getText(), txtHoraFinAsignatura.getText(),
                        txtDiaAsignatura.getText(), Integer.parseInt(txtCreditosAsignatura.getText()),
                        Integer.parseInt(pensumSeleccionado),
                        Integer.parseInt(semestreSeleccionado));

                if (guardarBaseDatos.asignaturaExiste(txtNombreAsignatura.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "El nombre de la asignatura ya existe. Por favor, elige otro.");
                } else {
                    // Llamar al método guardarPrograma
                    guardarBaseDatos.guardarAsignatura(asignaturas);
                    

                    cargarDatosAsignatura();
                }

                cargarDatosAsignatura();

                txtNombreAsignatura.setText("");
                txtHoraInicioAsignatura.setText("");
                txtHoraFinAsignatura.setText("");
                txtDiaAsignatura.setText("");
                txtCreditosAsignatura.setText("");

            }
        });
    }//GEN-LAST:event_btnCrearAsignaturaActionPerformed

    private void btnEliminarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAsignaturaActionPerformed
        // TODO add your handling code here:
        btnEliminarAsignatura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtén el nombre del programa que quieres eliminar
                String nombreAsignatura = txtNombreAsignatura.getText();
                if (nombreAsignatura.isEmpty()) {
                    // Muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Ingresa el nombre de la asignatura a eliminar");
                } else {
                    // Llama al método borrarPrograma
                    eliminarBaseDatos.borrarAsignatura(nombreAsignatura);

                    cargarDatosAsignatura();

                    txtNombreAsignatura.setText("");

                }
            }
        });
    }//GEN-LAST:event_btnEliminarAsignaturaActionPerformed

    private void btnEditarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAsignaturaActionPerformed
        // TODO add your handling code here:

        btnEditarAsignatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableAsignatura.getSelectedRow();
                if (selectedRow != -1) {
                    String nombreAsignatura = txtNombreAsignatura.getText();
                    String horaInicio = txtHoraInicioAsignatura.getText();
                    String horaFin = txtHoraFinAsignatura.getText();
                    String dia = txtDiaAsignatura.getText();
                    int numeroCreditos = Integer.parseInt(txtCreditosAsignatura.getText());
                    int idPensum = Integer.parseInt((String) comboBoxPensum.getSelectedItem());
                    int idSemestre = Integer.parseInt((String) comboBoxSemestre.getSelectedItem());
                    int id = Integer.parseInt(tableAsignatura.getValueAt(selectedRow, 0).toString());

                    EditarBaseDatos dbHandler = new EditarBaseDatos();
                    try {
                        dbHandler.editarAsignatura("asignaturas", nombreAsignatura, horaInicio, horaFin, dia, numeroCreditos, idPensum, idSemestre, id);
                        // Recarga los datos después de editar
                        cargarDatosAsignatura();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        txtNombreAsignatura.setText("");
        txtHoraInicioAsignatura.setText("");
        txtHoraFinAsignatura.setText("");
        txtDiaAsignatura.setText("");
        txtCreditosAsignatura.setText("");

        tableAsignatura.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tableAsignatura.getSelectedRow();
                if (selectedRow != -1) {
                    txtNombreAsignatura.setText(tableAsignatura.getValueAt(selectedRow, 1).toString());
                    txtHoraInicioAsignatura.setText(tableAsignatura.getValueAt(selectedRow, 2).toString());
                    txtHoraFinAsignatura.setText(tableAsignatura.getValueAt(selectedRow, 3).toString());
                    txtDiaAsignatura.setText(tableAsignatura.getValueAt(selectedRow, 4).toString());
                    txtCreditosAsignatura.setText(tableAsignatura.getValueAt(selectedRow, 5).toString());
                    comboBoxPensum.setSelectedItem(tableAsignatura.getValueAt(selectedRow, 6).toString());
                    comboBoxSemestre.setSelectedItem(tableAsignatura.getValueAt(selectedRow, 7).toString());

                }
            }
        });

    }//GEN-LAST:event_btnEditarAsignaturaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        AdministradorScreen adm = new AdministradorScreen();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void comboBoxPensumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPensumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPensumActionPerformed

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
            java.util.logging.Logger.getLogger(AsignaturasScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignaturasScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignaturasScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignaturasScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignaturasScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAsignatura;
    private javax.swing.JButton btnEditarAsignatura;
    private javax.swing.JButton btnEliminarAsignatura;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboBoxPensum;
    private javax.swing.JComboBox<String> comboBoxSemestre;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAsignatura;
    private javax.swing.JTextField txtCreditosAsignatura;
    private javax.swing.JTextField txtDiaAsignatura;
    private javax.swing.JTextField txtHoraFinAsignatura;
    private javax.swing.JTextField txtHoraInicioAsignatura;
    private javax.swing.JTextField txtNombreAsignatura;
    // End of variables declaration//GEN-END:variables
}
