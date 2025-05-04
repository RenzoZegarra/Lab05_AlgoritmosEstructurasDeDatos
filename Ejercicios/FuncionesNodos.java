package Ejercicios;

public class FuncionesNodos {
    public static <T> void insertarAlFinal(Nodo<T> head, T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        Nodo<T> actual = head;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public static <T> int contarNodos(Nodo<T> head) {
        int contador = 0;
        Nodo<T> actual = head;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public static <T> boolean sonIguales(Nodo<T> l1, Nodo<T> l2) {
        while (l1 != null && l2 != null) {
            if (!l1.dato.equals(l2.dato)) {
                return false;
            }
            l1 = l1.siguiente;
            l2 = l2.siguiente;
        }
        return l1 == null && l2 == null;
    }

    public static <T> Nodo<T> concatenarListas(Nodo<T> l1, Nodo<T> l2) {
        if (l1 == null) return l2;
        Nodo<T> cabeza = new Nodo<>(l1.dato);
        Nodo<T> actual = cabeza;
        l1 = l1.siguiente;
        while (l1 != null) {
            actual.siguiente = new Nodo<>(l1.dato);
            actual = actual.siguiente;
            l1 = l1.siguiente;
        }
        while (l2 != null) {
            actual.siguiente = new Nodo<>(l2.dato);
            actual = actual.siguiente;
            l2 = l2.siguiente;
        }
        return cabeza;
    }
}
