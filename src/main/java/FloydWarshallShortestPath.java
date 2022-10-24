/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Detz1
 */
// Floyd Warshall Algorithm in Java

// Floyd Warshall Algorithm in Java

import java.util.Scanner;
 
public class FloydWarshallShortestPath
{
    private int             distancematrix[][];
    private int             numberofvertices;
    public static final int INFINITY = 999;
 
    public FloydWarshallShortestPath(int numberofvertices)
    {
        distancematrix = new int[numberofvertices + 1][numberofvertices + 1];
        this.numberofvertices = numberofvertices;
    }
 
    public void floydwarshall(int adjacencymatrix[][])
    {
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                distancematrix[source][destination] = adjacencymatrix[source][destination];
            }
        }
        
        for (int intermediate = 1; intermediate <= numberofvertices; intermediate++)
        {
            for (int source = 1; source <= numberofvertices; source++)
            {
                for (int destination = 1; destination <= numberofvertices; destination++)
                {
                    if (distancematrix[source][intermediate]+ distancematrix[intermediate][destination] 
                        < distancematrix[source][destination]) distancematrix[source][destination] 
                        = distancematrix[source][intermediate]+ distancematrix[intermediate][destination];
                }
            }
        }
        
        
        for (int source = 1; source <= numberofvertices; source++)
            System.out.print("\t" + source);
        System.out.println();
        for (int source = 1; source <= numberofvertices; source++)
        {
            System.out.print(source + "\t");
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                System.out.print(distancematrix[source][destination] + "\t");
            }
            System.out.println();
        }
        
        
    }
      
    public static void main(String... arg)
    {
        int adjacency_matrix[][];
        int numberofvertices;
        Scanner scan = new Scanner(System.in);
        System.out.println("NUMERO DE VERTICES: ");
        numberofvertices = scan.nextInt();
        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
        System.out.println("Ingrese elementos: ");
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {   
                System.out.println("["+source+"]"+"["+destination+"]: ");
                adjacency_matrix[source][destination] = scan.nextInt();
                if (source == destination)
                {
                    adjacency_matrix[source][destination] = 0;
                    continue;
                }
                if (adjacency_matrix[source][destination] == 0)
                {
                    adjacency_matrix[source][destination] = INFINITY;
                }
            }
        }
        System.out.println("\n\n\t** RESULTADO ** \n");
        FloydWarshallShortestPath floydwarshall = new FloydWarshallShortestPath(numberofvertices);
        
        long inicio=0,fin=0;
        inicio = System.nanoTime();
        floydwarshall.floydwarshall(adjacency_matrix);
        fin =System.nanoTime();
        System.out.println("\nTIEMPO DE EJCUCION: "+(fin-inicio));
        scan.close();
    }
}