/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Carmen Huanca
 */
public class NodoM {
    private Material m;
    private NodoM ant,sig;
    NodoM(){
        ant=sig=null;
    }

    public Material getM() {
        return m;
    }

    public void setM(Material m) {
        this.m = m;
    }

    public NodoM getAnt() {
        return ant;
    }

    public void setAnt(NodoM ant) {
        this.ant = ant;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }
    
    
}
