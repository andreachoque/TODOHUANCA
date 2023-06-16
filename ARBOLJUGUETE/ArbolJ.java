/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class ArbolJ {

    private NodoJ raiz;

    ArbolJ() {
        raiz = null;
    }

    public NodoJ getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoJ raiz) {
        this.raiz = raiz;
    }

    public void crear(NodoJ r) {
        if (r != null) {
            System.out.println("Nombre,Edad,Precio");
            r.setNombre(Leer.dato());
            r.setEdad(Leer.datoInt());
            r.setPrecio(Leer.datoInt());
            System.out.println(r.getNombre() + "Tendra descendiente izquierdo?: s/n");
            String resp = Leer.dato();
            if (resp.equals("s")) {
                NodoJ nue = new NodoJ();
                r.setIzq(nue);
                crear(r.getIzq());
            }
            System.out.println(r.getNombre() + "Tendra descendiente derecho?: s/n");
            resp = Leer.dato();
            if (resp.equals("s")) {
                NodoJ nue = new NodoJ();
                r.setDer(nue);
                crear(r.getDer());
            }
        }
    }

    public void preorden(NodoJ r) {
        if (r != null) {
            System.out.println("<" + r.getNombre() + " " + r.getEdad() + " " + r.getPrecio() + ">");
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }

    public void inorden(NodoJ r) {
        if (r != null) {
            System.out.print("<" + r.getNombre() + " " + r.getEdad() + " " + r.getPrecio() + ">");
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }
}
