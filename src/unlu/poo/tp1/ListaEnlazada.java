package unlu.poo.tp1;

public class ListaEnlazada {
    private Nodo inicio;
    private int cantidadElementos = 0;

    public ListaEnlazada() {
        this.inicio = null;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int getCantidadElementos() {
        return this.cantidadElementos;
    }

    public void imprimir() {
        if (this.estaVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Elementos de la lista:");
            Nodo actual = this.inicio;
            while (actual != null) {
                System.out.println(actual.getClave());
                actual = actual.getSiguiente();
            }
        }
    }

    public void agregar(Nodo nodo) {
        if (this.inicio == null) {
            this.inicio = nodo;
        } else {
            Nodo actual = this.inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
        this.cantidadElementos++;
        System.out.println("Elemento agregado: " + nodo.getClave());
    }

    public void eliminar(int clave) {
        if (this.estaVacia()) {
            System.out.println("No se puede eliminar el elemento. La lista esta vacia.");
            return;
        }

        Nodo actual = this.inicio;

        if (actual.getClave() == clave) {
            this.inicio = actual.getSiguiente();
            this.cantidadElementos--;
            System.out.println("Elemento eliminado: " + clave);
        }

        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getClave() == clave) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                this.cantidadElementos--;
                System.out.println("Elemento eliminado: " + clave);
            } else {
                actual = actual.getSiguiente();
            }
        }
    }

    public Nodo recuperar(int pos) {
        if (pos > this.cantidadElementos || pos < 1) {
            System.out.println("No se puede recuperar el elemento. La posición no existe.");
            return null;
        }

        int posActual = 1;
        Nodo actual = this.inicio;
        while (actual != null) {
            if (posActual == pos) {
                return actual;
            }
            posActual++;
            actual = actual.getSiguiente();
        }

        return null;
    }

    public Nodo buscar(int clave) {
        Nodo actual = this.inicio;
        while (actual != null) {
            if (actual.getClave() == clave) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void insertar(Nodo nodo, int pos) {
        if (pos < 1) {
            System.out.println("No se puede insertar el elemento. La posición no es válida.");
            return;
        }

        if (pos > this.cantidadElementos) {
            this.agregar(nodo);
            System.out.println("Elemento " + nodo.getClave() + " insertado en la última posición.");
            return;
        }

        if (pos == 1) {
            nodo.setSiguiente(this.inicio);
            this.inicio = nodo;
            return;
        }

        int posActual = 1;
        Nodo actual = this.inicio;
        while (actual != null) {
            if (posActual == pos - 1) {
                nodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nodo);
                System.out.println("Elemento " + nodo.getClave() + " insertado en la posición " + pos);
                return;
            }
            posActual++;
            actual = actual.getSiguiente();
        }
    }
}
