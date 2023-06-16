/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class NodoJ {

    private String nombre;
    private int edad;
    private int precio;
    private NodoJ izq, der;

    NodoJ() {
        izq = der = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPrecio() {
        return precio;
    }

    public NodoJ getIzq() {
        return izq;
    }

    public NodoJ getDer() {
        return der;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setIzq(NodoJ izq) {
        this.izq = izq;
    }

    public void setDer(NodoJ der) {
        this.der = der;
    }
}
