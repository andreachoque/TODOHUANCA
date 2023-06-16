/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package militasimple;

/**
 *
 * @author estudiante
 */
public class Proyecto {
    private int nProy;
    private String titulo;
    
    Proyecto(int a ,String b)
    {
        nProy=a;
        titulo=b;
    }

    public int getnProy() {
        return nProy;
    }

    public void setnProy(int nProy) {
        this.nProy = nProy;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void mostrar()
    {
        System.out.println("["+nProy+" "+titulo+"]");
                
    }
    
}
