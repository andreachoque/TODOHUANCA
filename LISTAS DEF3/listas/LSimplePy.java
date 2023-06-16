/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package militasimple;

/**
 *
 * @author estudiante
 */
public class LSimplePy {
    private NodoPy p;
    
    LSimplePy()
    {
        p=null;
    }

    public NodoPy getP() {
        return p;
    }

    public void setP(NodoPy p) {
        this.p = p;
    }
    public void adifinal(Proyecto px)
    {
        NodoPy nue=new NodoPy();
        nue.setA(px);
        if(getP()==null)
            setP(nue);
        else{
            NodoPy m=getP();
            while(m.getSig()!=null)//recorre al ultimo nodo
                m=m.getSig();
            m.setSig(nue);
        }
            
    }
    public void mostrar()
    {
        NodoPy d=getP();
        while(d!=null)//recorre hasta el final
        {
            d.getA().mostrar();
            d=d.getSig();
        }
    }
    
}
