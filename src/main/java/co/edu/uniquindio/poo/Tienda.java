package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Tienda {
    public String nombre;
    public Categoria categoria;
    public Collection<Inventario> inventarios;

    public Tienda(String nombre, Categoria categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        inventarios = new LinkedList<>();
    }

    public void crearInventario(Categoria categoriaInvetario){
        if (categoriaInvetario == this.categoria) {
            Inventario inventario = new Inventario(nombre, nombre, 0, categoriaInvetario);
            inventarios.add(inventario);
        }
    }

    public void agregarProductoInventario(Categoria categoriaInventario, Producto producto ){
        for (Inventario inventario : inventarios) {
            if (inventario.getCategoria()==categoriaInventario) {
                inventario.agregarProducto(producto);
            }
        }
    }

    public void eliminarInventario(String id){
        for (Inventario inventario : inventarios) { 
            if (inventario.getCodigo().equals(id)) {
                inventarios.remove(inventario);
                break;
            }
        }
    }
}
