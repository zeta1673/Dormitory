package org.example;

import java.util.Date;
import java.util.Scanner;

public class Administrador extends Usuario {

    Scanner teclado = new Scanner(System.in);

    public Administrador(String nombre, int identificacion, String password, String tipo) {
        super(nombre, identificacion, password, tipo);
    }
}
