/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import dao.FacturaDAO;
import java.math.BigDecimal;
import java.time.LocalDate;
import modelo.Factura;

/**
 *
 * @author jinde
 */
public class FacturaController {
      private FacturaDAO facturaDAO;
      
      public FacturaController(){
            this.facturaDAO = new FacturaDAO();
      }
      
      public boolean RegistrarFactura(int id_mantenimiento, int id_cliente, LocalDate fecha_emision, BigDecimal subtotal, BigDecimal impuestos, BigDecimal total, String Cufe, String qr_code){
            Factura factura = new Factura();
            factura.setId_mantenimiento(id_mantenimiento);
            factura.setId_cliente(id_cliente);
            factura.setFecha_emision(fecha_emision);
            factura.setSubtotal(subtotal);
            factura.setImpuestos(impuestos);
            factura.setTotal(total);
            factura.setCufe(Cufe);
            factura.setQr_code(qr_code);
            
            return facturaDAO.InsertarFactura(factura);
      }
}
