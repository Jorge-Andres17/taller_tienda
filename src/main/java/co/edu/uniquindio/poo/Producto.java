package co.edu.uniquindio.poo;

public class Producto {
    public String nombreProducto;
    public String id;
    public String descripcion;

    /**
     * Metodo constructor de la clase producto
     * @param nombreProducto
     * @param id
     * @param descripcion
     */
    public Producto(String nombreProducto, String id, String descripcion){
        this.nombreProducto=nombreProducto;
        this.id=id;
        this.descripcion=descripcion;
    }

    /**
     * Metodo para obtener el nombre del producto
     * @return
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Metodo para modificar el nombre del producto
     * @param nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Metodo para obtener el id del producto
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo para modificar el id del producto
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el nombre del producto
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para modificar la descripcion del producto 
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", id=" + id + ", descripcion=" + descripcion + "]";
    }

    
    
}
