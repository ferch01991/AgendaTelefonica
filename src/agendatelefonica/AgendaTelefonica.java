package agendatelefonica;

import Clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pablo Fernando
 */
public class AgendaTelefonica {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Contacto c = new Contacto();
        Agenda a = new Agenda();
        a.addContactos(c);
        a.delContacto();
        a.listContactos();
        a.findContacto();
//        int opciones;
//
//        do {
//
//            System.out.println("1. Para Añadir contactos\n");
//            System.out.println("2. eliminar contatcos\n");
//            System.out.println("3. listar contactos\n");
//            System.out.println("4. encontar cotactos\n");
//            System.out.println("5. salir");
//            System.out.println("Ingrese la opcion");
//            opciones = l.nextInt();
//            Contacto c = new Contacto();
//            Agenda a = new Agenda();
//            switch (opciones) {
//                case 1:
//                    a.addContactos();
//                    break;
//                case 2:
//                    a.delContacto();
//                    break;
//                case 3:
//                    a.listContactos();
//                    break;
//                case 4:
//                    a.findContacto();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Ingrese una opcion correcta");
//                    break;
//            }
//        } while (opciones != 5);

    }

}
