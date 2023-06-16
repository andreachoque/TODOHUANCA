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
public class LDobleCD {
    private NodoD p;
    LDobleCD(){
        p=null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }
    void adifinal (String a, int b)
    {
        NodoD nue = new NodoD ();
        nue.setNombre(a);
        nue.setNro(b);
        if (getP()==null)
        {
            setP(nue);
            nue.setSig(nue); //getP().setSig(getP());
            nue.setAnt(nue);
        }
        else
        {
            NodoD r=getP().getAnt();
            r.setSig(nue);
            nue.setAnt(r);
            nue.setSig(getP());
            getP().setAnt(nue);
            
        }
    }
    void mostrar()
    {
        NodoD r = getP();
	while (r.getSig() != getP()){
            System.out.println(r.getNombre()+" "+r.getNro());
            r = r.getSig();
        }
        System.out.println(r.getNombre()+" "+r.getNro());
    }
    
}
