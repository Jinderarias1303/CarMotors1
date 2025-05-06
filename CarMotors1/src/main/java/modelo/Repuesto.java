package modelo;

import java.time.LocalDate;

public class Repuesto {
    public enum TipoRepuesto {
        mecanico, electrico, carroceria, consumo
    }

    public enum Estado {
        disponible, reservado, fuera_servicio
    }

    private String nombre_repuesto;
    private TipoRepuesto tipo_repuesto;
    private String marca_modelo;
    private int id_proveedor;
    private int stock;
    private LocalDate fecha_ingreso;
    private int vida_util_meses;
    private Estado estado;

    public Repuesto() {
    }

    public Repuesto(String nombre_repuesto, TipoRepuesto tipo_repuesto, String marca_modelo, int id_proveedor, int stock, LocalDate fecha_ingreso, int vida_util_meses, Estado estado) {
        this.nombre_repuesto = nombre_repuesto;
        this.tipo_repuesto = tipo_repuesto;
        this.marca_modelo = marca_modelo;
        this.id_proveedor = id_proveedor;
        this.stock = stock;
        this.fecha_ingreso = fecha_ingreso;
        this.vida_util_meses = vida_util_meses;
        this.estado = estado;
    }

    public String getNombre_repuesto() {
        return nombre_repuesto;
    }

    public void setNombre_repuesto(String nombre_repuesto) {
        this.nombre_repuesto = nombre_repuesto;
    }

    public TipoRepuesto getTipo_repuesto() {
        return tipo_repuesto;
    }

    public void setTipo_repuesto(TipoRepuesto tipo_repuesto) {
        this.tipo_repuesto = tipo_repuesto;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getVida_util_meses() {
        return vida_util_meses;
    }

    public void setVida_util_meses(int vida_util_meses) {
        this.vida_util_meses = vida_util_meses;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre_repuesto='" + nombre_repuesto + '\'' +
                ", tipo_repuesto=" + tipo_repuesto +
                ", marca_modelo='" + marca_modelo + '\'' +
                ", id_proveedor=" + id_proveedor +
                ", stock=" + stock +
                ", fecha_ingreso=" + fecha_ingreso +
                ", vida_util_meses=" + vida_util_meses +
                ", estado=" + estado +
                '}';
    }
}
