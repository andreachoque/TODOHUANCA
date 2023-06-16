/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class NodoM {
    private int idMod;
    private String rangoMod;
    private NodoM sig;
    
    NodoM()
    {
        sig=null;
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int idMod) {
        this.idMod = idMod;
    }

    public String getRangoMod() {
        return rangoMod;
    }

    public void setRangoMod(String rangoMod) {
        this.rangoMod = rangoMod;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }
    
    
}
