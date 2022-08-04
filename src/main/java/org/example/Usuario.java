package org.example;

import java.util.Date;

public class Usuario {

    private String nombre;
    private int identificacion = 0;
    private String password;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public Usuario(String nombre, int identificacion, String password, String tipo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.password = password;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean actualizar_clave(String a, String b) {
        if (a.equals(this.password)) {
            this.password = b;
            System.out.println("Clave cambiado correctamente");
            return true;
        } else {
            System.out.println("clave actual incorrecta");
            return false;
        }
    }
}
