/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedcirculares;

/**
 *
 * @author Carmen Huanca
 */
public class Tema {
    private String idTema,nombre;
    
    Tema(String a, String b){
        idTema=a;
        nombre=b;
    }

    public String getIdTema() {
        return idTema;
    }

    public void setIdTema(String idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar()
    {
        System.out.println(idTema+" "+nombre);
    }
    
}
