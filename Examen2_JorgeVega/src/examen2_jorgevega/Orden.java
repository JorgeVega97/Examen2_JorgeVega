package examen2_jorgevega;

import java.io.Serializable;

/**
Jorge Vega
 */

public class Orden implements Serializable{
    private int TIME;
    private String COMPLE;
    public int N_ORDEN;
    
    private static final long SerialVersionUID=475L;


    public Orden(int TIME, String COMPLE, int N_ORDEN) {
        this.TIME = TIME;
        this.COMPLE = COMPLE;
        this.N_ORDEN = N_ORDEN;
    }

    public int getN_ORDEN() {
        return N_ORDEN;
    }

    public void setN_ORDEN(int N_ORDEN) {
        this.N_ORDEN = N_ORDEN;
    }
    
    public int getTIME() {
        return TIME;
    }

    public void setTIME(int TIME) {
        this.TIME = TIME;
    }

    public String getCOMPLE() {
        return COMPLE;
    }

    public void setCOMPLE(String COMPLE) {
        this.COMPLE = COMPLE;
    }

    @Override
    public String toString() {
        return  COMPLE ;
    }
    
    
           
}
