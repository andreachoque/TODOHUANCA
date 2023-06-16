/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class Juguete {
    private String nombre;
    private int edad,precio;
    
    Juguete(){}
    
    Juguete(String a, int b, int c)
    {
        nombre=a;
        edad=b;
        precio=c;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void leer()
    {
        //System.out.println("Nombre-Edad-Precio");
        nombre=Leer.dato();
        edad=Leer.datoInt();
        precio=Leer.datoInt();
    }
    
    public void mostrar()
    {
        System.out.println("<"+nombre+" "+edad+" "+precio+">");
    }
}
