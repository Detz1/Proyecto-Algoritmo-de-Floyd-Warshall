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
    private int             distancematrix[][];
    private int             numberofvertices;
    public static final int INFINITY = 999;
 
    public FloydWarshall(int numberofvertices)
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
        long inicio=0,fin=0;
        inicio=System.nanoTime();
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
        fin=System.nanoTime();
        
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
        
        System.out.println("\nTIEMPO DE EJECUCION: "+(fin-inicio));
    }
}
