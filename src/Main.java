import unlu.poo.tp1.*;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1, null);
        lista.agregar(2, "sarasa");
        lista.agregar(3, null);
        lista.agregar(4, "asddasd");
        lista.eliminar(3);
        lista.imprimir();
        System.out.println(lista.recuperar(3).getValor());
        System.out.println(lista.buscar(2).getValor());
    }
}