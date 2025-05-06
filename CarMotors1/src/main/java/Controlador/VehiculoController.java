/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import dao.VehiculoDAO;
import modelo.Vehiculo;

/**
 *
 * @author jinde
 */
public class VehiculoController {
      private VehiculoDAO vehiculoDAO;
      
      public VehiculoController(){
            this.vehiculoDAO = new VehiculoDAO();
      }
      
      public boolean insertarVehiculo(String placa, int id_dueño, String tipo_vehiculo, String marca, String modelo){
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPlaca(placa);
            vehiculo.setId_dueño(id_dueño);
            vehiculo.setTipo_vehiculo(Vehiculo.Tipo_vehiculo.valueOf(tipo_vehiculo.toLowerCase()));
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            
            return vehiculoDAO.InsertarVehiculo(vehiculo);
      }
}
