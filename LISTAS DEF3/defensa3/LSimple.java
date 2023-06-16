/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensa3;

/**
 *
 * @author Carmen Huanca
 */
public class LSimple {
    private NodoE p;
    LSimple()
    {
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    void adiprimero (int z,int a, String b, String c, String d,String e,String f)
    {
    	NodoE nue = new NodoE ();
    	nue.setIdEspecialidades(z);
    	nue.setCi(a);
        nue.setNom(b);
        nue.setPat(c);
        nue.setMat(d);
        nue.setSeudonimo(e);
        nue.setLugar(f);
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
            System.out.println(r.getIdEspecialidades()+" "+ r.getCi()+" "+r.getNom()+" "+r.getPat()+" "+r.getMat()+" "+r.getSeudonimo()+" "+r.getLugar());
            r = r.getSig();
        }
        System.out.println(r.getIdEspecialidades()+" "+ r.getCi()+" "+r.getNom()+" "+r.getPat()+" "+r.getMat()+" "+r.getSeudonimo()+" "+r.getLugar());
    }
}
