

package Clases;

/**
 *
 * @author Pablo Fernando
 */
public class Contacto {
    String nombre;
    int telefono;
    
    public Contacto(String n, int telf){
        this.nombre=n;
        this.telefono=telf;
    }

    public Contacto() {
    }
    
    public void Nombre(String n){
        this.nombre=n;
    }
    public void Telefono(int telf){
        this.telefono=telf;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public int obtenerTelef(){
        return this.telefono;
    }
    
}
    

