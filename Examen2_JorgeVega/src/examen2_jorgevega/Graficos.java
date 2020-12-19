package examen2_jorgevega;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
Jorge Vega
 */
public class Graficos extends javax.swing.JFrame {

    public Graficos() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo_complement = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        comple = new javax.swing.JList<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_agre = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        or = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel1.setText("INGRESE EL NOMBRE");

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel3.setText("ELIJA EL COMPLEMENTO");

        combo_complement.setBackground(new java.awt.Color(153, 153, 255));
        combo_complement.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        combo_complement.setForeground(new java.awt.Color(204, 0, 0));
        combo_complement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensalada de Papa", "Pechuga de pollo", "Pierna de pollo", "Papas fritas", "Pure", "Refresco", "Te", "Agua", "Pie de Manzana", "Nachos", "Hamburguesa" }));

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comple.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(comple);

        jProgressBar1.setForeground(new java.awt.Color(51, 255, 51));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel4.setText("COMPLEMENTO AGREGADOS");

        t_agre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.ORDER", "ELEMENTO", "ESTIMADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(t_agre);

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel5.setText("ESTADO DE LA ORDEN");

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel6.setText("ORDEN N.#");

        or.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GUARDAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VER ORDEN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("FACTURA");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(combo_complement, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton1))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_complement, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (combo_complement.getSelectedIndex() == 0) {
            DefaultListModel one = (DefaultListModel) comple.getModel();
            Orden eleme = new Orden(1, "Ensalada de Papa", Integer.parseInt(or.getText()));        
            one.addElement(eleme);
            comple.setModel(one);
        }if (combo_complement.getSelectedIndex() == 1) {
            DefaultListModel two = (DefaultListModel) comple.getModel();
            Orden eleme = new Orden(2, "Pechuga de pollo", Integer.parseInt(or.getText()));       
            two.addElement(eleme);
            comple.setModel(two);
        }if (combo_complement.getSelectedIndex() == 2) {
            DefaultListModel three = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(3, "Pierna de pollo", Integer.parseInt(or.getText()));
            three.addElement(elem);
            comple.setModel(three);
        }if (combo_complement.getSelectedIndex() == 3) {
            DefaultListModel four = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(4, "Papas fritas", Integer.parseInt(or.getText()));
            four.addElement(elem);
            comple.setModel(four);
        }if (combo_complement.getSelectedIndex() == 4) {
            DefaultListModel five = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(5, "Pure", Integer.parseInt(or.getText()));      
            five.addElement(elem);
            comple.setModel(five);
        }if (combo_complement.getSelectedIndex() == 5) {
            DefaultListModel six = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(6, "Refresco", Integer.parseInt(or.getText()));
            six.addElement(elem);
            comple.setModel(six);
        }if (combo_complement.getSelectedIndex() == 6) {
            DefaultListModel seven = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(7, "Te", Integer.parseInt(or.getText()));
            seven.addElement(elem);
            comple.setModel(seven);
        }if (combo_complement.getSelectedIndex() == 7) {
            DefaultListModel eingth = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(8, "Agua", Integer.parseInt(or.getText()));
            eingth.addElement(elem);
            comple.setModel(eingth);
        }if (combo_complement.getSelectedIndex() == 8) {
            DefaultListModel nine = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(9, "Pie de Manzana", Integer.parseInt(or.getText()));
            nine.addElement(elem);
            comple.setModel(nine);
        }if (combo_complement.getSelectedIndex() == 9) {
            DefaultListModel Ten = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(10, "Nachos", Integer.parseInt(or.getText()));
            Ten.addElement(elem);
            comple.setModel(Ten);
        }if (combo_complement.getSelectedIndex() == 10) {
            DefaultListModel eleven = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(11, "Hamburguesa", Integer.parseInt(or.getText()));
            eleven.addElement(elem);
            comple.setModel(eleven);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        DefaultListModel captura = (DefaultListModel) comple.getModel();
        try {

            ArrayList<Orden> COM = new ArrayList();

            for (int i = 0; i < captura.size(); i++) {
                Orden p = (Orden) captura.get(i);
                COM.add(p);
            }
            Administrador a = new Administrador("./CLINETE.abc");
            a.LOADING();
            if (a.getPERSONAS().isEmpty()) {
                String NN = nom.getText();
                Clase_Clientes c = new Clase_Clientes(NN, COM);
                a.getPERSONAS().add(c);
                a.WRITE();
            } else {
                boolean confir = false;
                Administrador t = new Administrador("./CLINETE.abc");
                t.LOADING();
                String nomm = nom.getText();
                for (int i = 0; i < t.getPERSONAS().size(); i++) {
                    if (nomm.equals(t.getPERSONAS().get(i).getNOMBRE())) {
                        for (int j = 0; j < COM.size(); j++) {
                            Orden o = COM.get(j);
                         /*   t.getPERSONAS().get(i).getListaOrdenes().add(o);*/
                        }
                        confir = true;
                    }
                }
                t.WRITE();
                if (!confir) {
                    Administrador j = new Administrador("./CLINETE.abc");
                    nomm = nom.getText();
                    Clase_Clientes c = new Clase_Clientes(nomm, COM);
                    j.LOADING();
                    j.getPERSONAS().add(c);
                    j.WRITE();
                }
            }
            JOptionPane.showMessageDialog(this, "SE GUARDO CON EXITO");
            nom.setText("");
            or.setText("");
            comple.removeAll();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "VUELVA A INTENTARLO");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultTableModel g = (DefaultTableModel) t_agre.getModel();
        Administrador P = new Administrador("./CLINETE.abc");
        P.LOADING();
        for (int i = 0; i < P.getPERSONAS().size(); i++) {
            Clase_Clientes h = P.getPERSONAS().get(i);
            for (int j = 0; j < h.getCAPTURA_DE_ORDENES().size(); j++) {
                Orden k = h.getCAPTURA_DE_ORDENES().get(j);
                Object[] ob = {k.getN_ORDEN(), k.getCOMPLE(), k.getTIME()};
                g.addRow(ob);
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_complement;
    private javax.swing.JList<String> comple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom;
    private javax.swing.JFormattedTextField or;
    private javax.swing.JTable t_agre;
    // End of variables declaration//GEN-END:variables
}
