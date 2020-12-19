package examen2_jorgevega;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
Jorge Vega
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

    public void setPERSONAS(ArrayList<Clase_Clientes> PERSONAS) {
        this.CLIENTS = PERSONAS;
    }

    public File getFILE() {
        return FILE;
    }

    public void setFILE(File FILE) {
        this.FILE = FILE;
    }

    @Override
    public String toString() {
        return "LISTA_PERSONAS: " + CLIENTS;
    }


    public void setPERSONA(Clase_Clientes p) {
        this.CLIENTS.add(p);
    }

    public void LOADING() {
        try {            
            CLIENTS = new ArrayList();
            Clase_Clientes T;
            if (FILE.exists()) {
                FileInputStream ENTER
                    = new FileInputStream(FILE);
                ObjectInputStream OB
                    = new ObjectInputStream(ENTER);
                try {
                    while ((T = (Clase_Clientes) OB.readObject()) != null) {
                        CLIENTS.add(T);
                    }
                } catch (EOFException FFF) {
                }
                OB.close();
                ENTER.close();
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
