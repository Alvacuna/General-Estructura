/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alvin
 */
public class Productos {

    private ArrayList<Producto> listaProductos;

    public Productos() {
        listaProductos = new ArrayList<Producto>();
    }

    public void adicionarProductor(Producto p) {
        listaProductos.add(p);
    }

    public void eliminarProducto(int id) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getId() == id) {
                listaProductos.remove(i);
                break;
            }
        }
    }

    public void modificarProducto(int id, String descripcion, String marca, String procedencia, int cantidad, double precio, int stockMax, int stockMin) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getId() == id) {
                p.setDescripcion(descripcion);
                p.setMarca(marca);
                p.setProcedencia(procedencia);
                p.setCantidad(cantidad);
                p.setPrecio(precio);
                p.setStockMax(stockMax);
                p.setStockMin(stockMin);
                break;
            }
        }

    }

    public String listarProductos() {
        String s = "";
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            s += "ID: " + p.getId() + "\n";
            s += "Descripcion: " + p.getDescripcion() + "\n";
            s += "Marca: " + p.getMarca() + "\n";
            s += "Procedencia: " + p.getProcedencia() + "\n";
            s += "Cantidad: " + p.getCantidad() + "\n";
            s += "Precio: " + p.getPrecio() + "\n";
            s += "Stock Maximo: " + p.getStockMax() + "\n";
            s += "Stock Minimo: " + p.getStockMin() + "\n";
            s += "\n";
        }
        return s;
    }

    public ArrayList<Producto> buscarProductos(String descripcion) {
        ArrayList<Producto> resultado = new ArrayList<Producto>();
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getDescripcion().equalsIgnoreCase(descripcion)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void ordenarProductosPorPrecio() {
        Collections.sort(listaProductos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                if (p1.getPrecio() < p2.getPrecio()) {
                    return -1;
                } else if (p1.getPrecio() > p2.getPrecio()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
