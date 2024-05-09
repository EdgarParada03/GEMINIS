/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import com.sun.jdi.connect.spi.Connection;
import java.util.Vector;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class MostrarBaseDatosCursos {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/geminis";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";

    public Vector<Vector<String>> getTableData(String query) throws SQLException {
        Vector<Vector<String>> tableData = new Vector<>();

        try (java.sql.Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            // Obtiene el número de columnas
            int columns = rsmd.getColumnCount();

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getString(i));
                }
                tableData.add(row);
            }
        }

        return tableData;
    }

    public Vector<String> getColumnNames(String query) throws SQLException {
        Vector<String> columnNames = new Vector<>();

        try (java.sql.Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            // Obtiene el número de columnas
            int columns = rsmd.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                columnNames.add(rsmd.getColumnName(i));
            }
        }

        return columnNames;
    }
}