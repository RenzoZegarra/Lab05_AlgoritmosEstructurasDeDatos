public class Nodo<T> 
{
    private T dato;
    private Nodo<T> next;

    public Nodo(T dato, Nodo<T> next) 
    {
        this.dato = dato;
        this.next = next;
    }

    public Nodo(T dato) 
    {
        this(dato, null);
    }

    public Nodo() 
    {
        this(null, null);
    }

    public T getDato() 
    {
        return dato;
    }

    public void setDato(T dato) 
    {
        this.dato = dato;
    }

    public Nodo<T> getNext() 
    {
        return next;
    }

    public void setNext(Nodo<T> next) 
    {
        this.next = next;
    }

    @Override
    public String toString() 
    {
        return dato != null ? dato.toString() : null;
    }
}
