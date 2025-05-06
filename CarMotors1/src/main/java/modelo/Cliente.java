package modelo;

public class Cliente {
   
    private String nroIdentidad;
    private String nombre;
    private String telefono;
    private String correo;

    // Constructor vacío
    public Cliente() {}

    // Constructor completo
    public Cliente( String nroIdentidad, String nombre, String telefono, String correo) {
       
        this.nroIdentidad = nroIdentidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y setters
    public String getNroIdentidad() { return nroIdentidad; }
    public void setNroIdentidad(String nroIdentidad) { this.nroIdentidad = nroIdentidad; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

      @Override
      public String toString() {
            return "Cliente{" +  " nroIdentidad=" + nroIdentidad + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + '}';
      }
    
    
}
