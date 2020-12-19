package examen2_jorgevega;

import java.io.Serializable;
import java.util.ArrayList;

/**
Jorge Vega
 */

public class Clase_Clientes implements Serializable{
    private String NOMBRE;
    private ArrayList <Orden> ORDENES = new ArrayList();
    
    
    private static final long SerialVersionUID=555L;

    public Clase_Clientes() {
    }
    
    public Clase_Clientes(String NOMBRE, ArrayList <Orden> ORDENES) {
        this.NOMBRE = NOMBRE;
        this.ORDENES = ORDENES;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public ArrayList<Orden> getORDENES() {
        return ORDENES;
    }

    public void setORDENES(ArrayList<Orden> ORDENES) {
        this.ORDENES = ORDENES;
    }

    @Override
    public String toString() {
        return "CLIENTES{" + "NOMBRE: " + NOMBRE + ", LISTA_ORDENES: " + ORDENES + '}';
    }
    
    
    
}
