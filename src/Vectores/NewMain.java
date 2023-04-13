/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vectores;
import javax.swing.JOptionPane;
/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 2;
        Vectores eo = new Vectores(n);
        eo.llenar();
        
        System.out.println(eo.genNumerosPrimos(5));
  
    }
    
}
