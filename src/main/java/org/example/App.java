package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ){

        Scanner teclado = new Scanner(System.in);

        Usuario uno = new Usuario("jaime", 123, "pepe123", "administrador");

        String password_actual = teclado.nextLine();
        String password_nueva = teclado.nextLine();

        uno.actualizar_clave(password_actual, password_nueva);
    }
}
