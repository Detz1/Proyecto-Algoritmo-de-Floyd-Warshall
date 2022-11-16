/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Detz1
 */
public class FloydWarshall
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
