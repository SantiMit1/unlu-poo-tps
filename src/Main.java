import unlu.poo.tp1.*;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(new Nodo(5, null));
        lista.insertar(new Nodo(2, null), 1);
        lista.imprimir();

        Cola cola = new Cola();
        cola.encolar(new Nodo(3, null));
        cola.encolar(new Nodo(7, null));
        cola.encolar(new Nodo(1, null));
        cola.desencolar();
        cola.imprimir();

        Pila pila = new Pila();
        pila.apilar(new Nodo(4, null));
        pila.apilar(new Nodo(6, null));
        pila.apilar(new Nodo(8, null));
        pila.desapilar();
        pila.imprimir();
    }
}