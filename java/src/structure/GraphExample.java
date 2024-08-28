package structure;

import java.util.ArrayList;
import java.util.List;

public class GraphExample {

    public static void main(String[] args) {

        int vertices = 5;
        int[][] array = new int[vertices][vertices];

        // 1. Initialize a graph
        array[0][1] = 1;
        array[1][0] = 1;
        array[0][2] = 1;
        array[2][0] = 1;
        array[1][2] = 1;
        array[2][1] = 1;
        array[1][3] = 1;
        array[3][1] = 1;
        array[2][3] = 1;
        array[3][2] = 1;

        // 2. Access elements

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        List<List<Integer>> graphList = new ArrayList<>();

        // Initialize the list of lists
        for (int i = 0; i < vertices; i++) {
            graphList.add(new ArrayList<>());
        }

        // Add edges
        graphList.get(0).add(1);
        graphList.get(1).add(0);
        graphList.get(0).add(2);
        graphList.get(2).add(0);
        graphList.get(1).add(2);
        graphList.get(2).add(1);
        graphList.get(1).add(3);
        graphList.get(3).add(1);
        graphList.get(2).add(3);
        graphList.get(3).add(2);


        for (int i = 0; i < vertices; ++i) {
            System.out.print(i + " -> ");
            for (Integer node : graphList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

    }
}
