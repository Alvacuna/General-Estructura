/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores2;

/**
 *
 * @author alvin
 */
public class Libros {

    // (id,titulo,autor,editorial,nro_ejemplar,isbn,precio,año_pub)
    int id;
    String titulo;
    String autor;
    String editorial;
    int nro_ejemplar;
    int isbn;
    double precio;
    int año_pub;

    public Libros(int id, String titulo, String autor, String editorial, int nro_ejemplar, int isbn, double precio, int año_pub) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nro_ejemplar = nro_ejemplar;
        this.isbn = isbn;
        this.precio = precio;
        this.año_pub = año_pub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNro_ejemplar() {
        return nro_ejemplar;
    }

    public void setNro_ejemplar(int nro_ejemplar) {
        this.nro_ejemplar = nro_ejemplar;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño_pub() {
        return año_pub;
    }

    public void setAño_pub(int año_pub) {
        this.año_pub = año_pub;
    }

}
