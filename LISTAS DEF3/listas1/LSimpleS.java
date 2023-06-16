
package listas1;

public class LSimpleS {
    private NodoS p;

    public LSimpleS() {
        p=null;
    }

    public NodoS getP() {
        return p;
    }

    public void setP(NodoS p) {
        this.p = p;
    }
    
    public void Adicionar(String a){
        NodoS nue=new NodoS();
        nue.setC(a);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoS r=getP();
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(nue);
        }
    }
    public void mostrar(){
        NodoS r=getP();
        while(r!=null){
            System.out.println(r.getC());
            r=r.getSig();
        }
    }
}
