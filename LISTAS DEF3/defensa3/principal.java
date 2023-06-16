package defensa3;

import java.util.ArrayList;
import java.util.ListIterator;

import ejeclases.Tema;



public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LDobleM B=new LDobleM();
		Categorias p1=new Categorias(1,"EXPRESIONES CULTURALES ORIGINARIAS DEL ALTIPLANO");
		Categorias p2=new Categorias(2,"EXPRESIONES CULTURALES ORIGINARIAS DE LOS VALLES");
		Categorias p3=new Categorias(3,"EXPRESIONES CULTURALES ORIGINARIAS DEL ORIENTE");
		
        B.adiFinal(p1);
        B.adiFinal(p2);
        B.adiFinal(p3);
       
        B.mostrar();
        System.out.println("--------------------------------------------------------------------");
        ArrayList<Especialidades> A=new ArrayList<Especialidades> ();//lista de objetos tema=zona
        Especialidades t1=new Especialidades(1,1,"MUSICA Y DANZA DEL ALTIPLANO");
        Especialidades t2=new Especialidades(2,1,"TEJIDO ORIGINARIO DEL ALTIPLANO");
        Especialidades t3=new Especialidades(3,1,"ARTES ORIGINARIAS DEL ALTIPLANO");
        Especialidades t4=new Especialidades(4,1,"IDIOMA Y TRADICION ORIGINARIA DEL ALTIPLANO");
        Especialidades t5=new Especialidades(5,2,"MUSICA Y DANZA DE LOS VALLES");
        Especialidades t6=new Especialidades(6,2,"TEJIDO ORIGINARIO DE LOS VALLES");
        Especialidades t7=new Especialidades(7,2,"ARTES ORIGINARIAS DE LOS VALLES");
        Especialidades t8=new Especialidades(8,2,"IDIOMA Y TRADICION ORIGINARIA DE LOS VALLES");
        Especialidades t9=new Especialidades(9,3,"MUSICA Y DANZA DEL ORIENTE");
        Especialidades t10=new Especialidades(10,3,"TEJIDO ORIGINARIO DEL ORIENTE");
        Especialidades t11=new Especialidades(11,3,"ARTES ORIGINARIAS DEL ORIENTE");
        Especialidades t12=new Especialidades(12,3,"IDIOMA Y TRADICION ORIGINARIA DEL ORIENTE");
        A.add(t1);
        A.add(t2);
        A.add(t3);
        A.add(t4);
        A.add(t5);
        A.add(t6);
        A.add(t7);
        A.add(t8);
        A.add(t9);
        A.add(t10);
        A.add(t11);
        A.add(t12);
        mostrar2(A);
        System.out.println("--------------------------------------------------------------------");
        LSimple C = new LSimple();
        C.adiprimero(1, 11111, "Andrea", "choque", "quispe", " andy", "cochabamba");
        C.adiprimero(2, 12222, "maria", "carribe", "loayza", " lala", "la paz");
        C.adiprimero(3, 13333, "roberto", "chavez", "enriques", " koko", "oruro");
        C.adiprimero(4, 11444, "ana", "altamirano", "mamani", " roni", "la paz");
        C.adiprimero(5, 11155, "mariel", "humbert", "flores", " lili", "cochabamba");
        C.adiprimero(6, 11166, "diana", "velasco", "perez", " meli", "oruro");
        C.adiprimero(7, 11177, "melisa", "encinas", "luis", " gabi", "Santa Cruz");
        C.mostrar();
        
        
        

	}
	
	public static void temaX(ArrayList<Especialidades> l,LSimple b, LDobleM c, String x , String Y)
	{
		NodoE g=b.getP();
		while (g!=null)
		{
			if (g.getLugar().equalsIgnoreCase(x))
			{ ListIterator<Especialidades> r= l.listIterator(); 
			while(r.hasNext())
			{
				Especialidades zx=r.next();
	    		 if(zx.getIdEspecialidades()==g.getIdEspecialidades())
	    			 Categorias c=c.getM();
	    		 while(c!=null)
	    		 {
	    			if(c.)
	    		 }
			}
				
			}
		}
	}
	
	public static void mostrar2(ArrayList<Especialidades> A)
    {
        ListIterator<Especialidades> r=A.listIterator(); // para lista de objetos

        while(r.hasNext())
        {
        	Especialidades tx = r.next();
                tx.mostrar();//proceso
        }
    }  

}
