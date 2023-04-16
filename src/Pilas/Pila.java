/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alvin
 */
public class Pila {
    
    public int MAX;
    public int P[];
    public int tope;
    Random rand = new Random();

    public Pila(int n) {
        MAX = n;
        P = new int[MAX];
        tope = 0;
    }
    
    public boolean vacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean lleno() {
        if (tope == MAX) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void adiciona(int e) {
        if (!lleno()) {
            P[tope] = e;
            tope++;
        } else {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }
    
    public int elimina() {
        int e = -1;
        if (!vacio()) {
            tope--;
            e = P[tope];
        } else {
            JOptionPane.showMessageDialog(null, "pila Vacia");
        }
        return e;
    }
    
    public String listar() {
        String s = "";
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            s = s + "  " + e;
        }
        restaura(PA);
        return s;
    }
    
    public void restaura(Pila PA) {
        int e;
        while (!PA.vacio()) {
            e = PA.elimina();
            adiciona(e);
        }
    }
    
    public void eliminarFondo() {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
        }
        PA.elimina();
        restaura(PA);
    }
    
    public String elemCent() {
        String b = "";
        int e;
        Pila PA;
        if (!vacio()) {
            if (MAX % 2 == 0) {
                int a = MAX / 2;
                PA = new Pila(a + 1);
                for (int i = a; i >= 0; i--) {
                    e = elimina();
                    PA.adiciona(e);
                    if (i == 1 || i == 0) {
                        b = b + " " + e;
                    }
                }
                while (!PA.vacio()) {
                    e = PA.elimina();
                    adiciona(e);
                }
                
            } else {
                int a = (MAX + 1) / 2;
                PA = new Pila(a);
                for (int i = a; i > 0; i--) {
                    e = elimina();
                    PA.adiciona(e);
                    if (i == 1) {
                        b = b + " " + e;
                    }
                }
                while (!PA.vacio()) {
                    e = PA.elimina();
                    adiciona(e);
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "pila vacia");
        }
        return b;
    }
    
    public int sumarUltimoPrimero() {
        String s = "";
        int primero = 0;
        int ultimo = 0;
        Pila PA = new Pila(MAX);
        primero = elimina();
        while (!vacio()) {
            PA.adiciona(elimina());
        }
        ultimo = PA.elimina();
        adiciona(primero);
        while (!PA.vacio()) {
            adiciona(PA.elimina());
        }
        adiciona(ultimo);
        
        return primero + ultimo;
    }
    
    public void invertirPila() {
        Pila PA = new Pila(MAX);
        Pila PA1 = new Pila(MAX);
        while (!vacio()) {
            PA.adiciona(elimina());
        }
        PA1.restaura(PA);
        restaura(PA1);
    }
    
    public void eliminaX(int x) {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (e != x) {
                PA.adiciona(e);
            }
            
        }
        restaura(PA);
    }
    
    public void eliminaRep() {
        int x;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            x = elimina();
            PA.adiciona(x);
            eliminaX(x);
        }
        restaura(PA);
    }

    //  Mostrar el elemento menor y mayor de la pila
    public int elementMayor(Pila p) {
        int mayor = 0;
        int e = 0;
        while (!p.vacio()) {
            e = p.elimina();
            if (e > mayor) {
                mayor = e;
            }
        }
        return mayor;
    }
    
    public int elementMenor(Pila p) {
        int menor = elimina();
        adiciona(menor);
        int e = 0;
        
        while (!p.vacio()) {
            e = p.elimina();
            
            if (e < menor) {
                menor = e;
            }
        }
        return menor;
    }
    
    public String mostrarElemtoMinMax() {
        String s = "";
        int e;
        Pila PA = new Pila(MAX);
        Pila PB = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            PB.adiciona(e);
        }
        restaura(PA);
        return "El elemtor mayor es: " + elementMayor(PB) + "\n Elemento menor es: " + elementMenor(PB);
    }
    
    //En una pila, generar n elementos enteros en forma aleatoria(random) e imprimir la pila.

    public Pila generarPila(Pila p){
        
        for (int i = 0; i < p.MAX; i++) {
            int num2 = rand.nextInt(50) + 1; //genera un número aleatorio entre 1 y 10
            p.adiciona(num2);
        }
        return p;
    }
    public void eliminaNum(int num) {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (e != num) {
                PA.adiciona(e);
            } else {
                break;
            }
        }
        restaura(PA);
    }
       public int BusMay(){
             int s= 0;
             int e;
             Pila PA = new Pila(MAX);
             if(!vacio()){
               while(!vacio()){
                    e=elimina();
                    PA.adiciona(e);
                    if(s<e){
                        s=e;
                    }
                } 
                 restaura(PA);
             }
             
            return s; 
    }
    
    public int BusMen(){
             int s= 0;
             int e;
             Pila PA = new Pila(MAX);
             if(!vacio()){
               while(!vacio()){
                    e=elimina();
                    PA.adiciona(e);
                    if(s>e){
                        s=e;
                    }
                } 
                 restaura(PA);

             }
             
            return s; 
    }
    
    public void ordenarAscendente(){
            int n;
            Pila PA=new Pila(MAX);
            while(!vacio()){
                    n = BusMay();
                    PA.adiciona(n);
                    eliminaNum(n);
            }
            restaura(PA);
      }
    
    public void ordenarDescendente(){
            int n;
            Pila PA=new Pila(MAX);
            while(!vacio()){
                    n = BusMen();
                    PA.adiciona(n);
                    eliminaNum(n);
            }
            restaura(PA);
      }
    
}
