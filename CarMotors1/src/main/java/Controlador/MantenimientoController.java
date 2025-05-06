/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import dao.MantenimientoDAO;
import java.math.BigDecimal;
import java.time.LocalDate;
import modelo.Mantenimiento;

/**
 *
 * @author jinde
 */
public class MantenimientoController {
      private MantenimientoDAO mantenimientoDAO;
      
      public MantenimientoController(){
            this.mantenimientoDAO = new MantenimientoDAO();
      }
      
      public boolean registrarMantenimiento(String id_vehiculo, LocalDate fecha, String detalles, BigDecimal valor_mantenimiento,String estado){
            Mantenimiento mantenimiento = new Mantenimiento();
            mantenimiento.setId_vehiculo(id_vehiculo);
            mantenimiento.setFecha(fecha);
            mantenimiento.setDetalles(detalles);
            mantenimiento.setValor_mantenimiento(valor_mantenimiento);
            try {
                  mantenimiento.setEstado(Mantenimiento.Estado.valueOf(estado));
            } catch (IllegalArgumentException ex) {
                  System.err.println("❌ Estado inválido: " + estado);
             return false;
}

            
            return mantenimientoDAO.InsertarMantenimiento(mantenimiento);
      }
}
