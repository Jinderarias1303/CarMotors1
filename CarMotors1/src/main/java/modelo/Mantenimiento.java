/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author jinde
 */
public class Mantenimiento {
      public enum Estado{
            pendiente,en_proceso,completo,entregado
      }
      
      private String id_vehiculo;
      private LocalDate fecha;
      private String detalles;
      private BigDecimal valor_mantenimiento;
      private Estado estado;

      public Mantenimiento() {
      }

      public Mantenimiento(String id_vehiculo, LocalDate fecha, String detalles, BigDecimal valor_mantenimiento, Estado estado) {
            this.id_vehiculo = id_vehiculo;
            this.fecha = fecha;
            this.detalles = detalles;
            this.valor_mantenimiento = valor_mantenimiento;
            this.estado = estado;
      }

      public String getId_vehiculo() {
            return id_vehiculo;
      }

      public void setId_vehiculo(String id_vehiculo) {
            this.id_vehiculo = id_vehiculo;
      }

      public LocalDate getFecha() {
            return fecha;
      }

      public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
      }

      public String getDetalles() {
            return detalles;
      }

      public void setDetalles(String detalles) {
            this.detalles = detalles;
      }

      public BigDecimal getValor_mantenimiento() {
            return valor_mantenimiento;
      }

      public void setValor_mantenimiento(BigDecimal valor_mantenimiento) {
            this.valor_mantenimiento = valor_mantenimiento;
      }

      public Estado getEstado() {
            return estado;
      }

      public void setEstado(Estado estado) {
            this.estado = estado;
      }

      @Override
      public String toString() {
            return "Mantenimiento{" + "id_vehiculo=" + id_vehiculo + ", fecha=" + fecha + ", detalles=" + detalles + ", valor_mantenimiento=" + valor_mantenimiento + ", estado=" + estado + '}';
      }
      
      
      
}
