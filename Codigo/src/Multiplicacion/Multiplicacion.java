package Multiplicacion;

import javax.swing.*;
public class Multiplicacion 
{

    private int matrizA[][];
    private int matrizB[][];
    private int filaA;
    private int filaB;
    private int columnaA;
    private int columnaB;
    private int datosA;
    private int datosB;

    public Multiplicacion() {

        filaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas para la matriz A"));
        columnaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas para matriz A"));
        this.matrizA = new int[filaA][columnaA];
        filaB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas para la matriz B"));
        columnaB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas para matriz B"));
        this.matrizB = new int[filaB][columnaB];
    }
    public void AddMatrizA() {

        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaA; j++) {
                this.datosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores para la matriz A"));
                this.matrizA[i][j] = this.datosA;
            }
        }
    }
    public void VerMatrizA() {

        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaA; j++) {
                System.out.printf("%d ", matrizA[i][j]);
            }
            System.out.println();
        }
    }
    public void AddMatrizB() {

        for (int i = 0; i < filaB; i++) {
            for (int j = 0; j < columnaB; j++) {
                this.datosB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores para la matriz B"));
                this.matrizB[i][j] = this.datosB;
            }
        }
    }
    public void VerMatrizB() {

        for (int i = 0; i < filaB; i++) {
            for (int j = 0; j < columnaB; j++) {
                System.out.printf("%d ", matrizB[i][j]);
            }
            System.out.println();
        }
    }
    public void multiplicacionmatri() {

        int multi[][] = new int[filaA][columnaB];
        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaB; j++) {
                for (int k = 0; k < columnaA; k++) {
                    multi[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.printf("%d ", multi[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Multiplicacion multiplicacion = new Multiplicacion();
        if (multiplicacion.columnaA == multiplicacion.filaB) {
            multiplicacion.AddMatrizA();
            System.out.println("Matriz A");
            multiplicacion.VerMatrizA();
            System.out.println();
            multiplicacion.AddMatrizB();
            System.out.println("Matriz B");
            multiplicacion.VerMatrizB();
            System.out.println();
            System.out.println("Matriz A x Matriz B");

            multiplicacion.multiplicacionmatri();
        } else 
        {
            JOptionPane.showMessageDialog(null, "Tienen que ser matrices cuadradas");
        }
    }
}