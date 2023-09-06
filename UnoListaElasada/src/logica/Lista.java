package logica;

public class Lista{
    Nodo inicio = null;

    public boolean estaVacia() {
        return inicio == null;
    }

    public int longitud() {
        Nodo nodoAct = inicio;
        int n = 0;

        while (nodoAct != null) {
            n++;
            nodoAct = nodoAct.getSiguiente();
        }

        return n;
    }

    public void agregar(Object valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (this.estaVacia()) {
            inicio = nuevoNodo;
        } else {
            Nodo nodoAct = inicio;

            while (nodoAct.getSiguiente() != null) {
                nodoAct = nodoAct.getSiguiente();
            }
            nodoAct.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(Object valor) {
        if (this.estaVacia()) {
            return;
        }

        if (inicio.getValor().equals(valor)) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo nodoAct = inicio;

        while (nodoAct.getSiguiente() != null && !nodoAct.getSiguiente().getValor().equals(valor)) {
            nodoAct = nodoAct.getSiguiente();
        }

        if (nodoAct.getSiguiente() != null) {
            nodoAct.setSiguiente(nodoAct.getSiguiente().getSiguiente());
        }
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= this.longitud()) {
            return;
        }
        if (indice == 0) {
            inicio = inicio.getSiguiente();
        } else {
            Nodo nodoAct = inicio;

            for (int i = 0; i < indice - 1; i++) {
                nodoAct = nodoAct.getSiguiente();
            }

            nodoAct.setSiguiente(nodoAct.getSiguiente().getSiguiente());
        }
    }

    public Object recuperar(int indice) {
        if (indice < 0 || indice >= this.longitud()) {
            return null;
        }

        Nodo nodoAct = inicio;

        for (int i = 0; i < indice; i++) {
            nodoAct = nodoAct.getSiguiente();
        }

        return nodoAct.getValor();
    }

    public void insertar(Object valor, int indice) {
        if (indice < 0 || indice > this.longitud()) {
            return;
        }

        if (indice == 0) {
            Nodo nodoNuevo = new Nodo(valor);
            nodoNuevo.setSiguiente(inicio);
            inicio = nodoNuevo;
        } else {
            Nodo nodoAct = inicio;

            for (int i = 0; i < indice - 1; i++) {
                nodoAct = nodoAct.getSiguiente();
            }

            Nodo nodoNuevo = new Nodo(valor);
            nodoNuevo.setSiguiente(nodoAct.getSiguiente());
            nodoAct.setSiguiente(nodoNuevo);
        }
    }

    public void mostrar() {
        Nodo nodoAct = inicio;
        System.out.println("Mostrando Lista: ");

        while (nodoAct != null && nodoAct.getValor() != null) {
            System.out.println(nodoAct.getValor());
            nodoAct = nodoAct.getSiguiente();
        }
        System.out.println();
    }
}
