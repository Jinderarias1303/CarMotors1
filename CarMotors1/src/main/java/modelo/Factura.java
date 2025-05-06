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
public class Factura {
     private int id_mantenimiento;
     private int id_cliente;
     private LocalDate fecha_emision;
     private BigDecimal subtotal;
     private BigDecimal impuestos;
     private BigDecimal total;
     private String Cufe;
     private String qr_code;

      public Factura() {
      }

      public Factura(int id_mantenimiento, int id_cliente, LocalDate fecha_emision, BigDecimal subtotal, BigDecimal impuestos, BigDecimal total, String Cufe, String qr_code) {
            this.id_mantenimiento = id_mantenimiento;
            this.id_cliente = id_cliente;
            this.fecha_emision = fecha_emision;
            this.subtotal = subtotal;
            this.impuestos = impuestos;
            this.total = total;
            this.Cufe = Cufe;
            this.qr_code = qr_code;
      }

      public int getId_mantenimiento() {
            return id_mantenimiento;
      }

      public void setId_mantenimiento(int id_factura) {
            this.id_mantenimiento = id_factura;
      }

      public int getId_cliente() {
            return id_cliente;
      }

      public void setId_cliente(int id_cliente) {
            this.id_cliente = id_cliente;
      }

      public LocalDate getFecha_emision() {
            return fecha_emision;
      }

      public void setFecha_emision(LocalDate fecha_emision) {
            this.fecha_emision = fecha_emision;
      }

      public BigDecimal getSubtotal() {
            return subtotal;
      }

      public void setSubtotal(BigDecimal subtotal) {
            this.subtotal = subtotal;
      }

      public BigDecimal getImpuestos() {
            return impuestos;
      }

      public void setImpuestos(BigDecimal impuestos) {
            this.impuestos = impuestos;
      }

      public BigDecimal getTotal() {
            return total;
      }

      public void setTotal(BigDecimal total) {
            this.total = total;
      }

      public String getCufe() {
            return Cufe;
      }

      public void setCufe(String Cufe) {
            this.Cufe = Cufe;
      }

      public String getQr_code() {
            return qr_code;
      }

      public void setQr_code(String qr_code) {
            this.qr_code = qr_code;
      }

      @Override
      public String toString() {
            return "Factura{" + "id_mantenimiento=" + id_mantenimiento + ", id_cliente=" + id_cliente + ", fecha_emision=" + fecha_emision + ", subtotal=" + subtotal + ", impuestos=" + impuestos + ", total=" + total + ", Cufe=" + Cufe + ", qr_code=" + qr_code + '}';
      }

      
     
     
}
