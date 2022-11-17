

// Corresponde a Denis Lewis Johna(bloguero)

package FloydWarshall;
import java.util.Scanner;

/**
 *
 * @author Denis,Lewis,Johna
 */
public class FloydWarshall_02 {
    
    
    public static int[][] shortestpath(int[][] adj, int[][] path) {
        
        int n = adj.length;
        int[][] ans = new int[n][n];

        // Implementar el algoritmo en una matriz de copia de modo que la adyacencia no es
        //destruido.
        
        copy(ans, adj);

        // Calcular rutas sucesivamente a través de una mejor k vértices.
        for (int k = 0; k < n; k++) {
            // Es así que entre cada par de puntos posibles.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (ans[i][k] + ans[k][j] < ans[i][j]) {

                        ans[i][j] = ans[i][k] + ans[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }

        // Devuelva la matriz camino más corto.
        return ans;
    }

    //Copia el contenido del array b en un array. Se asume que tanto a como
    //B es una matriz 2D de dimensiones idénticas.
    public static void copy(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

    // Devuelve el menor de a y b.
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Pruebas fuera con algoritmo gráfico mostrado en clase.
        int[][] m = new int[5][5];
        m[0][0] = 0;
        m[0][1] = 3;
        m[0][2] = 10;
        m[0][3] = 10000;
        m[0][4] = 10000;
        m[1][0] = 3;
        m[1][1] = 0;
        m[1][2] = 10000;
        m[1][3] = 5;
        m[1][4] = 10000;
        m[2][0] = 10;
        m[2][1] = 10000;
        m[2][2] = 0;
        m[2][3] = 6;
        m[2][4] = 15;
        m[3][0] = 10000;
        m[3][1] = 5;
        m[3][2] = 6;
        m[3][3] = 0;
        m[3][4] = 4;
        m[4][0] = 10000;
        m[4][1] = 10000;
        m[4][2] = 10000;
        m[4][3] = 4;
        m[4][4] = 0;

        int[][] shortpath;
        int[][] path = new int[5][5];

        // Inicializar con el vértice anterior para cada borde. -1 indica
        // no tal vertice.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == 10000) {
                    path[i][j] = -1;
                } else {
                    path[i][j] = i;
                }
            }
        }

        // Esto significa que no tiene que ir a ninguna parte para ir de i a i.
        for (int i = 0; i < 5; i++) {
            path[i][i] = i;
        }
        
        long inicio=0,fin=0;
        inicio = System.nanoTime();
        shortpath = shortestpath(m, path);
        fin =System.nanoTime();

        //Imprime distancias más cortas.
        
        System.out.println("\n\n\t** RESULTADO ** \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(shortpath[i][j] + "\t");
            }
            System.out.println();
        }
        /*System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(path[i][j] + "\t");
            }
            System.out.println();
        }*/
        
        System.out.println("\nTIEMPO DE EJCUCION: "+(fin-inicio));

        System.out.println("\nDe dónde a dónde usted quiere encontrar el camino más corto?(0 to 4)");
        int start = stdin.nextInt();
        int end = stdin.nextInt();

        // La ruta finalizará siempre en fin.
        String myPath = end + "";

        // Recorrer cada vértice anterior hasta que vuelvas a empezar.
        while (path[start][end] != start) {
            myPath = path[start][end] + " -> " + myPath;
            end = path[start][end];
        }

        // Sólo tiene que añadir comienzo de nuestra cadena y de impresión.
        myPath = start + " -> " + myPath;
        System.out.println("Este es el camino " + myPath);
        // TODO code application logic here
    }
}
