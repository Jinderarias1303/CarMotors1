/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Mantenimiento;
import util.ConexionBD;

/**
 *
 * @author jinde
 */
public class MantenimientoDAO {
      public boolean InsertarMantenimiento(Mantenimiento mantenimiento){
            String sql = "INSERT INTO mantenimiento (id_vehiculo,fecha,detalles,valor_mantenimiento,estado) VALUES(?,?,?,?,?)";
            
             try(Connection conn = ConexionBD.getConnection();
                  PreparedStatement stmt = conn.prepareStatement(sql)){
                  System.out.println("✅ Conexión establecida: " + (conn != null));
              
                  stmt.setString(1,mantenimiento.getId_vehiculo());
                  stmt.setDate(2, java.sql.Date.valueOf(mantenimiento.getFecha()));
                  stmt.setString(3,mantenimiento.getDetalles());
                  stmt.setBigDecimal(4, mantenimiento.getValor_mantenimiento());
                  stmt.setString(5, mantenimiento.getEstado().name().toLowerCase());
                  
      
                  int filasInsertadas = stmt.executeUpdate();
                  return filasInsertadas > 0;
      }catch (SQLException e){
                  System.err.println("❌ Error al insertar este mantenimiento: " + e.getMessage());
                  return false;
            }catch(ClassNotFoundException ex){
                        Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
      }
}
