package Clases2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Fernando
 */
public class videoClub {

    Scanner l = new Scanner(System.in);
    String nombreVideoClub;
    String eliminar;
    Pelicula p;
    ArrayList<Pelicula> peliculas = null;

    public videoClub() {
    }

    public void aniadirPelicula() {
        peliculas = new ArrayList<Pelicula>();
        for (int i = 0; i < 4; i++) {
            p = new Pelicula();
            System.out.println("Ingrese el codigo de la pelicula: ");
            p.codigo = l.next();
            System.out.println("Ingrese el nombre de la pelicula: ");
            p.nombre = l.next();
            System.out.println("Ingrese el genero de la pelicula: ");
            p.genero = l.next();
            System.out.println("Ingrese la cantidad de peliculas: ");
            p.cantDiscos = l.nextInt();

            peliculas.add(new Pelicula(p.codigo, p.nombre, p.genero, p.cantDiscos));

        }
    }

    public void eliminarPelicula() {
        System.out.println("Ingrese el codigo de la pelicula que desea elimnar DVD");
        eliminar = l.next();
        boolean flag = false;
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).obtenerCodigo().equals(eliminar)) {
                flag = true;
                peliculas.remove(i);

            }

        }
        if (flag == true) {
            System.out.println("pelicula elimnada");
        } else {
            System.out.println("pelicula no encontrada");
        }
    }

    public void listarPeliculas() {
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println("Codigo: DVD" + peliculas.get(i).obtenerCodigo() + "\tnombre: " + peliculas.get(i).obtenerNombre() + "\tgenero: " + peliculas.get(i).obtenerGenero() + "\tcantidad: " + peliculas.get(i).obtenerCantidad());
            System.out.println("****************************************************************************************");
        }

    }

    public void buscarPelicula() {
        int opcion;
        String bCodigo, bNombre, bGenero;
        int bCantidad;
        System.out.println("Porque atributo desea buscar: ");
        System.out.println("1..POr codigo: ");
        System.out.println("2..POr nombre: ");
        System.out.println("3..Por genero: ");
        System.out.println("4..POr cantidad: ");
        System.out.println("5..Ingrese la opcion");
        opcion = l.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el codigo");
                bCodigo = l.next();
                for (int i = 0; i < peliculas.size(); i++) {
                    if (peliculas.get(i).obtenerCodigo().equals(bCodigo)) {
                        System.out.println("Buscar: " + peliculas.get(i).obtenerCodigo() + "\t" + peliculas.get(i).obtenerNombre() + "\t" + peliculas.get(i).obtenerGenero() + "\t" + peliculas.get(i).obtenerCantidad());
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese el nombre: ");
                bNombre = l.next();
                for (int i = 0; i < peliculas.size(); i++) {
                    if (peliculas.get(i).obtenerNombre().equals(bNombre)) {
                        System.out.println("Buscar: " + peliculas.get(i).obtenerCodigo() + "\t" + peliculas.get(i).obtenerNombre() + "\t" + peliculas.get(i).obtenerGenero() + "\t" + peliculas.get(i).obtenerCantidad());

                    }
                }
                break;
            case 3:
                System.out.println("Ingrese el genero de la pelicula: ");
                bGenero = l.next();
                for (int i = 0; i < peliculas.size(); i++) {
                    if (peliculas.get(i).obtenerGenero().equals(bGenero)) {
                        System.out.println("Buscar: " + peliculas.get(i).obtenerCodigo() + "\t" + peliculas.get(i).obtenerNombre() + "\t" + peliculas.get(i).obtenerGenero() + "\t" + peliculas.get(i).obtenerCantidad());

                    }
                }
                break;
            case 4:
                System.out.println("Ingrese la cantidad");
                bCantidad = l.nextInt();
                for (int i = 0; i < peliculas.size(); i++) {
                    if (peliculas.get(i).obtenerCantidad() == bCantidad) {
                        System.out.println("Buscar: " + peliculas.get(i).obtenerCodigo() + "\t" + peliculas.get(i).obtenerNombre() + "\t" + peliculas.get(i).obtenerGenero() + "\t" + peliculas.get(i).obtenerCantidad());

                    }
                }
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                break;
        }
    }

    public void vender() {
        int cont;
        String codigoCompra;
        System.out.println("Ingrese el codigo de la pelicula que desea adquirir: ");
        codigoCompra = l.next();
        System.out.println("Ingrese cuantas desea: ");
        cont = l.nextInt();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).obtenerCodigo().equals(codigoCompra)) {
                p.indivarVenta(peliculas.get(i).obtenerCantidad(), cont);
                System.out.println("codigo: "+peliculas.get(i).obtenerCodigo()+"\tnombre: "+peliculas.get(i).obtenerNombre() + "\tgenero: " + peliculas.get(i).obtenerGenero()+"\tcantidad: "+p.obtenerVenta());
              } 
        }
    }
    public void MostrarFaltantes(){
        boolean flag = false;
        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).obtenerCantidad()==0){
                flag = true;
                System.out.println("Codigo: DVD" + peliculas.get(i).obtenerCodigo() + "\tnombre: " + peliculas.get(i).obtenerNombre() + "\tgenero: " + peliculas.get(i).obtenerGenero() + "\tcantidad: " + peliculas.get(i).obtenerCantidad());

            }
            
        }
        if(flag == true){
            System.out.println("");
        }else{
            System.out.println("No exista ninguna pelicula que tenga una cantidad de 0");
        }
    }
}
