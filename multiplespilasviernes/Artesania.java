/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplespilasviernes;

/**
 *
 * @author Carmen Huanca
 */
public class Artesania {
    private String nom,mat;
    private int precio;
    
    Artesania(String a, String b, int c)
    {
        nom=a;
        mat=b;
        precio=c;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrar()
    {
        System.out.println(nom+" "+mat+" "+precio);
    }
    
}
