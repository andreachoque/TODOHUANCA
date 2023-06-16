/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedcirculares;
import java.util.*;

/**
 *
 * @author Carmen Huanca
 */
public class LinkedCirculares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Tema> A=new LinkedList<Tema> ();//lista de objetos
        Tema t1=new Tema("t1","Pilas");
        Tema t2=new Tema("t2","Colas");
        Tema t3=new Tema("t3","Multiples Pilas");
        Tema t4=new Tema("t4","Multiples Colas");
        Tema t5=new Tema("t5","Listas enlazadas");
        Tema t6=new Tema("t6","Multiples Listas");
        A.add(t1);
        A.add(t2);
        A.add(t3);
        A.add(t4);
        A.addFirst(t5);
        A.addLast(t6);
        mostrar(A);
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
        //LISTA DOBLE CIRCULAR
        LDobleCD C=new LDobleCD();
        C.adifinal("t1", 11, 15);
        C.adifinal("t1", 33, 11);
        C.adifinal("t1", 55, 16);
        C.adifinal("t1", 77, 5);
        C.adifinal("t2", 11, 20);
        C.adifinal("t2", 22, 4);
        C.adifinal("t2", 33,11);
        C.adifinal("t3", 11, 9);
        C.adifinal("t3", 22, 10);
        C.adifinal("t4", 11, 12);
        C.adifinal("t4", 44, 14);
        
        C.mostrar();
        //mostrar los datos del los estudiantes que
        //tienen evaluacion en el tema X
        temaX(A,B,C,"Pilas");
        //mostrar la mayor nota en el tema X
        
    }
    public static void temaX(LinkedList<Tema> l,LSimpleCE b, LDobleCD c, String x)
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
