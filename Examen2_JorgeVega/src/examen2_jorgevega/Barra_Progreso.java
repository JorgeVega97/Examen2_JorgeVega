package examen2_jorgevega;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
Jorge Vega
 */
public class Barra_Progreso extends Thread {

    private JProgressBar progress_b;
    private JTable TT;
    private Orden Order;

    public Barra_Progreso() {
    }

    public Barra_Progreso(JProgressBar progress_b, JTable TT, Orden Order) {
        this.progress_b = progress_b;
        this.TT = TT;
        this.Order = Order;
    }

    @Override
    public void run() {
        int acum = 0;
      
    }
}
