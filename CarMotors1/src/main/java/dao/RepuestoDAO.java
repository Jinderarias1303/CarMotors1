package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Repuesto;
import util.ConexionBD;

public class RepuestoDAO {
    public boolean insertarRepuesto(Repuesto repuesto) {
        String sql = "INSERT INTO repuesto(nombre_repuesto, tipo_repuesto, marca_modelo, id_proveedor, stock, fecha_ingreso, vida_util_meses, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            System.out.println("✅ Conexión establecida: " + (conn != null));

            stmt.setString(1, repuesto.getNombre_repuesto());
            stmt.setString(2, repuesto.getTipo_repuesto().name().toLowerCase());
            stmt.setString(3, repuesto.getMarca_modelo());
            stmt.setInt(4, repuesto.getId_proveedor());
            stmt.setInt(5, repuesto.getStock());
            stmt.setDate(6, java.sql.Date.valueOf(repuesto.getFecha_ingreso()));
            stmt.setInt(7, repuesto.getVida_util_meses());
            stmt.setString(8, repuesto.getEstado().name().toLowerCase());

            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;

        } catch (SQLException e) {
            System.err.println("❌ Error al insertar Repuesto: " + e.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
