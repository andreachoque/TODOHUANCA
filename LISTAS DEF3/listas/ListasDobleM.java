/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblem;

/**
 *
 * @author Carmen Huanca
 */
public class ListasDobleM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LDobleM A=new LDobleM();
        Material m1=new Material("m1","Urbana","paredes","Ladrillo, bloques cemento");
        Material m2=new Material("m2","Urbana","paredes","Adobe o tapial");
        Material m3=new Material("m3","Rural","paredes","tabique o quinche");
        Material m4=new Material("m4","Rural","paredes","piedra");
        Material m5=new Material("m5","Urbana","techos","calamina o plancha");
        Material m6=new Material("m6","Urbana","techos","tejas");
        Material m7=new Material("m7","Rural","techos","losa de hormigon");
        Material m8=new Material("m8","Rural","techos","paja, cana, palma");
        Material m9=new Material("m9","Urbana","pisos","Tierra");
        Material m0=new Material("m0","Rural","pisos","cemento");
        A.adiFinal(m1);
        A.adiFinal(m2);
        A.adiFinal(m3);
        A.adiFinal(m4);
        A.adiFinal(m5);
        A.adiFinal(m6);
        A.adiFinal(m7);
        A.adiFinal(m8);
        A.adiFinal(m9);
        A.adiFinal(m0);
        A.mostrar();
        LDobleC B=new LDobleC();
        B.adiFinal("m1", "La Paz", 1992, 52);
        B.adiFinal("m2", "La Paz", 1992, 67);
        B.adiFinal("m3", "La Paz", 1992, 3);
        B.adiFinal("m4", "La Paz", 1992, 13);
        B.adiFinal("m1", "Chuquisaca", 1992, 78);
        B.adiFinal("m2", "Chuquisaca", 1992, 82);
        B.adiFinal("m4", "Chuquisaca", 1992, 16);
        B.adiFinal("m1", "La Paz", 2001, 60);
        B.adiFinal("m2", "La Paz", 2001, 63);
        B.adiFinal("m3", "La Paz", 2001, 10);
        B.adiFinal("m4", "La Paz", 2001, 11);
        B.adiFinal("m1", "Chuquisaca", 2001, 85);
        B.adiFinal("m2", "Chuquisaca", 2001, 75);
        B.adiFinal("m3", "Chuquisaca", 2001, 10);
        B.adiFinal("m4", "Chuquisaca", 2001, 24);
        B.mostrar();
        //mostrar los materiales que usan en el tipo X(paredes,techos,pisos)
        //b)	En qué área {“urbana” o “rural”), se utilizó más material para el techo el año X
        ejerB(A,B,1992);
    }
    public static void ejerB(LDobleM a, LDobleC b, int x)
    {
        int au,ar;
        au=ar=0;
        NodoM r1=a.getP();
        while(r1!=null)
        {
            int s=0;
            NodoC r2=b.getP();
            while(r2!=null)
            {
                if(r1.getM().getIdMaterial().equals(r2.getIdMaterial()) && r2.getAnio()==x && r1.getM().getTipo().equals("paredes"))
                    s=s+r2.getCant();
                r2=r2.getSig();
            }
            if(r1.getM().getArea().equals("Urbana"))
                au=au+s;
            else
                ar=ar+s;
            r1=r1.getSig();
        }
        if(au>ar)
            System.out.println("URBANA");
        else
            if(ar>au)
                System.out.println("RURAL");
            else
                System.out.println("en la misma cantidad");
        
    }
    
}
