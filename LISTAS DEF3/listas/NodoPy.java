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
public class NodoPy {
    private Proyecto a;
    private NodoPy sig;
    
    NodoPy()
    {
        sig=null;
    }

    public Proyecto getA() {
        return a;
    }

    public void setA(Proyecto a) {
        this.a = a;
    }

    public NodoPy getSig() {
        return sig;
    }

    public void setSig(NodoPy sig) {
        this.sig = sig;
    }
    
}
