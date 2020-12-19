package examen2_jorgevega;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
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
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        mmm = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setText("INGRESE EL NOMBRE");

        NOMBRE.setBackground(new java.awt.Color(204, 204, 255));
        NOMBRE.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                NOMBREComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                NOMBREComponentRemoved(evt);
            }
        });
        NOMBRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NOMBREMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NOMBREMousePressed(evt);
            }
        });
        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });
        NOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NOMBREKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setText("ELIJA LOS COMPLEMENTOS");

        combo_complement.setBackground(new java.awt.Color(255, 204, 204));
        combo_complement.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        combo_complement.setForeground(new java.awt.Color(153, 0, 0));
        combo_complement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensalada de Papa", "Pechuga de pollo", "Pierna de pollo", "Papas fritas", "Pure", "Refresco", "Te", "Agua", "Pie de Manzana", "Nachos", "Hamburguesa" }));
        combo_complement.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_complementItemStateChanged(evt);
            }
        });
        combo_complement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_complementMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_complementMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton1ItemStateChanged(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comple.setBackground(new java.awt.Color(204, 204, 255));
        comple.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(comple);

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 0));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setText("COMPLEMENTOS AGREGADOS");

        t_agre.setBackground(new java.awt.Color(204, 204, 255));
        t_agre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDEN.N", "ELEMENTO", "ESTIMADO"
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

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel5.setText("ESTADO DE LA ORDEN");

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setText("ORDEN.N");

        or.setBackground(new java.awt.Color(204, 204, 255));
        or.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        or.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orMousePressed(evt);
            }
        });
        or.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GUARDAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("FACTURA");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VER ORDEN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        mmm.setBackground(new java.awt.Color(102, 102, 102));
        mmm.setColumns(20);
        mmm.setForeground(new java.awt.Color(255, 255, 255));
        mmm.setRows(5);
        jScrollPane3.setViewportView(mmm);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(204, 204, 255));
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(204, 204, 255));
        jLabel17.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(combo_complement, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_complement, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Orden eleme = new Orden(1, "Pechuga de pollo", Integer.parseInt(or.getText()));       
            two.addElement(eleme);
            comple.setModel(two);
        }if (combo_complement.getSelectedIndex() == 2) {
            DefaultListModel three = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(2, "Pierna de pollo", Integer.parseInt(or.getText()));
            three.addElement(elem);
            comple.setModel(three);
        }if (combo_complement.getSelectedIndex() == 3) {
            DefaultListModel four = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(3, "Papas fritas", Integer.parseInt(or.getText()));
            four.addElement(elem);
            comple.setModel(four);
        }if (combo_complement.getSelectedIndex() == 4) {
            DefaultListModel five = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(4, "Pure", Integer.parseInt(or.getText()));      
            five.addElement(elem);
            comple.setModel(five);
        }if (combo_complement.getSelectedIndex() == 5) {
            DefaultListModel six = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(5, "Refresco", Integer.parseInt(or.getText()));
            six.addElement(elem);
            comple.setModel(six);
        }if (combo_complement.getSelectedIndex() == 6) {
            DefaultListModel seven = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(6, "Te", Integer.parseInt(or.getText()));
            seven.addElement(elem);
            comple.setModel(seven);
        }if (combo_complement.getSelectedIndex() == 7) {
            DefaultListModel eingth = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(7, "Agua", Integer.parseInt(or.getText()));
            eingth.addElement(elem);
            comple.setModel(eingth);
        }if (combo_complement.getSelectedIndex() == 8) {
            DefaultListModel nine = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(8, "Pie de Manzana", Integer.parseInt(or.getText()));
            nine.addElement(elem);
            comple.setModel(nine);
        }if (combo_complement.getSelectedIndex() == 9) {
            DefaultListModel Ten = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(9, "Nachos", Integer.parseInt(or.getText()));
            Ten.addElement(elem);
            comple.setModel(Ten);
        }if (combo_complement.getSelectedIndex() == 10) {
            DefaultListModel eleven = (DefaultListModel) comple.getModel();
            Orden elem = new Orden(10, "Hamburguesa", Integer.parseInt(or.getText()));
            eleven.addElement(elem);
            comple.setModel(eleven);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
           
        
        
        DefaultListModel hh = (DefaultListModel) comple.getModel();
        try {

            ArrayList<Orden> elemen = new ArrayList();

            for (int i = 0; i < hh.size(); i++) {
                Orden p = (Orden) hh.get(i);
                elemen.add(p);
            }
            Administrador a = new Administrador("/.SAVE.abc");
            a.LOADING();
            if (a.getPERSONAS().isEmpty()) {
                String nom = NOMBRE.getText();
                Clase_Clientes Y = new Clase_Clientes(nom, elemen);
                a.getPERSONAS().add(Y);
                a.WRITE();
            } else {
                boolean confir = false;
                Administrador k = new Administrador("/.SAVE.abc");
                k.LOADING();
                String NOM = NOMBRE.getText();
                for (int i = 0; i < k.getPERSONAS().size(); i++) {
                    if (NOM.equals(k.getPERSONAS().get(i).getNOMBRE())) {
                        for (int j = 0; j < elemen.size(); j++) {
                            Orden OB = elemen.get(j);
                            k.getPERSONAS().get(i).getORDENES().add(OB);
                        }
                        confir = true;
                    }
                }
                k.WRITE();
                if (!confir) {
                    Administrador U = new Administrador("/.SAVE.abc");
                    NOM = NOMBRE.getText();
                    Clase_Clientes V = new Clase_Clientes(NOM, elemen);
                    U.LOADING();
                    U.getPERSONAS().add(V);
                    U.WRITE();
                }
            }
            JOptionPane.showMessageDialog(this, "SE GUARDO CON EXITO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "POR FAVOR VUELVA A INTENTARLO");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

       
        DefaultTableModel A = (DefaultTableModel) t_agre.getModel();
        Administrador B = new Administrador("/.SAVE.abc");
        B.LOADING();
        for (int i = 0; i < B.getPERSONAS().size(); i++) {
            Clase_Clientes C = B.getPERSONAS().get(i);
            for (int j = 0; j < C.getORDENES().size(); j++) {
                Orden OB = C.getORDENES().get(j);
                Object[] dd = {OB.getN_ORDEN(), OB.getCOMPLE(), OB.getTIME()};
                A.addRow(dd);
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       
        File FILEE = null;
        FileWriter QWW = null;
        BufferedWriter X = null;
        String NOM = NOMBRE.getText();
        try {
            FILEE = new File("./" + NOM + ".txt");

            QWW = new FileWriter(FILEE);
            X = new BufferedWriter(QWW);
   
            DefaultListModel CAPTURA = (DefaultListModel) comple.getModel();
            ArrayList<Orden> complemento = new ArrayList();
            for (int i = 0; i < CAPTURA.size(); i++) {
                Orden p = (Orden) CAPTURA.get(i);
                complemento.add(p);
            }
            Date DATE = new Date();
            SimpleDateFormat D = new SimpleDateFormat("yyyy/MM/dd");
            String DAY = D.format(DATE);
            String OR = or.getText();

            String linea = "Compra realizada el: " + DAY+ "\n"
                    + "Comprador: " + NOM + "\n"
                    + "N.Orden: " + OR + "\n"
                    + "Descripcion: " + complemento;
            
            mmm.setText(linea);
            X.write(linea);
            X.newLine();
            X.flush();
            JOptionPane.showMessageDialog(this, "FACTURA IMPRESA CORRECTAMENTE");
            mmm.setText("");
            or.setText("");
            NOMBRE.setText("");
            comple.removeAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        jLabel2.setBackground(new java.awt.Color(204,204,255));
        jLabel8.setBackground(new java.awt.Color(204,204,255));
        jLabel9.setBackground(new java.awt.Color(204,204,255));
        jLabel10.setBackground(new java.awt.Color(204,204,255));
        jLabel11.setBackground(new java.awt.Color(204,204,255));
        jLabel12.setBackground(new java.awt.Color(204,204,255));
        jLabel13.setBackground(new java.awt.Color(204,204,255));
        jLabel14.setBackground(new java.awt.Color(204,204,255));
        jLabel15.setBackground(new java.awt.Color(204,204,255));
        jLabel16.setBackground(new java.awt.Color(204,204,255));
        jLabel17.setBackground(new java.awt.Color(204,204,255));
    }//GEN-LAST:event_jButton4MouseClicked

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed

    private void NOMBREComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_NOMBREComponentAdded
              
    }//GEN-LAST:event_NOMBREComponentAdded

    private void NOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NOMBREKeyTyped
         jLabel8.setBackground(Color.GREEN); 
    }//GEN-LAST:event_NOMBREKeyTyped

    private void NOMBREComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_NOMBREComponentRemoved
         
    }//GEN-LAST:event_NOMBREComponentRemoved

    private void NOMBREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOMBREMouseClicked
       
    }//GEN-LAST:event_NOMBREMouseClicked

    private void orMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orMouseClicked
   
    }//GEN-LAST:event_orMouseClicked

    private void orKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orKeyTyped
      jLabel10.setBackground(Color.GREEN); 
    }//GEN-LAST:event_orKeyTyped

    private void combo_complementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_complementMouseClicked
   
    }//GEN-LAST:event_combo_complementMouseClicked

    private void combo_complementItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_complementItemStateChanged
        jLabel12.setBackground(Color.GREEN);
    }//GEN-LAST:event_combo_complementItemStateChanged

    private void jButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ItemStateChanged

    private void NOMBREMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOMBREMousePressed
       jLabel2.setBackground(Color.GREEN); 
    }//GEN-LAST:event_NOMBREMousePressed

    private void orMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orMousePressed
         jLabel9.setBackground(Color.GREEN);
    }//GEN-LAST:event_orMousePressed

    private void combo_complementMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_complementMousePressed
          jLabel11.setBackground(Color.GREEN); 
    }//GEN-LAST:event_combo_complementMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       jLabel13.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
      jLabel14.setBackground(Color.GREEN);   
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
      jLabel15.setBackground(Color.GREEN); 
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
       jLabel16.setBackground(Color.GREEN); 
       jLabel17.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton4MousePressed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Graficos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JComboBox<String> combo_complement;
    private javax.swing.JList<String> comple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea mmm;
    private javax.swing.JFormattedTextField or;
    private javax.swing.JTable t_agre;
    // End of variables declaration//GEN-END:variables
}
