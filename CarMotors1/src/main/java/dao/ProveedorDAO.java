package dao;

import modelo.Proveedor;
import util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProveedorDAO {

    public boolean insertarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO proveedores (nombre_proveedor, telefono, frecuencia_suministro) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             System.out.println("✅ Conexión establecida: " + (conn != null));

            stmt.setString(1, proveedor.getNombre_proveedor());
            stmt.setLong(2, proveedor.getTelefono());
            stmt.setInt(3, proveedor.getFrecuencia_suministro());

            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;

        } catch (SQLException e) {
            System.err.println("❌ Error al insertar proveedor: " + e.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
    }
}
