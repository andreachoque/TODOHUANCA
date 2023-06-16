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
public class CCircularPA {
    private int max=100;
    private PilaA v[]=new PilaA[max+1];
    private int ini,fin;
    
    CCircularPA()
    {
        ini=fin=0;
    }
    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }
    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }
    void adicionar (PilaA elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }
    PilaA eliminar ()
    {
	PilaA elem = null;
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Pilas de la Cola ");
	    CCircularPA aux = new CCircularPA ();
	    while (!esvacia ())
	    {
		PilaA elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (CCircularPA a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
}
