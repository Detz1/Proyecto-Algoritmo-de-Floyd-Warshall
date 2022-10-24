
package Proyecto;

// INTEGRANTES:
// -Tolentino Zuñiga Deiby
// -Matias Bardales Edinson


public class Intento01 extends javax.swing.JFrame {
    public static final int INFINITY = 999;
    String txt,time;
    int matriz_01[][],caminos[][],cont1,cont2, nVertices =0;
    
    public Intento01() {
        initComponents();
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
        lbl_.setText(" -");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btn_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbl_camino))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_de, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lbl_, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(text_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_element, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_enviar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btn_ejecutar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nv)
                    .addComponent(n_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_empezar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_element)
                    .addComponent(n_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enviar)
                    .addComponent(btn_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_)
                    .addComponent(text_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_camino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    class FloydWarshall
{
    private int             matriz[][];
    private int             numberofvertices;
    public static final int INFINITY = 999;
 
    public FloydWarshall(int numberofvertices)
    {
        matriz = new int[numberofvertices + 1][numberofvertices + 1];
        this.numberofvertices = numberofvertices;
    }
 
    public void Operando(int ans[][],int path[][]){  //Recibe 2 parametros

        // Implementar el algoritmo en una matriz de copia de modo que la adyacencia no es destruido.
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                matriz[source][destination] = ans[source][destination];
            }
        }
        
        for (int i = 1; i < path.length; i++) {  
            for (int j = 1; j < path.length; j++) {
                if (matriz[i][j] == 999) {
                    path[i][j] = -1;
                } else {
                    path[i][j] = i;
                }
            }
        }
        
        for (int i = 1; i < path.length; i++) {
            path[i][i] = i;
        }
        
        for (int k = 1; k <=numberofvertices; k++) {

            // Es así que entre cada par de puntos posibles.
            for (int i =1; i <=numberofvertices; i++) {
                for (int j = 1; j <=numberofvertices; j++) {

                    if (ans[i][k] + ans[k][j] < ans[i][j]) {
                        
                        ans[i][j] = ans[i][k] + ans[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }

        int cont=0;      //Encabezados de la matriz a mostrar
        for (int source = 0; source <= numberofvertices; source++)
        {   
            for (int destination = 0; destination <= numberofvertices; destination++)
            {
             ans[cont][destination]=destination;
             ans[destination][cont]=destination;
            }
        }
    }
}
    
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
                new Intento01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_calcular;
    private javax.swing.JButton btn_ejecutar;
    private javax.swing.JButton btn_empezar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_;
    private javax.swing.JLabel lbl_camino;
    private javax.swing.JLabel lbl_element;
    private javax.swing.JLabel lbl_nv;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField n_elemento;
    private javax.swing.JTextField n_vertice;
    private javax.swing.JTextArea print_matriz;
    private javax.swing.JTextArea print_matriz2;
    private javax.swing.JTextField text_de;
    private javax.swing.JTextField text_hasta;
    private javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables
}
