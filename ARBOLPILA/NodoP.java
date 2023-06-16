/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class NodoP {
    private String nom,zona;
    private NodoP izq,der;

    public NodoP() {
        izq=der=null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public NodoP getIzq() {
        return izq;
    }

    public void setIzq(NodoP izq) {
        this.izq = izq;
    }

    public NodoP getDer() {
        return der;
    }

    public void setDer(NodoP der) {
        this.der = der;
    }
    
    
}
