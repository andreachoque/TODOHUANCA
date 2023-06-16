/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedcirculares;

/**
 *
 * @author Carmen Huanca
 */
public class LSimpleCE {
    private NodoE p;
    LSimpleCE()
    {
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    void adiprimero (int a, String b, String c, String d)
    {
    	NodoE nue = new NodoE ();
    	nue.setCi(a);
        nue.setNom(b);
        nue.setPat(c);
        nue.setMat(d);
	if (getP()==null)
	{
	    setP(nue);
	    getP().setSig(getP());//nue.setSig(nue)
	}
	else
	{
            nue.setSig(getP());
	    NodoE r = getP();
	    while (r.getSig() != getP())
		r = r.getSig();
	    r.setSig(nue);
            setP(nue);
	}
    }
    void mostrar()
    {
        NodoE r = getP();
	while (r.getSig() != getP()){
            System.out.println(r.getCi()+" "+r.getNom()+" "+r.getPat()+" "+r.getMat());
            r = r.getSig();
        }
        System.out.println(r.getCi()+" "+r.getNom()+" "+r.getPat()+" "+r.getMat());
    }
}
