
package Proyecto;

// INTEGRANTES:
// -Tolentino Zuñiga Deiby
// -Matias Bardales Edinson

import javax.swing.table.DefaultTableModel;

public class ProyectoFloyd extends javax.swing.JFrame {
    public static final int INFINITY = 999;
    String txt,time;
    int matriz_01[][],caminos[][],cont1,cont2, nVertices =0;
    DefaultTableModel model = new DefaultTableModel();
    
    
    
    public ProyectoFloyd() {
        initComponents();
        model.addColumn("Vertices");
        model.addColumn("Inicio");
        model.addColumn("Fin");
        model.addColumn("Resultado");
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_nv = new javax.swing.JLabel();
        n_vertice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        print_matriz = new javax.swing.JTextArea();
        lbl_element = new javax.swing.JLabel();
        btn_empezar = new javax.swing.JButton();
        n_elemento = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        btn_ejecutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        print_matriz2 = new javax.swing.JTextArea();
        lbl_camino = new javax.swing.JLabel();
        text_de = new javax.swing.JTextField();
        text_hasta = new javax.swing.JTextField();
        lbl_ = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        lbl_resultado = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        n_tabla = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        lbl_titulo.setText("  Floyd-Warshall Algorithm");

        lbl_nv.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lbl_nv.setText(" Numero de vertices: ");

        print_matriz.setColumns(20);
        print_matriz.setRows(5);
        jScrollPane1.setViewportView(print_matriz);

        lbl_element.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        lbl_element.setText("Elemento :");

        btn_empezar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btn_empezar.setText("Empezar");
        btn_empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empezarActionPerformed(evt);
            }
        });

        n_elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_elementoActionPerformed(evt);
            }
        });

        btn_enviar.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_ejecutar.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        btn_ejecutar.setText("EJECUTAR");
        btn_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ejecutarActionPerformed(evt);
            }
        });

        print_matriz2.setColumns(20);
        print_matriz2.setRows(5);
        jScrollPane2.setViewportView(print_matriz2);

        lbl_camino.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        lbl_camino.setText("Camino mas corto: ");

        lbl_.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_.setText(" --");

        txt_resultado.setColumns(20);
        txt_resultado.setRows(5);
        jScrollPane3.setViewportView(txt_resultado);

        lbl_resultado.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        lbl_resultado.setText("RESULTADOS:");

        btn_calcular.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_calcular.setText("Calcular...");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        n_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vertices", "Inicio", "Fin", "Resultado"
            }
        ));
        jScrollPane4.setViewportView(n_tabla);

        btn_clear.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btn_clear.setText("LIMPIAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(n_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(lbl_element, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(n_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_enviar)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btn_ejecutar)
                                        .addGap(39, 39, 39)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbl_resultado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_camino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_de, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nv)
                            .addComponent(n_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_empezar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_enviar)
                            .addComponent(n_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_element)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_calcular)
                            .addComponent(text_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_camino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void n_elementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_elementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_elementoActionPerformed

    private void btn_empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empezarActionPerformed
                                                      //BOTON EMPEZAR
        nVertices=Integer.parseInt(this.n_vertice.getText().trim()); //Crear Matriz
        matriz_01 = new int[ nVertices+ 1][nVertices + 1];
        caminos = new int[ nVertices+ 1][nVertices + 1];
        
        cont1=1; //Valores a los contadores
        cont2=1;
        txt="";
        time="";
        
        this.print_matriz.setText("");
        this.n_elemento.setText("");
        this.print_matriz.setText(""); 
        this.print_matriz2.setText(""); 
        this.txt_resultado.setText("");    
    }//GEN-LAST:event_btn_empezarActionPerformed
  
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
                                                  //BOTON ENVIAR
        if(cont2>nVertices){   //Enviar elementos a la matriz
            cont1++;
            cont2=1;
            txt=txt+"\n";
        }
        if(cont2<=nVertices){
            matriz_01[cont1][cont2]=Integer.parseInt(this.n_elemento.getText().trim());
            txt=txt + matriz_01[cont1][cont2]+" - ";
            cont2++;
        }
        
        this.print_matriz.setText(txt);
        this.n_elemento.setText("");       
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ejecutarActionPerformed
        
        //BOTON EJECUTAR
        txt="";
        long inicio=0,fin=0;
        
        FloydWarshall floydwarshall = new FloydWarshall(nVertices);
        
        inicio = System.nanoTime();
        floydwarshall.Operando(matriz_01,caminos);  
        fin =System.nanoTime();  
        
        time="Tiempo de ejecucion: "+(fin-inicio);
        
        for (int m = 0; m <= nVertices; m++){  //Copiar la matriz en txt(String)
            for (int n = 0; n <= nVertices; n++){
                txt=txt+matriz_01[m][n]+"\t";
            }
            txt=txt+"\n";
        } 
        
        model.addRow(new Object[]{nVertices,inicio,fin,fin-inicio});
        n_tabla.setModel(model);
         this.print_matriz2.setText(txt); //Mostrar txt en txt Area2
         this.txt_resultado.setText(time);  //Motrar tiempo de ejecucion en txtAreaResultado
    }//GEN-LAST:event_btn_ejecutarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        
        this.txt_resultado.setText("");
        
        int start = Integer.parseInt(this.text_de.getText().trim());
        int end = Integer.parseInt(this.text_hasta.getText().trim());
        
        int x=start,y=end;
        String myPath = end + "";
        
        // Recorrer cada vértice anterior hasta que vuelvas a empezar.
        while (caminos[start][end] != start) {
            myPath = caminos[start][end] + " -> " + myPath;
            end = caminos[start][end];
        }

        // Sólo tiene que añadir comienzo de nuestra cadena y de impresión.
        myPath = start + " -> " + myPath;
        this.txt_resultado.setText(time+"\n\nDel "+x+" al "+y+"\n"+myPath+"\tRpta: "+matriz_01[x][y]); 
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
          
        this.txt_resultado.setText("");
        this.n_vertice.setText("");
        this.model.setRowCount(0);
        n_tabla.setModel(model);
        this.print_matriz.setText("");
        this.print_matriz2.setText("");
        this.text_de.setText("");
        this.text_hasta.setText("");
        this.n_elemento.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Intento01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intento01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intento01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intento01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFloyd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_calcular;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_ejecutar;
    private javax.swing.JButton btn_empezar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_;
    private javax.swing.JLabel lbl_camino;
    private javax.swing.JLabel lbl_element;
    private javax.swing.JLabel lbl_nv;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField n_elemento;
    private javax.swing.JTable n_tabla;
    private javax.swing.JTextField n_vertice;
    private javax.swing.JTextArea print_matriz;
    private javax.swing.JTextArea print_matriz2;
    private javax.swing.JTextField text_de;
    private javax.swing.JTextField text_hasta;
    private javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables
}


//BENSHMARKING