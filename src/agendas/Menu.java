package agendas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nahu
 */
public class Menu{
    private List<Persona> agenda; // es una lista que contiene objetos de la clase "Persona"
    private Scanner scanner; //se utiliza para leer la entrada del usuario desde la consola.

    public Menu() {
        agenda = new ArrayList<>(); // crea una lista vacía que puede contener objetos de la clase "Persona"
        scanner = new Scanner(System.in);
    }

    public void displayMenu() { //menú de visualización (switch)
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona por documento");
            System.out.println("3. Listar todas las personas");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    listaPersona();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    private void agregarPersona() { //Agregar personas
        System.out.println("Ingrese los datos de la persona:");
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Documento: ");
        long documento = scanner.nextLong();
        
        System.out.println("Ingrese la fecha de nacimiento en el formato 'yyyy-MM-dd HH:mm:ss':");
        scanner.nextLine(); // Limpiar el búfer del teclado
        String fechaNacimientoStr = scanner.nextLine();
        LocalDateTime fechaDeNacimiento = LocalDateTime.parse(fechaNacimientoStr);



        Persona persona = new Persona(nombre, apellido, documento, fechaDeNacimiento);
        agenda.add(persona); //agrega elementos a la lista "agenda" utilizando métodos como "add()"

        System.out.println("Persona agregada exitosamente.");
    }

    private void buscarPersona() { //busca las personas mediante el documento
        System.out.print("Ingrese el documento de la persona a buscar: ");
        long documento = scanner.nextLong();

        for (Persona persona : agenda) { //":" itera sobre una estructura de datos iterable, como un arreglo (array) o una colección.
            if (persona.getDocumento()== documento) { //comparar la igualdad de dos objetos en función de su contenido
                System.out.println("Persona encontrada:");
                System.out.println(persona);
                return;
            }
        }

        System.out.println("Persona no encontrada.");
    }

    private void listaPersona() { //Muestra la lista de personas guardadas en la agenda, si es que hay
        if (agenda.isEmpty()) {
            System.out.println("No hay personas en la agenda.");
        } else {
            System.out.println("Lista de personas:");
            for (Persona persona : agenda) {
                System.out.println(persona);
            }
        }
    }

    
}
