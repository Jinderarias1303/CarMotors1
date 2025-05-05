/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author jinde
 */
public class Repuesto {
    public enum TipoRepuesto {
        MECANICO, ELECTRICO, CARROCERIA, CONSUMO
    }

    public enum Estado {
        DISPONIBLE, RESERVADO, FUERA_SERVICIO
    }

    private int idRepuesto;
    private String nombreRepuesto;
    private TipoRepuesto tipoRepuesto;
    private String marcaModelo;
    private int idProveedor;
    private int stock;
    private LocalDate fechaIngreso;
    private int vidaUtilMeses;
    private Estado estado = Estado.DISPONIBLE;

    public Repuesto(String nombreRepuesto, TipoRepuesto tipoRepuesto, String marcaModelo,
                    int idProveedor, int stock, LocalDate fechaIngreso, int vidaUtilMeses, Estado estado) {

        if (nombreRepuesto == null || nombreRepuesto.length() > 50)
            throw new IllegalArgumentException("Nombre del repuesto inválido");

        if (marcaModelo == null || marcaModelo.length() > 65)
            throw new IllegalArgumentException("Marca/Modelo inválido");

        if (stock < 0)
            throw new IllegalArgumentException("Stock no puede ser negativo");

        if (fechaIngreso == null)
            throw new IllegalArgumentException("Fecha de ingreso no puede ser nula");

        if (vidaUtilMeses <= 0)
            throw new IllegalArgumentException("Vida útil debe ser mayor a 0");

        this.nombreRepuesto = nombreRepuesto;
        this.tipoRepuesto = tipoRepuesto;
        this.marcaModelo = marcaModelo;
        this.idProveedor = idProveedor;
        this.stock = stock;
        this.fechaIngreso = fechaIngreso;
        this.vidaUtilMeses = vidaUtilMeses;
        this.estado = estado != null ? estado : Estado.DISPONIBLE;
    }

    // Getters y setters (si los necesitás)

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public TipoRepuesto getTipoRepuesto() {
        return tipoRepuesto;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public int getVidaUtilMeses() {
        return vidaUtilMeses;
    }

    public Estado getEstado() {
        return estado;
    }
}
