/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclases;

/**
 *
 * @author Carmen Huanca
 */
public class NodoD {
    private String nombre;
    private int nro;
    private NodoD ant,sig;
    
    NodoD()
    {
        ant=sig=null;
    }

   

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNro() {
		return nro;
	}



	public void setNro(int nro) {
		this.nro = nro;
	}



	public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
    
}
