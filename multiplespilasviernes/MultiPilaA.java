/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplespilasviernes;

/**
 *
 * @author Carmen Huanca
 */
public class MultiPilaA {//vector de pilas
    private int np;  //numero de pilas
    private PilaA v[]=new PilaA[100];
    
    MultiPilaA()
    {
        for(int i=1;i<100;i++)
            v[i]=new PilaA();
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    int nroelem(int i)
    {
		return (v[i].nroelem());
    }
    boolean esvacia (int i)
    {
	if (v[i].esvacia ())
	    return true;
	return false;
    }
    boolean esllena (int i)
    {
	if (v[i].esllena ())
	    return true;
	return false;
    }
    void adicionar (int i, Artesania L)
    {
	if (!v [i].esllena ())
	    v [i].adicionar (L);
	else
	    System.out.print ("Pila " + i + " esta llena");
    }
    Artesania eliminar (int i)
    {
	Artesania e = null;
	if (!v [i].esvacia ())
	    e = v [i].eliminar ();
	else
	    System.out.print ("Pila " + i + " esta vacia");
	return e;
    }
    void mostrar(int i)
    {
        v[i].mostrar();
    }
    void mostrar ()
    {
	for (int i = 1 ; i <= np ; i++)
	{
	    System.out.println ("\n\nArtesanias Pila " + i + " ");
	    v [i].mostrar ();
	}
    }
    void vaciar(int i, PilaA a )
    {
    	while(!a.esvacia())
    		adicionar(i,a.eliminar());
    }
    void vaciar(int i, int j)
    {
        v[i].vaciar(v[j]);
    }
}
