/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class LSimpleM {
    private NodoM p;
    
    LSimpleM()
    {
        p=null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    public void adicion(int a, String b)
    {
        NodoM nue=new NodoM();
        nue.setIdMod(a);
        nue.setRangoMod(b);
        if(getP()==null)
            setP(nue);
        else{
            NodoM r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
        }
    }
    public void mostrar()
    {
        NodoM r=getP();
            while(r!=null){
                System.out.println(r.getIdMod()+" "+r.getRangoMod());
                r=r.getSig();
            }
    }
}
