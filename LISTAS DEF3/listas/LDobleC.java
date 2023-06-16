/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblem;

/**
 *
 * @author Carmen Huanca
 */
public class LDobleC {
    private NodoC p;
    LDobleC()
    {
        p=null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
    public void adiFinal(String a, String b, int c, int d){
        NodoC nue=new NodoC();
        nue.setIdMaterial(a);
        nue.setDpto(b);
        nue.setAnio(c);
        nue.setCant(d);
        
        if(getP()==null)
            setP(nue);
        else {
            NodoC r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar()
    {
        NodoC o=getP();
        while(o!=null)
        {
            System.out.println(o.getIdMaterial()+" "+o.getDpto()+" "+o.getAnio()+" "+o.getCant());
            o=o.getSig();
        }
    }
    
}
