
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArbolJ A = new ArbolJ();
        A.setRaiz(new NodoJ());
        A.crear(A.getRaiz());
        A.preorden(A.getRaiz());*/
        
        ArbolJ2 B = new ArbolJ2();
        B.setRaiz(new NodoJ2());
        B.crear(B.getRaiz());
        B.preorden(B.getRaiz());
        
        //cuantos juguetes tienen el precio mayor a x
        System.out.println("Cantidad: "+B.contar(B.getRaiz(), 120));
        //mostrar los juguetes para la edad x
        B.mostrarJX(B.getRaiz(), 12);
    }
   
}
