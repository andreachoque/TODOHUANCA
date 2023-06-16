/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class PilaP {
    private int max=100;
    private NodoP v[]=new NodoP[max+1];
    private int tope;
    
    PilaP(){
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

    void adicionar (NodoP elem)
    {
        if (!esllena ())
        {
            tope++;
            v [tope] = elem;
        }
        else
            System.out.println ("Pila llena");
    }

    NodoP eliminar ()
    {
        NodoP elem = null;
        if (!esvacia ())
        {
            elem = v [tope];
            tope--;
        }
        else
            System.out.println ("Pila vacia");
        return (elem);
    }

    void vaciar (PilaP a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());
        
    }
}
