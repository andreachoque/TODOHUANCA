/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class NodoP {
    private int idClase,idMod,anio,cantidad;
    private NodoP ant,sig;
    
    NodoP()
    {
        ant=sig=null;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int idMod) {
        this.idMod = idMod;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
    
}
