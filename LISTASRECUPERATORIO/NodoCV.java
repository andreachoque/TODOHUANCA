/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class NodoCV {
    private int idClase;
    private String claseV;
    private NodoCV sig;
    NodoCV()
    {
        sig=null;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getClaseV() {
        return claseV;
    }

    public void setClaseV(String claseV) {
        this.claseV = claseV;
    }

    public NodoCV getSig() {
        return sig;
    }

    public void setSig(NodoCV sig) {
        this.sig = sig;
    }
    
}
