/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jinde
 */
public class Proveedor {
      private int id_proveedor;
      private String nombre_proveedor;
      private Long telefono;
      private int frecuencia_suministro;
// constructor vacio
      public Proveedor() {
      }
// constructor completo
      public Proveedor(int id_proveedor, String nombre_proveedor, Long telefono, int frecuencia_suminstro) {
            this.id_proveedor = id_proveedor;
            this.nombre_proveedor = nombre_proveedor;
            this.telefono = telefono;
            this.frecuencia_suministro = frecuencia_suminstro;
      }
      
// metodos getter and setter

      public int getId_proveedor() {
            return id_proveedor;
      }

      public void setId_proveedor(int id_proveedor) {
            this.id_proveedor = id_proveedor;
      }

      public String getNombre_proveedor() {
            return nombre_proveedor;
      }

      public void setNombre_proveedor(String nombre_proveedor) {
            this.nombre_proveedor = nombre_proveedor;
      }

      public Long getTelefono() {
            return telefono;
      }

      public void setTelefono(Long telefono) {
            this.telefono = telefono;
      }

      public int getFrecuencia_suministro() {
            return frecuencia_suministro;
      }

      public void setFrecuencia_suministro(int frecuencia_suminstro) {
            this.frecuencia_suministro = frecuencia_suminstro;
      }

      @Override
      public String toString() {
            return "Proveedor{" + "id_proveedor=" + id_proveedor
                           + ", nombre_proveedor=" + nombre_proveedor 
                           + ", telefono=" + telefono 
                           + ", frecuencia_suminstro=" + frecuencia_suministro + '}';
      }

   
      
      
}
