package Suma;

import javax.swing.*;
public class Suma {

    private int matrizA[][];
    private int matrizB[][];
    private int fin[][];
    private int filaA;
    private int filaB;
    private int columnaA;
    private int columnaB;
    private int datosA;
    private int datosB;

    public Suma(){

        filaA = Integer.parseInt(JOptionPane.showInputDialog("Filas para Matriz A"));
        columnaA = Integer.parseInt(JOptionPane.showInputDialog("Columnas para Matriz A"));
        this.matrizA = new int[filaA][columnaA];
        filaB = Integer.parseInt(JOptionPane.showInputDialog("Filas para Matriz B"));
        columnaB = Integer.parseInt(JOptionPane.showInputDialog("Columnas para Matriz B"));
        this.matrizB = new int[filaB][columnaB];

    }
    public void AddMatrizA() {

        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaA; j++) {
                this.datosA = Integer.parseInt(JOptionPane.showInputDialog("Valores para Matriz A"));
                this.matrizA[i][j] = this.datosA;
            }
        }
    }
    public void VerMatrizA() {

        for (int i = 0; i < filaA ; i++) {
            for (int j = 0; j < columnaA; j++) {
                System.out.printf("%d ", this.matrizA[i][j]);
            }
            System.out.println();
        }
    }
    public void AddMatrizB() {

        for (int i = 0; i < filaB ; i++) {
            for (int j = 0; j < columnaB; j++) {
                this.datosB = Integer.parseInt(JOptionPane.showInputDialog("Valores para Matriz B"));
                this.matrizB[i][j] = this.datosB;
            }
        }
    }

    public void VerMatrizB() {

        for (int i = 0; i < filaB ; i++) {
            for (int j = 0; j < columnaB; j++) {
                System.out.printf("%d ", this.matrizB[i][j]);
            }
            System.out.println();
        }
    }
    public void sumaMatriz(){

        this.fin = new int[filaA][columnaA];
        for ( int i = 0; i < filaA; i++){
            for ( int j = 0; j < columnaB; j++){
                fin[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("%d ", this.fin[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Suma suma = new Suma();

        if(suma.filaA == suma.filaB || suma.columnaA == suma.columnaB) {
            suma.AddMatrizA();
            System.out.println("Matriz A");
            suma.VerMatrizA();
            System.out.println();
            suma.AddMatrizB();
            System.out.println("Matriz B");
            suma.VerMatrizB();
            System.out.println();
            System.out.println("Matriz A + Matriz B");
            suma.sumaMatriz();
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Tiene que tener almenos el numero de columnas o filas igual ");
        }
    }
}