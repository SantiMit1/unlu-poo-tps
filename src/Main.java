import unlu.poo.tp1.*;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.eliminar(3);
        System.out.println(lista.recuperar(3).getValor());
        lista.imprimir();
    }
}