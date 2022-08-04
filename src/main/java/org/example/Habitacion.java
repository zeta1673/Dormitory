package org.example;

import java.util.ArrayList;

public class Habitacion {

    private boolean disponible;
    private int numero;
    private int[] tv;
    private int[] cama;
    private int[] bano;
    private int[] escritorio;
    private int[] silla;
    private String inquilino;
    private String informes;

    public Habitacion(boolean disponible, int numero, int[] tv, int[] cama, int[] bano, int[] escritorio, int[] silla, String inquilino, String informes) {
        this.disponible = disponible;
        this.numero = numero;
        this.tv = tv;
        this.cama = cama;
        this.bano = bano;
        this.escritorio = escritorio;
        this.silla = silla;
        this.inquilino = inquilino;
        this.informes = informes;
    }

    public boolean informe_entrega(boolean tv, boolean cama, boolean bano, boolean escritorio, boolean silla){
    return false;
    }

    public boolean informe_entrega(int[][] informe){
        int cantidad;
        int valor;
        int acumulado = 0;

        for (int i = 0, j =0; i < 2; i++){
            cantidad = informe[i][j];
            for (; j <= 5; j++){

            }
        }
    }
}
