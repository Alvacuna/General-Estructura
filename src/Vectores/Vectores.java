/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author alvin
 */
public class Vectores {

    int Vec[];
    int tamVec;

    public Vectores(int n) {
        this.tamVec = n;
        Vec = new int[tamVec];
    }

    public void llenar() {
        int e;
        for (int i = 0; i < Vec.length; i++) {
            e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero", ""));
            Vec[i] = e;
        }
    }

    public String mostrar() {
        String s = "";
        for (int i = 0; i < Vec.length; i++) {
            s = s + " " + Vec[i];
        }
        return s;
    }

    public boolean esPrimo(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public int sumaNumerosPrimos() {
        int sumPrim = 0;
        for (int i = 0; i < Vec.length; i++) {
            if (esPrimo(Vec[i])) {
                sumPrim += Vec[i];
            }
        }
        return sumPrim;
    }

    public void intercambiarMinMax() {
        int indiceMin = 0;
        int indiceMax = 0;

        for (int i = 1; i < Vec.length; i++) {
            if (Vec[i] < Vec[indiceMin]) {
                indiceMin = i;
            }
            if (Vec[i] > Vec[indiceMax]) {
                indiceMax = i;
            }
        }

        int temp = Vec[indiceMin];
        Vec[indiceMin] = Vec[indiceMax];
        Vec[indiceMax] = temp;
    }
    public boolean isPerfecto(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum+=i;
            }
        }
        return sum == number;
    }
    public int sumaNumerosPerfectos() {
        int sumPerfect = 0;
        for (int i = 0; i < Vec.length; i++) {
            if (isPerfecto(Vec[i])) {
                sumPerfect += Vec[i];
            }
        }
        return sumPerfect;
    }
    public String genNumerosPrimos(int n){
        String sucecion = "";
        for (int i = 1; i <= n; i++) {
            if (esPrimo(i)) {
                sucecion += i + " ";
            }
        }
        return sucecion;
    }
}
