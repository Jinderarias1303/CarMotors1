/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vehiculo;
import util.ConexionBD;

/**
 *
 * @author jinde
 */
public class VehiculoDAO {
      public  boolean InsertarVehiculo(Vehiculo vehiculo){
            String sql = "INSERT INTO vehiculo (placa, id_dueño, tipo_vehiculo, marca,modelo) VALUES(?,?,?,?,?)";
            
            try(Connection conn = ConexionBD.getConnection();
                  PreparedStatement stmt = conn.prepareStatement(sql)){
                  System.out.println("✅ Conexión establecida: " + (conn != null));
                  
                  stmt.setString(1, vehiculo.getPlaca());
                  stmt.setInt(2, vehiculo.getId_dueño());
                  stmt.setString(3, vehiculo.getTipo_vehiculo().name());
                  stmt.setString(4, vehiculo.getMarca());
                  stmt.setString(5, vehiculo.getModelo());
                  
                  int filasInsertadas = stmt.executeUpdate();
                  return filasInsertadas > 0;
            }catch (SQLException e){
                  System.err.println("❌ Error al insertar proveedor: " + e.getMessage());
                  return false;
            }catch(ClassNotFoundException ex){
                        Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
      }
}
