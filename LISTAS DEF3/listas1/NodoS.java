
package listas1;

public class NodoS {
    private String c;
    private NodoS sig;
    
    NodoS(){
        sig=null;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public NodoS getSig() {
        return sig;
    }

    public void setSig(NodoS sig) {
        this.sig = sig;
    }
    
    
}
