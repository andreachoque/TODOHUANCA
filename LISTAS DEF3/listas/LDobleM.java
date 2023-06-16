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
public class LDobleM {
    private NodoM p;
    public LDobleM()
    {
        p=null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    public void adiFinal(Material mx){
        NodoM nuevo=new NodoM();
        nuevo.setM(mx);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoM r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void mostrar()
    {
        NodoM o=getP();
        while(o!=null)
        {
            o.getM().mostrar();
            o=o.getSig();
        }
    }
}
