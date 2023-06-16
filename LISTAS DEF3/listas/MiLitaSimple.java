/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author estudiante
 */
public class MiLitaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSimpleP A=new LSimpleP();
        A.adifinal("toyota", "luque", "sosa", 111);
        A.adifinal("nissan", "nina", "ruiz", 224);
        A.adifinal("jeep", "rios", "mita", 333);
        A.adifinal("toyota", "nina", "romero", 444);
        A.adifinal("jeep", "perez", "perez", 551);
        A.adifinal("jeep", "loza", "rios", 6660);
        System.out.println("LISTA ASIGNACION vehiculos");
        A.mostrar();
        System.out.println("LISTA DE trufis");
        LDobleM B=new LDobleM();
        Material p1=new Material(1,"111-xxx","verde","toyota");
        Material p2=new Material(1,"222-yyy","azul","nissan");
        Material p3=new Material(2,"333-www","amarillo","carlo");
        Material p4=new Material(3,"444-fff","cafe","nissan");
        Material p5=new Material(1,"555-vvv","negro","toyota");
        Material p6=new Material(1,"222-fff","verde","toyota");
        B.adiFinal(p1);
        B.adiFinal(p2);
        B.adiFinal(p3);
        B.adiFinal(p4);
        B.adiFinal(p5);
        B.adiFinal(p6);
        B.mostrar();
        
        verifica(B, "toyota");
        
    }
    public static boolean verifica(LDobleM b, String x)
    {
    	NodoM z=b.getP();
    	while(z!=null)
    	{
    		if (z.getM().getNombre().equalsIgnoreCase(x))
    			return true;
    		z=z.getSig();
    	}
    	return false;
    }
    
}
