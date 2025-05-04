package Ejercicios;

public class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public static <T> void imprimirLista(Nodo<T> head) {
        Nodo<T> actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
