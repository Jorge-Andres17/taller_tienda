package co.edu.uniquindio.poo;

public class Proveedor {
    private String nombre;
    private String id;
    private String direccion;
    private String telefono;

    /**
     * Metodo constructor de la clase proveedor
     * @param nombre
     * @param id
     * @param direccion
     * @param telefono
     */
    public Proveedor(String nombre, String id, String direccion, String telefono){
        this.nombre=nombre;
        this.id=id;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    /**
     * Metodo para obtener el nombre del proveedor
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre del proveedor
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el id del proveedor
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo para modificar el id del proveedor
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo para obtener la direccion del proveedor
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para modificar la direccion del proveedor
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para obtener el numero de contacto del proveedor
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para modificar el numero de contacto del proveerdor
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor [nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", telefono=" + telefono
                + "]";
    }

    
}
