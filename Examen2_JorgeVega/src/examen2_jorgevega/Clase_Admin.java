package examen2_jorgevega;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
Jorge Vega
 */
public class Clase_Admin {
    
    private ArrayList<Clase_Clientes> ORDENESS = new ArrayList();
    private File FILE = null;

    public Clase_Admin(String path) {
        FILE = new File(path);
    }

    public File getFILE() {
        return FILE;
    }

    public void setFILE(File FILE) {
        this.FILE = FILE;
    }

    public ArrayList<Clase_Clientes> getORDENESS() {
        return ORDENESS;
    }

    public void setORDENESS(ArrayList<Clase_Clientes> ORDENESS) {
        this.ORDENESS = ORDENESS;
    }

    @Override
    public String toString() {
        return "" + ORDENESS;
    }

    public void setORDENES(Clase_Clientes p) {
        this.ORDENESS.add(p);
    }

    public void WRITE() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(FILE, false);
            bw = new BufferedWriter(fw);
            for (Clase_Clientes t : ORDENESS) {
                bw.write(t.getNombre()+ "/");
                bw.write(t.getListaOrdenes()+ "/");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void LOADING() {
        Scanner sc = null;
        ORDENESS = new ArrayList();
        if (FILE.exists()) {
            try {
                sc = new Scanner(FILE);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    ORDENESS.add(new Clase_Clientes(sc.next(),sc.nextLine()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
