/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import dao.ClienteDAO;
import modelo.Cliente;

/**
 *
 * @author jinde
 */
public class ClienteController {
      private ClienteDAO clienteDAO;
      
      public ClienteController(){
            this.clienteDAO = new  ClienteDAO();
      }
      
      public boolean registrarCliente( String nroIdentidad, String nombre, String telefono, String correo){
            Cliente cliente = new Cliente();
            cliente.setNroIdentidad(nroIdentidad);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            
            return clienteDAO.insertar(cliente);
      }
}
