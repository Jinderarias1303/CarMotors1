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
import modelo.Factura;
import util.ConexionBD;

/**
 *
 * @author jinde
 */
public class FacturaDAO {
      public boolean InsertarFactura(Factura factura){
            String sql = "INSERT INTO Factura(id_mantenimiento,id_cliente,fecha_emision,subtotal,impuestos,total,cufe,qr_code) Values(?,?,?,?,?,?,?,?)";
            
            try(Connection conn = ConexionBD.getConnection();
                  PreparedStatement stmt = conn.prepareStatement(sql)){
                  System.out.println("✅ Conexión establecida: " + (conn != null));
              
                 stmt.setInt(1, factura.getId_mantenimiento());
                 stmt.setInt(2, factura.getId_cliente());
                 stmt.setDate(3, java.sql.Date.valueOf(factura.getFecha_emision()));
                 stmt.setBigDecimal(4, factura.getSubtotal());
                 stmt.setBigDecimal(5, factura.getImpuestos());
                 stmt.setBigDecimal(6, factura.getTotal());
                 stmt.setString(7,factura.getCufe());
                 stmt.setString(8, factura.getQr_code());
      
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
