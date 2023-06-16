/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class ListasRecuperatorio {

    public static void main(String[] args) {
        LSimpleCV A=new LSimpleCV();
        A.adicion(1,"automovil" );
        A.adicion(2,"bus" );
        A.adicion(3,"camion" );
        A.adicion(4,"camioneta" );
        A.adicion(5,"jeep" );
        A.adicion(6,"minibus" );
        A.mostrar();
        LSimpleM B=new LSimpleM();
        B.adicion(11, "<=1969");
        B.adicion(22, "1970-1975");
        B.adicion(33, "1976-1980");
        B.adicion(44, "1981-1985");
        B.adicion(55, "1986-1990");
        B.adicion(66, "1991-1995");
        B.mostrar();
        LDobleP C=new LDobleP();
        C.adicion(1, 11, 2003, 2086);
        C.adicion(1, 11, 2004, 2227);
        C.adicion(1, 11, 2005, 2260);
        C.adicion(1, 22, 2003, 5248);
        C.adicion(1, 22, 2004, 5449);
        C.adicion(2, 11, 2003, 101);
        C.adicion(2, 11, 2004, 109);
        C.adicion(3, 11, 2003, 100);
        C.adicion(3, 11, 2004, 200);
        C.mostrar();
        problemaB(A,C,2005);
    }
    public static void problemaB(LSimpleCV a, LDobleP b, int x)
    {
        NodoCV w=a.getP();
        while(w!=null)
        {
            System.out.print("Clase Vehiculo: "+w.getClaseV());
            //calcular total
            int tot=0;
            NodoP z=b.getP();
            while(z!=null)
            {
                if(z.getIdClase()==w.getIdClase() && z.getAnio()==x)
                    tot=tot+z.getCantidad();
                z=z.getSig();
            }
            System.out.println("-->  Total : "+tot);
            w=w.getSig();
        }
    }
}
