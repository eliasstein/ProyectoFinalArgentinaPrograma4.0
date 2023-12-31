package proyectofinal.clases;

public class Lector {
    private int nmroSocio;
    private String nombre;
    private Long dni;
    private String domicilio;
    private Long telefono;
    private boolean estado;

    public Lector(int nmroSocio, String nombre, Long dni, String domicilio, Long telefono, boolean estado) {
        this.nmroSocio = nmroSocio;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    
    public Lector(String nombre, Long dni, String domicilio, Long telefono, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = activo;
    }

    public Lector() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNmroSocio() {
        return nmroSocio;
    }

    public void setNmroSocio(int nmroSocio) {
        this.nmroSocio = nmroSocio;
    }
   
    @Override
    public String toString() {
        return "DNI: "+dni+"-"+nombre;
    }
    
    
    
    
}
