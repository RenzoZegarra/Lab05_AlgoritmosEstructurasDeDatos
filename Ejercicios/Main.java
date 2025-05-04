package Ejercicios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("¿Contiene 3? " + FuncionesListas.buscarElemento(lista, 3));
        System.out.println("Lista invertida: " + FuncionesListas.invertirLista(lista));

        Nodo<Integer> head = new Nodo<>(10);
        FuncionesNodos.insertarAlFinal(head, 20);
        FuncionesNodos.insertarAlFinal(head, 30);
        System.out.println("Cantidad de nodos: " + FuncionesNodos.contarNodos(head));

        Nodo<Integer> head2 = new Nodo<>(10);
        FuncionesNodos.insertarAlFinal(head2, 20);
        FuncionesNodos.insertarAlFinal(head2, 30);

        System.out.println("¿Son iguales? " + FuncionesNodos.sonIguales(head, head2));

        Nodo<Integer> concatenada = FuncionesNodos.concatenarListas(head, head2);
        System.out.print("Lista concatenada: ");
        Nodo.imprimirLista(concatenada);
    }
}
