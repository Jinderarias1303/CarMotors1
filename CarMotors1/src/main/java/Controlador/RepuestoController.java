package controlador;

import modelo.Repuesto;
import dao.RepuestoDAO;
import java.time.LocalDate;


public class RepuestoController {
    private RepuestoDAO repuestoDAO;
    
    public RepuestoController(){
         this.repuestoDAO = new RepuestoDAO(); 
    }
    
    public boolean registrarRepuesto(String nombre_repuesto, String tipo_repuesto, String marca_modelo, int id_proveedor, int stock, LocalDate fecha_ingreso, int vida_util_meses, String estado){
          Repuesto repuesto =  new Repuesto();
          repuesto.setNombre_repuesto(nombre_repuesto);
          repuesto.setTipo_repuesto(Repuesto.TipoRepuesto.valueOf(tipo_repuesto.toLowerCase()));
          repuesto.setMarca_modelo(marca_modelo);
          repuesto.setId_proveedor(id_proveedor);
          repuesto.setStock(stock);
          repuesto.setFecha_ingreso(LocalDate.EPOCH);
          repuesto.setVida_util_meses(vida_util_meses);
          repuesto.setEstado(Repuesto.Estado.valueOf(estado.toLowerCase()));
          
          return repuestoDAO.insertarRepuesto(repuesto);
    }
}
