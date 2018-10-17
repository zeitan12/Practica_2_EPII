/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is2pabloaledon;
import is2pabloaledon.Objeto;
import is2pabloaledon.Usuario;
import java.util.Date;
/**
 *
 * @author alumno
 */
public class Alquiler {
    private Objeto objeto;
    //private Usuario alquilado;
    private int alquilado;
    private float coste;
    private Date fechaini;
    private Date fechafin;
    
    public Alquiler(Objeto o, int a, float coste, Date fechaini, Date fechafin){
        this.objeto = o;
        this.alquilado = a;
        this.coste = coste;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
    }
    
    public Alquiler(){
        
    }
    
    public Objeto getObjeto(){
        return objeto;
    }
    
    public int getAlquilado(){
        return alquilado;
    }
    
    public float getImporte(){
        return coste;
    }
    
    public Date getFechaIni(){
        return fechaini;
    }
    
    public Date getFechaFin(){
        return fechafin;
    }
    
    public void setObjeto(Objeto o){
        this.objeto = o;
    }
    
    public void setAlquilado(int a){
        this.alquilado = a;
    }
    
    public void setImporte(int c){
        this.coste = c;
    }
    
    public void setFechaIni(Date fechaini){
        this.fechaini = fechaini;
    }
    
    public void setFechaFin(Date fechafin){
        this.fechafin = fechafin;
    }
    
    public void Mostrar(){
        System.out.println("Nombre del cliente: " + alquilado);
        System.out.println("Fechas del prestamo: " + fechaini + "-" + fechafin);
        System.out.println("Importe para el propietario: " + coste);   //FALTA VARIABLE
        System.out.println("importe para la Startup: " + coste * 0.1);        //FALTA VARIABLE
    }
}
