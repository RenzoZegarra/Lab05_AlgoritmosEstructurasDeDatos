package Ejercicios;

import java.util.*;

public class FuncionesListas {
    public static <T> boolean buscarElemento(List<T> lista, T valor) {
        return lista.contains(valor);
    }

    public static <T> List<T> invertirLista(List<T> lista) {
        List<T> invertida = new ArrayList<>(lista);
        Collections.reverse(invertida);
        return invertida;
    }
}
