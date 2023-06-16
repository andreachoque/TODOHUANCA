/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class ArbolJ2 {

    private NodoJ2 raiz;

    ArbolJ2() {
        raiz = null;
    }

    public NodoJ2 getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoJ2 raiz) {
        this.raiz = raiz;
    }

    public void crear(NodoJ2 r) {
        if (r != null) {
            System.out.println("Nombre,Edad,Precio");
            Juguete nue2 = new Juguete();
            nue2.leer();
            r.setJu(nue2);
            System.out.println(r.getJu().getNombre() + " Tendra descendiente izquierdo?: s/n");
            String resp = Leer.dato();
            if (resp.equals("s")) {
                NodoJ2 nue = new NodoJ2();
                r.setIzq(nue);
                crear(r.getIzq());
            }
            System.out.println(r.getJu().getNombre() + " Tendra descendiente derecho?: s/n");
            resp = Leer.dato();
            if (resp.equals("s")) {
                NodoJ2 nue = new NodoJ2();
                r.setDer(nue);
                crear(r.getDer());
            }
        }
    }

    public void preorden(NodoJ2 r) {
        if (r != null) {
            r.getJu().mostrar();
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }

    public void inorden(NodoJ2 r) { // i R d
        if (r != null) {
            inorden(r.getIzq());
            r.getJu().mostrar();
            inorden(r.getDer());
        }
    }

    public void postorden(NodoJ2 r) { // i d R
        if (r != null) {
            postorden(r.getIzq());
            postorden(r.getDer());
            r.getJu().mostrar();
        }
    }

    public int contar(NodoJ2 r, int x) {
        if (r != null) {
            int c = contar(r.getIzq(), x) + contar(r.getDer(), x);
            if (r.getJu().getPrecio() > x) {
                c++;
            }
            return c;
        } else {
            return 0;
        }
    }

    public void mostrarJX(NodoJ2 r, int x) {
        if (r != null) {
            if (r.getJu().getEdad() == x) {
                r.getJu().mostrar();
            }
            mostrarJX(r.getIzq(), x);
            mostrarJX(r.getDer(), x);
        }
    }
}
