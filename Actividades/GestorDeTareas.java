import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas<T> 
{
    private Nodo<T> raiz;
    private List<T> tareasCompletadas = new ArrayList<>();

    public void agregarTarea(T tarea) 
    {
        Nodo<T> nuevo = new Nodo<>(tarea);
        if (raiz == null) 
        {
            raiz = nuevo;
        } 
        else 
        {
            Nodo<T> actual = raiz;
            while (actual.getNext() != null) 
            {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
    }

    
    public boolean eliminarTarea(String titulo) 
    {
        if (raiz == null) 
        {
            return false;
        }
    
        if (((Tarea)raiz.getDato()).getTitulo().equalsIgnoreCase(titulo)) 
        {
            tareasCompletadas.add(raiz.getDato());
            raiz = raiz.getNext();
            return true;
        }
    
        Nodo<T> actual = raiz;
        while (actual.getNext() != null) {
            if (((Tarea)actual.getNext().getDato()).getTitulo().equalsIgnoreCase(titulo)) 
            {
                tareasCompletadas.add(actual.getNext().getDato());
                actual.setNext(actual.getNext().getNext());
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }
    


    public boolean contieneTarea(String titulo) 
    {
        Nodo<T> actual = raiz;
        while (actual != null) 
        {
            if (((Tarea)actual.getDato()).getTitulo().equalsIgnoreCase(titulo)) 
            {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }
    

    public void imprimirTareas() 
    {
        Nodo<T> actual = raiz;
        while (actual != null) 
        {
            System.out.println(actual.getDato());
            actual = actual.getNext();
        }
    }

    public int contarTareas() 
    {
        int contador = 0;
        Nodo<T> actual = raiz;
        while (actual != null) 
        {
            contador++;
            actual = actual.getNext();
        }
        return contador;
    }

    public T obtenerTareaMasPrioritaria() 
    {
        if (raiz == null) return null;
        if (!(raiz.getDato() instanceof Tarea)) return null;

        Nodo<T> actual = raiz;
        Tarea tareaMayor = (Tarea) actual.getDato();
        actual = actual.getNext();

        while (actual != null) 
        {
            Tarea tareaActual = (Tarea) actual.getDato();
            if (tareaActual.getPrioridad() > tareaMayor.getPrioridad()) {
                tareaMayor = tareaActual;
            }
            actual = actual.getNext();
        }

        return (T) tareaMayor;
    }

    public void invertirTareas() 
    {
        Nodo<T> anterior = null;
        Nodo<T> actual = raiz;
        Nodo<T> siguiente;

        while (actual != null) {
            siguiente = actual.getNext();
            actual.setNext(anterior);
            anterior = actual;
            actual = siguiente;
        }
        raiz = anterior;
    }

    public void imprimirTareasCompletadas() 
    {
        System.out.println("Tareas completadas:");
        for (T tarea : tareasCompletadas) 
        {
            System.out.println(tarea);
        }
    }
}
