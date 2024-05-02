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
import clases.semestreAcademico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author edgar
 */
public class SemestreScreen extends javax.swing.JFrame {

    /**
     * Creates new form programaAcademicoScreen
     */
    public SemestreScreen() {
        initComponents();
        cargarDatosSemestre();
        this.setLocationRelativeTo(null);
    }

    GuardarBaseDatos guardarBaseDatos = new GuardarBaseDatos();
    EliminarBaseDatos eliminarBaseDatos = new EliminarBaseDatos();

    public void cargarDatosSemestre() {
        MostrarBaseDatos dbHandler = new MostrarBaseDatos();
        try {
            Vector<Vector<String>> tableData = dbHandler.getTableData("semestreacademico");
            Vector<String> columnNames = dbHandler.getColumnNames("semestreacademico");

            DefaultTableModel dtm = new DefaultTableModel(tableData, columnNames);
            tableSemestre.setModel(dtm);
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
        btnEliminarSemestre = new javax.swing.JButton();
        btnEditarSemestre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearSemestre = new javax.swing.JButton();
        txtAñoSemestre = new javax.swing.JTextField();
        txtPeriodoSemestre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSemestre = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jDateChooserInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserFin = new com.toedter.calendar.JDateChooser();

        jLabel6.setText("Nivel Academico:");

        jButton4.setText("Buscar");

        jLabel8.setText("Programa Academico:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEliminarSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarSemestre.setText("Eliminar");
        btnEliminarSemestre.setBorder(null);
        btnEliminarSemestre.setBorderPainted(false);
        btnEliminarSemestre.setContentAreaFilled(false);
        btnEliminarSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSemestreActionPerformed(evt);
            }
        });

        btnEditarSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarSemestre.setText("Modificar");
        btnEditarSemestre.setBorder(null);
        btnEditarSemestre.setBorderPainted(false);
        btnEditarSemestre.setContentAreaFilled(false);
        btnEditarSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSemestreActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Año academico:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Periodo academico:");

        btnCrearSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearObjeto.png"))); // NOI18N
        btnCrearSemestre.setText("Crear");
        btnCrearSemestre.setBorder(null);
        btnCrearSemestre.setBorderPainted(false);
        btnCrearSemestre.setContentAreaFilled(false);
        btnCrearSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSemestreActionPerformed(evt);
            }
        });

        tableSemestre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ASIGNATURA", "NOMBRE", "HORA INICIO", "HORA FIN", "DIA", "ID PENSUM"
            }
        ));
        jScrollPane2.setViewportView(tableSemestre);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha fin");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fecha inicio:");

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seccion Semestre");

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
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(btnCrearSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEditarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAñoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPeriodoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(btnEliminarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAñoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeriodoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearSemestre)
                            .addComponent(btnEditarSemestre))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarSemestre))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnCrearSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSemestreActionPerformed
        // TODO add your handling code here:

        btnCrearSemestre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Formatear la fecha a una cadena de texto
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                // Obtener las fechas seleccionadas en los JDateChoosers
                Date fechaInicioSeleccionada = jDateChooserInicio.getDate();
                String inicioSemestre = sdf.format(fechaInicioSeleccionada);
                Date fechaFinSeleccionada = jDateChooserFin.getDate();
                String finSemestre = sdf.format(fechaFinSeleccionada);

                // Obtener los datos ingresados
                String añoAcademico = txtAñoSemestre.getText();
                String periodoAcademico = txtPeriodoSemestre.getText();

                // Verificar si los campos están vacíos
                if (añoAcademico.isEmpty() || periodoAcademico.isEmpty()) {
                    System.out.println("Los campos Año Académico y Periodo Académico no pueden estar vacíos.");
                    return;
                }

                // Verificar si el semestre académico ya existe
                if (!guardarBaseDatos.semestreExiste(añoAcademico, periodoAcademico)) {
                    // Crear un objeto semestreAcademico con los datos ingresados
                    semestreAcademico semestre = new semestreAcademico(añoAcademico, periodoAcademico, inicioSemestre, finSemestre);

                    // Llamar al método guardarSemestre
                    guardarBaseDatos.guardarSemestre(semestre);

                    cargarDatosSemestre();

                    txtAñoSemestre.setText("");
                    txtPeriodoSemestre.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El semestre académico ya existe.");
                }
            }
        });


    }//GEN-LAST:event_btnCrearSemestreActionPerformed

    private void btnEliminarSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSemestreActionPerformed
        // TODO add your handling code here:
        btnEliminarSemestre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtén el año académico y el periodo académico que quieres eliminar
                String añoAcademico = txtAñoSemestre.getText();
                String periodoAcademico = txtPeriodoSemestre.getText();

                if (añoAcademico.isEmpty() || periodoAcademico.isEmpty()) {
                    // Muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Ingresa el año académico y el periodo académico del semestre a eliminar");
                } else {
                    // Llama al método borrarSemestre
                    eliminarBaseDatos.borrarSemestre(añoAcademico, periodoAcademico);

                    cargarDatosSemestre();

                    txtAñoSemestre.setText("");
                    txtPeriodoSemestre.setText("");
                }
            }
        });

    }//GEN-LAST:event_btnEliminarSemestreActionPerformed

    private void btnEditarSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSemestreActionPerformed
        // TODO add your handling code here:
        btnEditarSemestre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableSemestre.getSelectedRow();
                if (selectedRow != -1) {
                    String año = txtAñoSemestre.getText();
                    String periodo = txtPeriodoSemestre.getText();

                    // Obtener las fechas seleccionadas en los JDateChoosers
                    Date fechaInicioSeleccionada = jDateChooserInicio.getDate();
                    SimpleDateFormat sdfInicio = new SimpleDateFormat("yyyy-MM-dd");
                    String inicio = sdfInicio.format(fechaInicioSeleccionada);

                    Date fechaFinSeleccionada = jDateChooserFin.getDate();
                    SimpleDateFormat sdfFin = new SimpleDateFormat("yyyy-MM-dd");
                    String fin = sdfFin.format(fechaFinSeleccionada);

                    int id = Integer.parseInt(tableSemestre.getValueAt(selectedRow, 0).toString());

                    EditarBaseDatos dbHandler = new EditarBaseDatos();
                    try {
                        dbHandler.editarSemestre("semestreacademico", año, periodo, inicio, fin, id);
                        // Recarga los datos después de editar
                        cargarDatosSemestre();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                    // Limpia los campos de texto después de guardar los cambios
                    txtAñoSemestre.setText("");
                    txtPeriodoSemestre.setText("");
                }
            }
        });

// El ListSelectionListener debería ir en un lugar separado, no dentro del método actionPerformed
        tableSemestre.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tableSemestre.getSelectedRow();
                if (selectedRow != -1) {
                    txtAñoSemestre.setText(tableSemestre.getValueAt(selectedRow, 1).toString());
                    txtPeriodoSemestre.setText(tableSemestre.getValueAt(selectedRow, 2).toString());

                    // Parsear las fechas de inicio y fin
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date fechaInicio = sdf.parse(tableSemestre.getValueAt(selectedRow, 3).toString());
                        jDateChooserInicio.setDate(fechaInicio);
                        Date fechaFin = sdf.parse(tableSemestre.getValueAt(selectedRow, 4).toString());
                        jDateChooserFin.setDate(fechaFin);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


    }//GEN-LAST:event_btnEditarSemestreActionPerformed

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
            java.util.logging.Logger.getLogger(SemestreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemestreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemestreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemestreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemestreScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearSemestre;
    private javax.swing.JButton btnEditarSemestre;
    private javax.swing.JButton btnEliminarSemestre;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooserFin;
    private com.toedter.calendar.JDateChooser jDateChooserInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSemestre;
    private javax.swing.JTextField txtAñoSemestre;
    private javax.swing.JTextField txtPeriodoSemestre;
    // End of variables declaration//GEN-END:variables
}
