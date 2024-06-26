/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas;

import baseDeDatos.EditarBaseDatos;
import baseDeDatos.EliminarBaseDatos;
import clases.programaAcademico;
import baseDeDatos.GuardarBaseDatos;
import baseDeDatos.MostrarBaseDatos;
import clases.Director;
import clases.Docente;
import clases.Estudiante;
import clases.EstudianteBuilder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class EstudianteScreen extends javax.swing.JFrame {

    /**
     * Creates new form programaAcademicoScreen
     */
    public EstudianteScreen() {
        initComponents();
        cargarDatosEstudiantes();
        this.setLocationRelativeTo(null);

    }

    GuardarBaseDatos guardarBaseDatos = new GuardarBaseDatos();
    EliminarBaseDatos eliminarBaseDatos = new EliminarBaseDatos();

    public void cargarDatosEstudiantes() {
        MostrarBaseDatos dbHandler = new MostrarBaseDatos();
        try {
            Vector<Vector<String>> tableData = dbHandler.getTableData("estudiantes");
            Vector<String> columnNames = dbHandler.getColumnNames("estudiantes");

            DefaultTableModel dtm = new DefaultTableModel(tableData, columnNames);
            tablePrograma.setModel(dtm);
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
        btnEliminarPrograma = new javax.swing.JButton();
        btnEditarPrograma = new javax.swing.JButton();
        btnCrearEstudiante = new javax.swing.JButton();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtContraseñaEstudiante = new javax.swing.JTextField();
        txtCursoEstudiante = new javax.swing.JTextField();
        txtUsuarioEstudiante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePrograma = new javax.swing.JTable();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtEdadEstudiante = new javax.swing.JTextField();
        txtAsignaturasEstudiante = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jLabel6.setText("Nivel Academico:");

        jButton4.setText("Buscar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btnEliminarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarPrograma.setText("Eliminar");
        btnEliminarPrograma.setBorder(null);
        btnEliminarPrograma.setBorderPainted(false);
        btnEliminarPrograma.setContentAreaFilled(false);
        btnEliminarPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProgramaActionPerformed(evt);
            }
        });

        btnEditarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarPrograma.setText("Modificar");
        btnEditarPrograma.setBorder(null);
        btnEditarPrograma.setBorderPainted(false);
        btnEditarPrograma.setContentAreaFilled(false);
        btnEditarPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProgramaActionPerformed(evt);
            }
        });

        btnCrearEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crearPersona.png"))); // NOI18N
        btnCrearEstudiante.setText("Crear");
        btnCrearEstudiante.setBorder(null);
        btnCrearEstudiante.setBorderPainted(false);
        btnCrearEstudiante.setContentAreaFilled(false);
        btnCrearEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEstudianteActionPerformed(evt);
            }
        });

        txtNombreEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtNombreEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtContraseñaEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtContraseñaEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        txtCursoEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtCursoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        txtUsuarioEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtUsuarioEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        tablePrograma.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablePrograma);

        txtApellidoEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtApellidoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        txtEdadEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtEdadEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        txtAsignaturasEstudiante.setBackground(new java.awt.Color(0, 153, 255));
        txtAsignaturasEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignaturas"));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seccion Estudiante");

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
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuarioEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContraseñaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCursoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtAsignaturasEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseñaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCursoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtAsignaturasEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearEstudiante)
                            .addComponent(btnEditarPrograma)
                            .addComponent(btnEliminarPrograma)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEstudianteActionPerformed
        // TODO add your handling code here:
        Director director = new Director();
        EstudianteBuilder estudianteBuilder = new EstudianteBuilder();

        director.setBuilder(estudianteBuilder);

        estudianteBuilder.setNombre(txtNombreEstudiante.getText());
        estudianteBuilder.setApellido(txtApellidoEstudiante.getText());
        estudianteBuilder.setEdad(Integer.parseInt(txtEdadEstudiante.getText()));
        estudianteBuilder.setUsuario(txtUsuarioEstudiante.getText());
        estudianteBuilder.setPassword(txtContraseñaEstudiante.getText());

        estudianteBuilder.setIdCurso(Integer.parseInt(txtCursoEstudiante.getText()));
        estudianteBuilder.setIdAsignatura(Integer.parseInt(txtAsignaturasEstudiante.getText()));

        Estudiante estudiante = (Estudiante) director.construirUsuario();

        GuardarBaseDatos guardarBaseDatos = new GuardarBaseDatos();
        if (guardarBaseDatos.estudianteExiste(estudiante.getUsuario())) {
            JOptionPane.showMessageDialog(rootPane, "El nombre de usuario ya existe. Por favor, elige otro.");
        } else {
            guardarBaseDatos.guardarPersona(estudiante);
            JOptionPane.showMessageDialog(rootPane, "Alumno guardado con nombre: " + estudiante.getNombre() + " " + estudiante.getApellido()
                    + " y curso numero: " + estudiante.getIdCurso());
            cargarDatosEstudiantes();
        }

        txtNombreEstudiante.setText("");
        txtApellidoEstudiante.setText("");
        txtEdadEstudiante.setText("");
        


    }//GEN-LAST:event_btnCrearEstudianteActionPerformed

    private void btnEliminarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProgramaActionPerformed
        // TODO add your handling code here:
        // Obtén el nombre del programa que quieres eliminar
        String usuarioEstudiante = txtUsuarioEstudiante.getText();
        if (usuarioEstudiante.isEmpty()) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Ingresa el usuario del estudiante a eliminar");
        } else {
            // Llama al método borrarPrograma
            eliminarBaseDatos.borrarEstudiante(usuarioEstudiante);

            cargarDatosEstudiantes();

            txtUsuarioEstudiante.setText("");
        }


    }//GEN-LAST:event_btnEliminarProgramaActionPerformed

    private void btnEditarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProgramaActionPerformed
        // TODO add your handling code here:
        btnEditarPrograma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombreEstudiante.getText();
                String apellido = txtApellidoEstudiante.getText();
                int edad = Integer.parseInt(txtEdadEstudiante.getText());
                String usuario = txtUsuarioEstudiante.getText();
                String password = txtContraseñaEstudiante.getText();
                int idCurso = Integer.parseInt(txtCursoEstudiante.getText());
                int idAsignatura = Integer.parseInt(txtAsignaturasEstudiante.getText());

                EstudianteBuilder builder = new EstudianteBuilder();
                builder.setNombre(nombre);
                builder.setApellido(apellido);
                builder.setEdad(edad);
                builder.setUsuario(usuario);
                builder.setPassword(password);
                builder.setIdCurso(idCurso);
                builder.setIdAsignatura(idAsignatura);
                Estudiante estudiante = builder.build();

                EditarBaseDatos dbHandler = new EditarBaseDatos();
                try {
                    dbHandler.editarEstudiante(estudiante);
                    // Recarga los datos después de editar
                    cargarDatosEstudiantes();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                txtNombreEstudiante.setText("");
                txtApellidoEstudiante.setText("");
                txtEdadEstudiante.setText("");
                txtUsuarioEstudiante.setText("");
                txtContraseñaEstudiante.setText("");
                txtCursoEstudiante.setText("");
                txtAsignaturasEstudiante.setText("");
            }
        });

        tablePrograma.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tablePrograma.getSelectedRow();
                if (selectedRow != -1) {
                    txtNombreEstudiante.setText(tablePrograma.getValueAt(selectedRow, 1).toString());
                    txtApellidoEstudiante.setText(tablePrograma.getValueAt(selectedRow, 2).toString());
                    txtEdadEstudiante.setText(tablePrograma.getValueAt(selectedRow, 3).toString());
                    txtUsuarioEstudiante.setText(tablePrograma.getValueAt(selectedRow, 4).toString());
                    txtContraseñaEstudiante.setText(tablePrograma.getValueAt(selectedRow, 5).toString());
                    txtCursoEstudiante.setText(tablePrograma.getValueAt(selectedRow, 6).toString());
                    txtAsignaturasEstudiante.setText(tablePrograma.getValueAt(selectedRow, 7).toString());
                }
            }
        });

    }//GEN-LAST:event_btnEditarProgramaActionPerformed

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
            java.util.logging.Logger.getLogger(EstudianteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnEditarPrograma;
    private javax.swing.JButton btnEliminarPrograma;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePrograma;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtAsignaturasEstudiante;
    private javax.swing.JTextField txtContraseñaEstudiante;
    private javax.swing.JTextField txtCursoEstudiante;
    private javax.swing.JTextField txtEdadEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtUsuarioEstudiante;
    // End of variables declaration//GEN-END:variables
}
