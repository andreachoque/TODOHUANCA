
public class NodoJ2 {

    private Juguete ju;
    private NodoJ2 izq, der;

    NodoJ2() {
        izq = der = null;
    }

    public Juguete getJu() {
        return ju;
    }

    public NodoJ2 getIzq() {
        return izq;
    }

    public NodoJ2 getDer() {
        return der;
    }

    public void setJu(Juguete ju) {
        this.ju = ju;
    }

    public void setIzq(NodoJ2 izq) {
        this.izq = izq;
    }

    public void setDer(NodoJ2 der) {
        this.der = der;
    }
    
}
