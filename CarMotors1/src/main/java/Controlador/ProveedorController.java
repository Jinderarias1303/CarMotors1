package controlador;

import modelo.Proveedor;
import dao.ProveedorDAO;

public class ProveedorController {
    private ProveedorDAO proveedorDAO;

    public ProveedorController() {
        this.proveedorDAO = new ProveedorDAO();
    }

    public boolean registrarProveedor(String nombre, Long telefono, int frecuencia) {
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre_proveedor(nombre);
        proveedor.setTelefono(telefono);
        proveedor.setFrecuencia_suministro(frecuencia);

        return proveedorDAO.insertarProveedor(proveedor);
    }
}
