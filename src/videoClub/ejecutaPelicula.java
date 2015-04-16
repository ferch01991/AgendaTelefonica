

package videoClub;

import Clases2.Pelicula;
import Clases2.videoClub;

/**
 *
 * @author Pablo Fernando
 */
public class ejecutaPelicula {
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        videoClub v = new videoClub();
        System.out.println("Ingresar peliculas");
        v.aniadirPelicula();
        System.out.println("***********************************");
        System.out.println("Eliminar pelicula");
        v.eliminarPelicula();
        System.out.println("***********************************");
        System.out.println("Listar peliculas");
        v.listarPeliculas();
        System.out.println("***********************************");
        System.out.println("Buscar pelicula");
        v.buscarPelicula();
        System.out.println("***********************************");
        System.out.println("Vender Pelicula");
        v.vender();
        System.out.println("***********************************");
        System.out.println("Mostrar peliculas cuta cantidad sea 0");
        v.MostrarFaltantes();
    }
}
