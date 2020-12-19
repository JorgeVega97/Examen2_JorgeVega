package examen2_jorgevega;

import java.io.Serializable;
import java.util.ArrayList;

/**
Jorge Vega
 */

public class Clase_Clientes implements Serializable{
    private String NOMBRE;
    private ArrayList <Orden> CAPTURA_DE_ORDENES = new ArrayList();
    
    
    private static final long SerialVersionUID=475L;

    public Clase_Clientes() {
    }
    
    public Clase_Clientes(String NOMBRE, ArrayList <Orden> CAPTURA_DE_ORDENES) {
        this.NOMBRE = NOMBRE;
        this.CAPTURA_DE_ORDENES = CAPTURA_DE_ORDENES;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public ArrayList<Orden> getCAPTURA_DE_ORDENES() {
        return CAPTURA_DE_ORDENES;
    }

    public void setCAPTURA_DE_ORDENES(ArrayList<Orden> CAPTURA_DE_ORDENES) {
        this.CAPTURA_DE_ORDENES = CAPTURA_DE_ORDENES;
    }

    @Override
    public String toString() {
        return "CLIENTES{" + "NOMBRE: " + NOMBRE + ", LISTA_ORDENES: " + CAPTURA_DE_ORDENES + '}';
    }
    
    
    
}
