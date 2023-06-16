/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author estudiante
 */
public class LSimpleP {
    private NodoP p;
    
    LSimpleP()
    {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adiPrincipio(String a, String b, String c, int d){
        NodoP nue=new NodoP();
        nue.setNom(a);nue.setPat(b);nue.setMat(c);nue.setCi(d);
        nue.setSig(getP());
        setP(nue);
    }
    public void adifinal(String a, String b, String c, int d)
    {
        NodoP nue=new NodoP();
        nue.setNom(a);nue.setPat(b);nue.setMat(c);
        nue.setCi(d);
        if(getP()==null)
            setP(nue);
        else{
            NodoP m=getP();
            while(m.getSig()!=null)//recorre al ultimo nodo
                m=m.getSig();
            m.setSig(nue);
        }
            
    }
    public void mostrar()
    {
        NodoP d=getP();
        while(d!=null)//recorre hasta el final
        {
            System.out.print("<"+d.getCi()+" "+d.getNom()+" "+d.getPat()+" "+d.getMat()+"> ");
            d=d.getSig();
        }
    }
    
}
