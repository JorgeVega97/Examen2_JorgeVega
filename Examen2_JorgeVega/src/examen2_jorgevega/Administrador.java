package examen2_jorgevega;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
Jorge  Vega
 */
public class Administrador {
    private ArrayList<Clase_Clientes> CLIENTS = new ArrayList();
    private File FILE = null;

    public Administrador(String path) {
        FILE = new File(path);
    }

    public ArrayList<Clase_Clientes> getPERSONAS() {
        return CLIENTS;
    }

    public void setListaPERSONAS(ArrayList<Clase_Clientes> PERSONS) {
        this.CLIENTS = PERSONS;
    }

    public File getFILE() {
        return FILE;
    }

    public void setFILE(File FILE) {
        this.FILE = FILE;
    }

    @Override
    public String toString() {
        return "LISTA_PERSONAS" + CLIENTS;
    }

    public void setPERSONA(Clase_Clientes p) {
        this.CLIENTS.add(p);
    }

    public void LOADING() {
        try {            
            CLIENTS = new ArrayList();
            Clase_Clientes temp;
            if (FILE.exists()) {
                FileInputStream P
                    = new FileInputStream(FILE);
                ObjectInputStream objeto
                    = new ObjectInputStream(P);
                try {
                    while ((temp = (Clase_Clientes) objeto.readObject()) != null) {
                        CLIENTS.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                P.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void WRITE() {
        FileOutputStream LLL = null;
        ObjectOutputStream VVV = null;
        try {
            LLL = new FileOutputStream(FILE);
            VVV = new ObjectOutputStream(LLL);
            for (Clase_Clientes t : CLIENTS) {
                VVV.writeObject(t);
            }
            VVV.flush();
        } catch (Exception ex) {
        } finally {
            try {
                VVV.close();
                LLL.close();
            } catch (Exception ex) {
            }
        }
    }
}
