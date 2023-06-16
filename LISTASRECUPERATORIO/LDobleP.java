/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class LDobleP {
    private NodoP p;
    
    LDobleP()
    {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adicion(int a, int b, int c, int d)
    {
        NodoP nue=new NodoP();
        nue.setIdClase(a);
        nue.setIdMod(b);
        nue.setAnio(c);
        nue.setCantidad(d);
        if(getP()==null)
            setP(nue);
        else{
            NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar()
    {
        NodoP r=getP();
            while(r!=null){
                System.out.println(r.getIdClase()+" "+r.getIdMod()+" "+r.getAnio()+" "+r.getCantidad());
                r=r.getSig();
            }
    }
    
}
