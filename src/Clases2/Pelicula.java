
package Clases2;

/**
 *
 * @author Pablo Fernando
 */
public class Pelicula {
    public String codigo;
    String nombre;
    String genero;
    int cantDiscos;
    int venta;
   // int cantFaltante;
    public Pelicula(){}
    
    public Pelicula(String cod, String n, String g, int cant){
        this.codigo = cod;
        this.nombre = n;
        this.genero = g;
        this.cantDiscos = cant;
        
    }
    
    public void Codigo(String cod){
        this.codigo = cod;
    }
    public void Nombre(String n){
        this.nombre = n;
    }
    public void Genero(String g){
        this.genero = g;
    }
    public void Cantidad(int cant){
        this.cantDiscos = cant;
       
    }
    public void indivarVenta(int c1,int c2){
        this.cantDiscos=c1;
        this.venta = c2;
         if(this.cantDiscos == 0){
            System.out.println("No se puede vender");
        }else{
            if(this.cantDiscos >0){
                this.venta = this.cantDiscos-this.venta;
            }
        }
    }
    
//    public void mostrarPelicylasFaltantes(int can){
//        this.cantFaltante = can;
//        if(this.cantFaltante==0){
//            
//        }
//    }
    
    public String obtenerCodigo(){
        return this.codigo;
    }
    
    public String obtenerNombre(){
       return  this.nombre;
    }
    
    public String obtenerGenero(){
        return  this.genero;
    }
    
    public int obtenerCantidad (){
        return this.cantDiscos;
    }
    public int obtenerVenta(){
        return this.venta;
    }
    
}
