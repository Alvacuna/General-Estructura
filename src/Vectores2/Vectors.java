
package Vectores2;

import javax.swing.JOptionPane;

/**
 *
 * @author alvin
 */
public class Vectors {

    Libros vec[];
    int nroLibros;

    public Vectors(int n) {
        this.nroLibros = 0;
        vec = new Libros[n];
    }

    public void adicionar(Libros lib) {

        if (nroLibros < vec.length) {
            vec[nroLibros] = lib;
            nroLibros++;
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta llena");
        }

    }

    public void eliminarLibro(int id) {
        for (int i = 0; i < nroLibros; i++) {
            if (vec[i].getId() == id) {
                
                vec[i] = vec[nroLibros - 1];
                vec[nroLibros - 1] = null;
                nroLibros--;
                break;
            }
        }
    }
    public void modificarLibro(int id, String titulo, String autor, String editorial, int nro_ejemplar, int isbn, double precio, int año_pub) {
        for (int i = 0; i < nroLibros; i++) {
            if (vec[i].getId() == id) {
                vec[i].setTitulo(titulo);
                vec[i].setAutor(autor);
                vec[i].setEditorial(editorial);
                vec[i].setNro_ejemplar(nro_ejemplar);
                vec[i].setIsbn(isbn);
                vec[i].setPrecio(precio);
                vec[i].setAño_pub(año_pub);
                break;
            }
        }
    }
    public Libros[] buscarLibrosAutor(String nombre){
        Libros[] resultado = new Libros[nroLibros];
        int contador = 0;
        for (int i = 0; i < nroLibros; i++) {
            if (vec[i].getAutor().equals(nombre)) {
                resultado[contador] = vec[i];
                contador++;
            }
        }
        return resultado;
    }
    public String listarLibros() {
        String s = " ";
        for (int i = 0; i < nroLibros; i++) {
            s += vec[i].getTitulo() + " ";
        }
        return s;
    }
}
