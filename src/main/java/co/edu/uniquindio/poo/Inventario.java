package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Inventario {
    public String nombreInven;
    public String codigo;
    public int stockDisponible;
    public Categoria categoria;
    public Collection<Producto> productos;

    /**
     * Metodo constructor del inventario
     * @param nombreInven
     * @param codigo
     * @param stockDisponible
     * @param listaProductos
     */
    public Inventario(String nombreInven, String codigo, int stockDisponible, Categoria categoria) {
        this.nombreInven = nombreInven;
        this.codigo = codigo;
        this.stockDisponible = stockDisponible;
        this.categoria=categoria;
        productos = new LinkedList<>();
    }

    /**
     * Metodo obtener nombre del inventario
     * @return
     */
    public String getNombreInven() {
        return nombreInven;
    }

    /**
     * Metodo para modificar el nombre del inventario
     * @param nombreInven
     */
    public void setNombreInven(String nombreInven) {
        this.nombreInven = nombreInven;
    }

    /**
     * Metodo para obtener el codigo de identificacion del inventario
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para modificar el codigo del inventario
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el Stock disponible del inventario
     * @return
     */
    public int getStockDisponible() {
        return stockDisponible;
    }

    /**
     *  Metodo para modificar el Stock disponible del inventario
     * @param stockDisponible
     */
    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    /**
     * Metodo para obtener la categoria del inventario del inventario
     * @return
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Metodo para Verificar que los productos existan 
     * @param id
     * @return
     */
    public boolean verficarProducto(String id) {
        boolean centinela = false;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un producto al inventario
     * @param producto
     */
    public void agregarProducto(Producto producto) {
        if (!verficarProducto(producto.getId())) {
            productos.add(producto);
        }
    }

    /**
     * Metodo para eliminar un producto del inventario
     * @param id
     */
    public void eliminarProducto(String id) {
        for (Producto producto : productos) {   
            if (producto.getId().equals(id)) {
                productos.remove(producto);
            }
        }
    }

    public void venderProducto(Inventario inventario,String id){
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                if (inventario.getStockDisponible()>0) {
                    inventario.setStockDisponible(inventario.getStockDisponible() - 1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Inventario [nombreInven=" + nombreInven + ", codigo=" + codigo + ", stockDisponible=" + stockDisponible
                + ", categoria=" + categoria + ", productos=" + productos + "]";
    }

    
}
