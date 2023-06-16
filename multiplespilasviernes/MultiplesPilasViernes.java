/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplespilasviernes;

/**
 *
 * @author Elias
 */
public class MultiplesPilasViernes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilaA pa=new PilaA();
        Artesania a1=new Artesania("n1","m1",1);
        Artesania a2=new Artesania("n2","m2",3);
        Artesania a3=new Artesania("n3","m1",6);
        Artesania a4=new Artesania("n4","m2",1);
        Artesania a5=new Artesania("n5","m3",5);
        pa.adicionar(a1);
        pa.adicionar(a2);
        pa.adicionar(a3);
        pa.adicionar(a4);
        pa.adicionar(a5);
        
        PilaA pa2=new PilaA();
        Artesania a21=new Artesania("n21","m1",15);
        Artesania a22=new Artesania("n22","m2",3);
        Artesania a23=new Artesania("n23","m3",5);
        pa2.adicionar(a21);
        pa2.adicionar(a22);
        pa2.adicionar(a23);
        
        PilaA pa3=new PilaA();
        Artesania a31=new Artesania("n31","m1",10);
        Artesania a32=new Artesania("n32","m3",8);
        Artesania a33=new Artesania("n33","m3",6);
        Artesania a34=new Artesania("n34","m2",4);
        pa3.adicionar(a31);
        pa3.adicionar(a32);
        pa3.adicionar(a33);
        pa3.adicionar(a34);
        
        PilaA pa4=new PilaA();
        Artesania a41=new Artesania("n41","m1",4);
        Artesania a42=new Artesania("n42","m3",5);
        
        pa4.adicionar(a41);
        pa4.adicionar(a42);
        
        CCircularPA A=new CCircularPA();
        A.adicionar(pa);
        A.adicionar(pa2);
        A.adicionar(pa3);
        A.adicionar(pa4);
        A.mostrar();
        
        MultiPilaA B=new MultiPilaA();
        B.setNp(4);
        B.adicionar(1, a1);
        B.adicionar(1, a2);
        B.adicionar(1, a3);
        B.adicionar(1, a4);
        B.adicionar(2, a5);
        B.adicionar(2, a21);
        B.adicionar(2, a22);
        B.adicionar(2, a23);
        B.adicionar(3, a31);
        B.adicionar(3, a32);
        B.adicionar(4, a33);
        B.adicionar(4, a34);
        B.adicionar(4, a41);
        B.adicionar(4, a42);
        B.mostrar();
        
        CCircularE C=new CCircularE();
        Expositor e1=new Expositor(11,"n1","p1","m1");
        Expositor e2=new Expositor(33,"n2","p2","m2");
        Expositor e3=new Expositor(66,"n3","p3","m3");
        Expositor e4=new Expositor(22,"n4","p4","m4");
        C.adicionar(e1);
        C.adicionar(e2);
        C.adicionar(e3);
        C.adicionar(e4);
        C.mostrar();
        //MOSTRAR LAS ARTESANIAS CON MATERIAL x
        System.out.println("\nmaterial X");
        materialX(A,"m2");
        System.out.println("\nmaterial X");
        materialX(B,"m2");
        //mostrar las artesanias del expositor con nombre X
        System.out.println("\nExpositor X");
        expositorX(A,C,"n2");
        System.out.println("\nExpositor X");
        expositorX(B,C,"n2");
    }
    public static void expositorX(MultiPilaA a, CCircularE b, String x)
    {
        for(int i=1;i<=a.getNp();i++)
        {
            Expositor ex=b.eliminar();
            if(ex.getNom().equals(x))
                a.mostrar(i);
            b.adicionar(ex);
        }
    }
    public static void expositorX(CCircularPA a, CCircularE b, String x)
    {
          int n=a.nroelem();
          for(int i=1;i<=n;i++)
          {
              Expositor ex=b.eliminar();
              PilaA px=a.eliminar();
              if(ex.getNom().equals(x))
                  px.mostrar();
              b.adicionar(ex);
              a.adicionar(px);
          }
    }
    public static void materialX(MultiPilaA a, String x)
    {
        PilaA aux=new PilaA();
        for(int i=1;i<=a.getNp();i++)
        {
            while(!a.esvacia(i))
            {
                Artesania ax=a.eliminar(i);
                if(ax.getMat().equals(x))
                    ax.mostrar();
                aux.adicionar(ax);
            }
            a.vaciar(i, aux);
        }
        
    }
    public static void materialX(CCircularPA a, String x)
    {
        PilaA aux=new PilaA();
        int n=a.nroelem();
        for(int i=1;i<=n;i++)
        {
            PilaA px=a.eliminar();
            //...revision(px,x) 
            while(!px.esvacia())
            {
                Artesania ax=px.eliminar();
                if(ax.getMat().equals(x))
                    ax.mostrar();
                aux.adicionar(ax);
            }
            px.vaciar(aux);
            a.adicionar(px);
        }
    }
    
}
