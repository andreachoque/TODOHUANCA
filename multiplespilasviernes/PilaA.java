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
public class PilaA {
    private int max=50;
    private Artesania v[]=new Artesania[max+1];
    private int tope;
    
    PilaA()
    {
        tope=0;
    }
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (tope);
    }
    void adicionar (Artesania elem)
    {
	if (!esllena ())
	{
	    tope++;          //v[tope+1]=elem
	    v [tope] = elem; //tope=tope+1
	}
	else
	    System.out.println ("Pila llena");
    }
    Artesania eliminar ()
    {
	Artesania elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Artesanias de la Pila ");
	    PilaA aux = new PilaA ();
	    while (!esvacia ())
	    {
		Artesania elem = eliminar ();
                elem.mostrar();
		aux.adicionar (elem);
	    }
	    vaciar(aux);
	}
    }
    void vaciar (PilaA a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
