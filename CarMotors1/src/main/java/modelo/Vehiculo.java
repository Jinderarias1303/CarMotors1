/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jinde
 */
public class Vehiculo {

     
      public enum Tipo_vehiculo{
            automovil,motocicleta,suv,camioneta
      }
      
      private String placa;
      private int id_dueño;
      private Tipo_vehiculo tipo_vehiculo;
      private String marca;
      private String modelo;

      public Vehiculo() {
      }

      public Vehiculo(String placa, int id_dueño, Tipo_vehiculo tipo_vehiculo, String marca, String modelo) {
            this.placa = placa;
            this.id_dueño = id_dueño;
            this.tipo_vehiculo = tipo_vehiculo;
            this.marca = marca;
            this.modelo = modelo;
      }

      public String getPlaca() {
            return placa;
      }

      public void setPlaca(String placa) {
            this.placa = placa;
      }

      public int getId_dueño() {
            return id_dueño;
      }

      public void setId_dueño(int id_dueño) {
            this.id_dueño = id_dueño;
      }

      public Tipo_vehiculo getTipo_vehiculo() {
            return tipo_vehiculo;
      }

      public void setTipo_vehiculo(Tipo_vehiculo tipo_vehiculo) {
            this.tipo_vehiculo = tipo_vehiculo;
      }

      public String getMarca() {
            return marca;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }

      public String getModelo() {
            return modelo;
      }

      public void setModelo(String modelo) {
            this.modelo = modelo;
      }

      @Override
      public String toString() {
            return "Vehiculo{" + "placa=" + placa + ", id_due\u00f1o=" + id_dueño + ", tipo_vehiculo=" + tipo_vehiculo + ", marca=" + marca + ", modelo=" + modelo + '}';
      }
      
      
}
