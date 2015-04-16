package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Fernando
 */
public class Agenda {

    Scanner l = new Scanner(System.in);
    String delNombre;
    String findContacto;
    Contacto contactos;
    ArrayList<Contacto> contacts = null;

    public void addContactos(Contacto c) {
        contacts = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            contactos = new Contacto();
            System.out.println("ingrese el nombre");
            contactos.nombre = l.next();
            System.out.println("ingrese el telefono");
            contactos.telefono = l.nextInt();
            contacts.add(new Contacto(contactos.nombre, contactos.telefono));

        }

    }

    public void listContactos() {

        //contacts.add(new Contacto(nombre, t));
        for (int i = 0; i < contacts.size(); i++) {

            System.out.println("nombre: " + contacts.get(i).obtenerNombre() + "\ttelefono: " + contacts.get(i).obtenerTelef());
            System.out.println("******************");

        }
    }

    public void delContacto() {

        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        delNombre = l.next();
        boolean flag = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).obtenerNombre().equals(delNombre)) {
                flag = true;
                contacts.remove(i);
            }
        }
        if(flag==true){
            System.out.println("contacto eliminado");
        }else{
            System.out.println(" no se encuentra contacto");
        }
    }


    public void findContacto() {
         System.out.println("Ingrese el nombre a buscar: ");
        findContacto = l.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).obtenerNombre().equals(findContacto)) {
                System.out.println("Buscar: "+contacts.get(i).obtenerNombre()+"\t"+contacts.get(i).obtenerTelef());

            }
        }
    }

}
