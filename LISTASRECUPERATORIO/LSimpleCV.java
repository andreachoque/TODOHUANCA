/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class LSimpleCV {
    private NodoCV p;
    
    LSimpleCV()
    {
        p=null;
    }

    public NodoCV getP() {
        return p;
    }

    public void setP(NodoCV p) {
        this.p = p;
    }
    public void adicion(int a, String b)
    {
        NodoCV nue=new NodoCV();
        nue.setIdClase(a);
        nue.setClaseV(b);
        if(getP()==null)
            setP(nue);
        else{
            NodoCV r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
        }
    }
    public void mostrar()
    {
        NodoCV r=getP();
            while(r!=null){
                System.out.println(r.getIdClase()+" "+r.getClaseV());
                r=r.getSig();
            }
    }
}
