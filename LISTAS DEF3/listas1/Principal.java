
package listas1;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Lista Simple A");
        System.out.println("----------------");
        LSimpleS A=new LSimpleS();
        A.Adicionar("Lab");
        A.Adicionar("Lab 131 Materia");
        A.Adicionar("Ana");
        A.Adicionar("oso");
        A.Adicionar("mundo Lab de media hora");
        A.Adicionar("oro");
        A.mostrar();
        System.out.println("");
        System.out.println("Lista simple B");
        System.out.println("---------------");
        LSimpleS B=new LSimpleS();
        B.Adicionar("Lab de inormatica");
        B.Adicionar("Conferencia de datos a Mano");
        B.Adicionar("Hola mundo");
        B.Adicionar("Capacitacion Mano");
        B.Adicionar("ana Cargos Hola importantes");
        B.Adicionar("Competencia de Materia");
        B.mostrar();
        System.out.println("-----------------------------------------------------------------");
        ejer1(A,B,1);
       
        System.out.println("-----------------------------------------------------------------"); 
        ejer2(A,B);
        System.out.println("-----------------------------------------------------------------");
        ejer3(A);
        
    }
    
    public static void ejer1(LSimpleS A, LSimpleS B,int x){
        System.out.println("Ejercicio 1");
        int j=1;
        int cont=0;
        String aux="";
        String aux2="";
        NodoS r = A.getP();
        NodoS s = B.getP();
        while(r!=null){
            if(j==x){
                aux=r.getC();
                while(s!=null){
                    cont++;
                    aux2=s.getC();
                    int intIndex = aux2.indexOf(aux);
                    if(intIndex != - 1){
                        System.out.println(s.getC());
                        System.out.println("en el nodo " +cont);
                    }
                s=s.getSig();
                }
            }
            j++;
            r=r.getSig();    
        }
        
    }   
    
    public static void ejer2(LSimpleS A, LSimpleS B){
        System.out.println("Ejercicio 2");
        NodoS r = A.getP();
        NodoS s = B.getP();       
        while(s!=null){
            int c=1;
            String aux="",aux2="";
            aux2=s.getC();
            char x=aux2.charAt(0);
            aux=aux+x;
            while(x!=' '){
                x=aux2.charAt(c);
                aux=aux+x;   
                c++;
            }
            while(r!=null){
                String aux3=r.getC();
                    int intIndex = aux.indexOf(aux3);
                    if(intIndex ==  -1){
                        System.out.println(r.getC());
                    }
                r=r.getSig();
            }
        s=s.getSig();
        }
    }
    
    
    public static void ejer3(LSimpleS A){
    	System.out.println("Ejercicio 3");
        NodoS r= A.getP();
        while(r!=null){
            String aux=r.getC();
            if(isPalindromo(aux)){
                
                if(r==A.getP()) {
                    A.setP(r.getSig());
                    r.setSig(null);
                }
                else {
                   
                    NodoS w = A.getP();
                    while(w.getSig() != r) {
                    w = w.getSig();
                    }
                    w.setSig(r.getSig());
                    r.setSig(null);
                    r = w;
                    }
            }
            else
                r = r.getSig(); 
        }
        A.mostrar();
    }

    public static boolean isPalindromo(String s) {
    	  String s2 = "";
    	  for (int i = s.length() - 1; i >= 0; i--) {
    	    s2 += s.charAt(i);
    	  }
    	  if (s.equals(s2)) {
    	    return true;
    	  }
    	  return false;
    	}
    
    
}
