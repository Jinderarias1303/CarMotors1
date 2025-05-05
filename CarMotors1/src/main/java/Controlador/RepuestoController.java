import dao.RepuestoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import modelo.Repuesto;

public class RepuestoController {

    private final RepuestoDAO repuestoDAO;

    public RepuestoController(Connection conn) {
        this.repuestoDAO = new RepuestoDAO(conn);
    }

    public void crearRepuesto(String nombreRepuesto, String tipoStr, String marcaModelo,
                              int idProveedor, int stock, LocalDate fechaIngreso,
                              int vidaUtilMeses, String estadoStr) {

        try {
            Repuesto.TipoRepuesto tipo = Repuesto.TipoRepuesto.valueOf(tipoStr.toUpperCase());
            Repuesto.Estado estado = estadoStr != null
                    ? Repuesto.Estado.valueOf(estadoStr.toUpperCase())
                    : Repuesto.Estado.DISPONIBLE;

            Repuesto repuesto = new Repuesto(
                nombreRepuesto,
                tipo,
                marcaModelo,
                idProveedor,
                stock,
                fechaIngreso,
                vidaUtilMeses,
                estado
            );

            repuestoDAO.insertar(repuesto);
            System.out.println("✅ Repuesto insertado con éxito.");

        } catch (IllegalArgumentException e) {
            System.err.println("❌ Error de validación: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ Error al insertar en la base de datos: " + e.getMessage());
        }
    }
}
