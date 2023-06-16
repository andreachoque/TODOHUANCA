/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elias
 */
public class ArbolP {

    private NodoP raiz;

    public ArbolP() {
        raiz = null;
    }

    public NodoP getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoP raiz) {
        this.raiz = raiz;
    }

    //algoritmos iterativos, recorrido en amplitud
    public void crear() {
        PilaP nivel = new PilaP();
        PilaP desc = new PilaP();
        setRaiz(new NodoP());
        getRaiz().setNom(Leer.dato());
        getRaiz().setZona(Leer.dato());
        nivel.adicionar(getRaiz());
        while (!nivel.esvacia()) {//pasa de nivel            
            while (!nivel.esvacia()) {//procesa un nivel                
                NodoP r = nivel.eliminar();
                System.out.println(r.getNom() + " Tendra IZQ s/n");
                String resp = Leer.dato();
                if (resp.equals("s")) {
                    NodoP nue = new NodoP();
                    nue.setNom(Leer.dato());
                    nue.setZona(Leer.dato());
                    r.setIzq(nue);
                    desc.adicionar(r.getIzq());
                }
                System.out.println(r.getNom() + " Tendra DER s/n");
                String respd = Leer.dato();
                if (respd.equals("s")) {
                    NodoP nue = new NodoP();
                    nue.setNom(Leer.dato());
                    nue.setZona(Leer.dato());
                    r.setDer(nue);
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
    }

    public void niveles() {
        PilaP nivel = new PilaP();
        PilaP desc = new PilaP();
        nivel.adicionar(getRaiz());
        int c = 0;
        while (!nivel.esvacia()) {
            System.out.println("Nivel: " + c + ">>");
            while (!nivel.esvacia()) {
                NodoP r = nivel.eliminar();
                System.out.print("[" + r.getNom() + " " + r.getZona() + "]");
                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("");
        }
    }

    public void mostrarK(int k) {
        PilaP nivel = new PilaP();
        PilaP desc = new PilaP();
        nivel.adicionar(getRaiz());
        int c = 0;
        while (!nivel.esvacia()) {            
            while (!nivel.esvacia()) {
                NodoP r = nivel.eliminar();
                if (c == k) {
                    System.out.print("[" + r.getNom() + " " + r.getZona() + "]");
                }

                if (r.getIzq() != null) {
                    desc.adicionar(r.getIzq());
                }
                if (r.getDer() != null) {
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("");
        }
    }

    //cuantos parques del subarbol derecho tienen sus descendientes
    public void subDer() {
        PilaP nivel = new PilaP();
        PilaP desc = new PilaP();
        if (getRaiz().getDer() != null) {
            nivel.adicionar(getRaiz().getDer());
            int c = 0;
            while (!nivel.esvacia()) {
                while (!nivel.esvacia()) {
                    NodoP r = nivel.eliminar();
                    if (r.getIzq() != null && r.getDer() != null) {
                        c++;
                    }

                    if (r.getIzq() != null) {
                        desc.adicionar(r.getIzq());
                    }
                    if (r.getDer() != null) {
                        desc.adicionar(r.getDer());
                    }
                }
                nivel.vaciar(desc);
                System.out.println("");
            }
            System.out.println("Cantidad: " + c);
        }
    }
    
    //mostrar el subarbol con el mayor numero de parques
    public void mayParque(){
        PilaP nivel = new PilaP();
        PilaP desc = new PilaP();
        if (getRaiz().getDer() != null) {
            nivel.adicionar(getRaiz());
            int cd = 1;
            while (!nivel.esvacia()) {
                while (!nivel.esvacia()) {
                    NodoP r = nivel.eliminar();

                    if (r.getIzq() != null) {
                        cd++;
                        desc.adicionar(r.getIzq());
                    }
                    if (r.getDer() != null) {
                        cd++;
                        desc.adicionar(r.getDer());
                    }
                }
                nivel.vaciar(desc);
                System.out.println("");
            }
            System.out.println("Cantidadparques Derecha: " + cd);
        }
    }
}
