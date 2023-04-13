/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList_1;

/**
 *
 * @author alvin
 */
public class Producto {
    //(id,descripcion,marca,procedencia,cantidad,precio,stockmax,stockmin)
    int id;
    String descripcion;
    String marca;
    String procedencia;
    int cantidad; 
    double precio;
    int stockMax;
    int stockMin;

    public Producto(int id, String descripcion, String marca, String procedencia, int cantidad, double precio, int stockMax, int stockMin) {
        this.id = id;
        this.descripcion = descripcion;
        this.marca = marca;
        this.procedencia = procedencia;
        this.cantidad = cantidad;
        this.precio = precio;
        this.stockMax = stockMax;
        this.stockMin = stockMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
    
}
