/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclases;
import java.util.*;


public class LinkedCirculares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Tema> A=new LinkedList<Tema> ();//lista de objetos tema=zona
        Tema t1=new Tema("sopocachi","periferica",500);
        Tema t2=new Tema("san miguel","obrajes",700);
        Tema t3=new Tema("miranda","periferica",900);
        Tema t4=new Tema("belga","obrajes",200);
        Tema t5=new Tema("mercelo","periferica",700);
        Tema t6=new Tema("tiana","sur",5);
        A.add(t1);
        A.add(t2);
        A.add(t3);
        A.add(t4);
        A.addFirst(t5); //adiciona en una posicion en especifica
        A.addLast(t6);
        mostrar(A);
        System.out.println("EJERCICIO 1------------------------------------------------------------------------");
        mayor(A);
        System.out.println("EJERCICIO 2------------------------------------------------------------------------");
        macrodistritox(A,"periferica");
        
        ArrayList<Tema> B=new ArrayList<Tema> ();//lista de objetos tema=zona
        Tema t7=new Tema("sopocachi","periferica",500);
        Tema t8=new Tema("san miguel","obrajes",700);
        Tema t9=new Tema("miranda","periferica",900);
       
        B.add(t7);
        B.add(t8);
        B.add(t9);
        System.out.println("EJERCICIO 3------------------------------------------------------------------------");

        mostrar2(B);
        System.out.println("EJERCICIO 4------------------------------------------------------------------------");

        mayor2(B);
        /*
        
        verifica(A,"Colas");
        //LISTA SIMPLE CIRCULAR
        LSimpleCE B=new LSimpleCE();
        B.adiprimero(11,"Juan", "Loza", "Perez");
        B.adiprimero(22,"Ana", "Quispe", "Roca");
        B.adiprimero(33,"Lucy", "Tito", "Nina");
        B.adiprimero(44,"Maria", "Torrez", "Ramirez");
        B.adiprimero(55,"Rocio", "Bueno", "Calle");
        B.adiprimero(66,"Luis", "Apaza", "Sosa");
        B.adiprimero(77,"Marco", "Soto", "Vino");
        B.mostrar();
        */
        //LISTA DOBLE MACRODISTRITOS
        LDobleCD C=new LDobleCD();
        C.adifinal("periferica", 3);
        C.adifinal("obrajes", 2);
        C.adifinal("sur", 1);   
       
        System.out.println("LISTA MACRODISTRITO------------------------------------------------------------------------");

        C.mostrar();
        
        //mostrar los datos del los estudiantes que
        //tienen evaluacion en el tema X
        //temaX(A,B,C,"Pilas");
        //mostrar la mayor nota en el tema X
        
    }
    /*public static void temaX(LinkedList<Tema> l,LSimpleCE b, LDobleCD c, String x)
    {
        ListIterator<Tema> r=l.listIterator(); // para lista de objetos

        while(r.hasNext())
        {
                Tema tx = r.next();
                if(tx.getNombre().equals(x))
                {  
                    String id=tx.getIdTema();
                    NodoD r1 = c.getP();
                    while (r1.getSig() != c.getP()){
                        if(r1.getIdTema().equals(id)){
                           NodoE r2 = b.getP();
                            while (r2.getSig() != b.getP()){
                                if(r2.getCi()==r1.getCi())
                                    System.out.println(r2.getCi()+" "+r2.getNom()+" "+r2.getPat()+" "+r2.getMat());
                                r2 = r2.getSig();
                            }
                            if(r2.getCi()==r1.getCi())
                                    System.out.println(r2.getCi()+" "+r2.getNom()+" "+r2.getPat()+" "+r2.getMat());
                        }
                        r1 = r1.getSig();
                    }
                    if(r1.getIdTema().equals(id)){
                           NodoE r2 = b.getP();
                            while (r2.getSig() != b.getP()){
                                if(r2.getCi()==r1.getCi())
                                    System.out.println(r2.getCi()+" "+r2.getNom()+" "+r2.getPat()+" "+r2.getMat());
                                r2 = r2.getSig();
                            }
                            if(r2.getCi()==r1.getCi())
                                    System.out.println(r2.getCi()+" "+r2.getNom()+" "+r2.getPat()+" "+r2.getMat());
                        }
                }
        }
    }*/
    
    public static void mayor2 (LDobleCD A, int x)
    {
    	NodoD r=A.getP();
    	while(r!=null)
    	{
    		if(x==r.getNro()) //REVISAR
    			 ListIterator<Tema> w=a.listIterator(); // para lista de objetos 
	        while(w.hasNext())
	        {
	        	Tema zx=w.next();
	        	if(zx.getMacro().equalsIgnoreCase(r.getNombre()))
	        		System.out.println(zx.getNombre());
	        }
    	}
    }
    public static void mayor2 (ArrayList<Tema> A)
    {
    	int may=0;
    	 ListIterator<Tema> r=A.listIterator(); 
    	 while(r.hasNext())
    	 {
    		 Tema zx=r.next();
    		 if(zx.getNroHab()>may)
    		 {
    			 may=zx.getNroHab();
    		 } 
    	 }
    	 System.out.println("\n el mayor es "+ may);
    }  
    public static void problema(LDobleCD b,LinkedList<Tema> a, int n)
    {
    	NodoD r=b.getP();
    	while(r!=null)
    	{
    		 ListIterator<Tema> w=a.listIterator(); // para lista de objetos 
    	        while(w.hasNext())
    	        {
    	        	Tema zx=w.next();
    	        	if(zx.getMacro().equalsIgnoreCase(r.getNombre()))
    	        		System.out.println(zx.getNombre());
    	        }
    	}
    }
       public static void verifica(LinkedList<Tema> l,String x)
    {
        ListIterator<Tema> r=l.listIterator(); // para lista de objetos
        boolean sw=false;    
        while(r.hasNext())
        {
                Tema tx = r.next();
                if(tx.getNombre().equals(x))
                    sw=true;
        }
        if(sw)
            System.out.println("Existe");
        else
            System.out.println("no Existe");
    }
     
       public static void nrohabdezonas(LinkedList<Tema> A, String x)
       {
       	
       	 ListIterator<Tema> r=A.listIterator(); 
       	 while(r.hasNext())
       	 {
       		 Tema zx=r.next();
       		 if(zx.getMacro().equalsIgnoreCase(x))
       		 {
       			 System.out.println("\n el nombre es :"+ zx.getNombre());
       		 } }
       } 
     public static void macrodistritox (LinkedList<Tema> A, String x)
       {
       	
       	 ListIterator<Tema> r=A.listIterator(); 
       	 while(r.hasNext())
       	 {
       		 Tema zx=r.next();
       		 if(zx.getMacro().equalsIgnoreCase(x))
       		 {
       			 System.out.println("\n el nombre es :"+ zx.getNombre());
       		 } }
       }   
          
    public static void mayor (LinkedList<Tema> A)
    {
    	int may=0;
    	 ListIterator<Tema> r=A.listIterator(); 
    	 while(r.hasNext())
    	 {
    		 Tema zx=r.next();
    		 if(zx.getNroHab()>may)
    		 {
    			 may=zx.getNroHab();
    		 } 
    	 }
    	 System.out.println("\n el mayor es "+ may);
    }   
       
    public static void mostrar2(ArrayList<Tema> A)
    {
        ListIterator<Tema> r=A.listIterator(); // para lista de objetos

        while(r.hasNext())
        {
                Tema tx = r.next();
                tx.mostrar();//proceso
        }
    }  
    public static void mostrar(LinkedList<Tema> A)
    {
        ListIterator<Tema> r=A.listIterator(); // para lista de objetos

        while(r.hasNext())
        {
                Tema tx = r.next();
                tx.mostrar();//proceso
        }
    }
}
