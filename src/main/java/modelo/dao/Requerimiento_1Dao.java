package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_1Vo> listadoReq1 = new ArrayList<Requerimiento_1Vo>();
        String sql = "SELECT Ciudad_Residencia, AVG(Salario) as Promedio FROM Lider l GROUP BY Ciudad_Residencia HAVING AVG(Salario)<400000 ORDER BY AVG(Salario) DESC;";
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setCiudadResidencia(rs.getString("Ciudad_Residencia"));
                requerimiento1.setPromedio(rs.getDouble("Promedio"));
                listadoReq1.add(requerimiento1);
            }
        }
        return listadoReq1;
    }
}