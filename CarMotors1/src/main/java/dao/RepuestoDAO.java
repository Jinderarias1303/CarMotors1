/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Repuesto;

/**
 *
 * @author jinde
 */
public class RepuestoDAO {
      
      private final Connection conn;

    public RepuestoDAO(Connection conn) {
        this.conn = conn;
    }
      
      public void insertar(Repuesto r) throws SQLException {
    String sql = "INSERT INTO repuesto (nombre_repuesto, tipo_repuesto, marca_modelo, id_proveedor, stock, fecha_ingreso, vida_util_meses, estado) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, r.getNombreRepuesto());
        stmt.setString(2, r.getTipoRepuesto().name().toLowerCase());
        stmt.setString(3, r.getMarcaModelo());
        stmt.setInt(4, r.getIdProveedor());
        stmt.setInt(5, r.getStock());
        stmt.setDate(6, Date.valueOf(r.getFechaIngreso()));
        stmt.setInt(7, r.getVidaUtilMeses());
        stmt.setString(8, r.getEstado().name().toLowerCase());
        stmt.executeUpdate();
    }
}

}
