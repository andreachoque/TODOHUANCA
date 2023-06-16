/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author windows
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArbolBinarioVisitas {
    private class Nodo {
        int HH;
        int MIN;
        int SS;
        String fecha;
        String visitante;
        String hora;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(String fecha, int HH, int MIN, int SS, String visitante) {
            this.fecha = fecha;
            this.HH = HH;
            this.MIN = MIN;
            this.SS = SS;
            this.visitante = visitante;
            this.izquierdo = null;
            this.derecho = null;
        }
        
        Nodo(String fecha, String hora, String visitante) {
            this.fecha = fecha;
            this.hora = hora;
            this.visitante = visitante;
            this.izquierdo = null;
            this.derecho = null;
            
        }

        public int getHH() {
            return HH;
        }

        public void setHH(int HH) {
            this.HH = HH;
        }

        public int getMIN() {
            return MIN;
        }

        public void setMIN(int MIN) {
            this.MIN = MIN;
        }

        public int getSS() {
            return SS;
        }

        public void setSS(int SS) {
            this.SS = SS;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getVisitante() {
            return visitante;
        }

        public void setVisitante(String visitante) {
            this.visitante = visitante;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public Nodo getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo izquierdo) {
            this.izquierdo = izquierdo;
        }

        public Nodo getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo derecho) {
            this.derecho = derecho;
        }
        
    }

     private Nodo raiz;

    public ArbolBinarioVisitas() {
        this.raiz = null;
    }

    public void insertar(String fecha, int HH, int MIN, int SS, String visitante) {
        Nodo nodoNuevo = new Nodo(fecha, HH, MIN, SS, visitante);
        if (raiz == null) {
            raiz = nodoNuevo;
        } else {
            add(raiz, nodoNuevo);
        }
    }

    public void insertar(String fecha, String hora, String visitante) {
        Nodo nodoNuevo = new Nodo(fecha, hora, visitante);
        if (raiz == null) {
            raiz = nodoNuevo;
        } else {
            add(raiz, nodoNuevo);
        }
    }

    private void add(Nodo nodoActual, Nodo nodoNuevo) {
        if (nodoNuevo.fecha.compareTo(nodoActual.fecha) < 0) {
            if (nodoActual.izquierdo == null) {
                nodoActual.izquierdo = nodoNuevo;
            } else {
                add(nodoActual.izquierdo, nodoNuevo);
            }
        } else {
            if (nodoActual.derecho == null) {
                nodoActual.derecho = nodoNuevo;
            } else {
                add(nodoActual.derecho, nodoNuevo);
            }
        }
    }

    public int contarVisitasEnero() {
        return contarVisitasEnero(raiz);
    }

    private int contarVisitasEnero(Nodo nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        int visitasEnero = contarVisitasEnero(nodoActual.izquierdo) +
                contarVisitasEnero(nodoActual.derecho);

        if (nodoActual.fecha.startsWith("01/")) {
            visitasEnero++;
        }

        return visitasEnero;
    }

    public int contarVisitasUltimoMinuto(int minuto) {
    if (minuto < 0 || minuto > 59) {
        System.out.println("Error");
        return 0;
    }

    return umin(raiz, minuto);
}

private int umin(Nodo nodoActual, int minuto) {
    if (nodoActual == null) {
        return 0;
    }

    int vmin = umin(nodoActual.izquierdo, minuto) +
            umin(nodoActual.derecho, minuto);

    if (nodoActual.MIN == minuto || (nodoActual.hora != null && Gmin(nodoActual.hora) == minuto)) {
        vmin++;
    }

    return vmin;
}

private int Gmin(String hora) {
    String[] partesHora = hora.split(":");
    return Integer.parseInt(partesHora[1]);
}


    public void mostrarPorNiveles() {
    if (raiz == null) {
        System.out.println("El árbol está vacío.");
        return;
    }

    Queue<Nodo> cola = new LinkedList<>();
    cola.offer(raiz);

    while (!cola.isEmpty()) {
        int nivelSize = cola.size();

        for (int i = 0; i < nivelSize; i++) {
            Nodo nodoActual = cola.poll();
            String hora = (nodoActual.hora != null) ? nodoActual.hora : nodoActual.HH + ":" + nodoActual.MIN + ":" + nodoActual.SS;
            System.out.println(nodoActual.fecha + " " + hora + " - " + nodoActual.visitante);

            if (nodoActual.izquierdo != null) {
                cola.offer(nodoActual.izquierdo);
            }

            if (nodoActual.derecho != null) {
                cola.offer(nodoActual.derecho);
            }
        }
    }
}

    public static void main(String[] args) {
        ArbolBinarioVisitas arbol = new ArbolBinarioVisitas();
        arbol.insertar("01/22/23", 10, 30, 10, "ana");
        arbol.insertar("05/22/20", "10:30:10", "lilian");
        arbol.insertar("01/22/21", "12:15:20", "maria");
        arbol.insertar("02/01/20", 12, 50, 13, "gabriel");
        arbol.insertar("01/05/23", 13, 30, 40, "arturo");

        arbol.mostrarPorNiveles();

        System.out.println("------------SOLUCION -------------");
        int visitasEnero = arbol.contarVisitasEnero();
        System.out.println("Visitas en enero: " + visitasEnero);

        System.out.println("------------SOLUCION -------------");
        int visitasUltimoMinuto = arbol.contarVisitasUltimoMinuto(30);
        System.out.println("Visitas en el último minuto: " + visitasUltimoMinuto);
    }
}

