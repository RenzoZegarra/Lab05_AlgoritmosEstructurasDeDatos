import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do 
        {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar y Transferir tarea");
            System.out.println("3. Verificar si cierta tarea existe");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Invertir lista de tareas");
            System.out.println("6. Mostrar tareas completadas");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Ingrese el título de la tarea: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea (número): ");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();
                    gestor.agregarTarea(new Tarea(titulo, prioridad));
                    System.out.println("Tarea agregada correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el título de la tarea a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    if (gestor.eliminarTarea(tituloEliminar)) 
                    {
                        System.out.println("Tarea eliminada y enviada a tareas completadas.");
                    } 
                    else 
                    {
                        System.out.println("No se encontró la tarea para eliminar.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el título de la tarea a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    if (gestor.contieneTarea(tituloBuscar)) 
                    {
                        System.out.println("La tarea existe.");
                    } 
                    else 
                    {
                        System.out.println("La tarea no fue encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Tareas actuales:");
                    gestor.imprimirTareas();
                    break;
                case 5:
                    gestor.invertirTareas();
                    System.out.println("Lista de tareas invertida.");
                    break;
                case 6:
                    System.out.println("Tareas completadas:");
                    gestor.imprimirTareasCompletadas();
                    break;
                case 7:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
