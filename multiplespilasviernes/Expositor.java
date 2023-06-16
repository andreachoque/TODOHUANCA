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
public class Expositor {
    private int ci;
    private String nom,pat,mat;
    Expositor(int a, String b, String c, String d)
    {
        ci=a;
        nom=b;
        pat=c;
        mat=d;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }
    public void mostrar()
    {
        System.out.println("<"+ci+" "+nom+" "+pat+" "+mat+">");
    }
}
