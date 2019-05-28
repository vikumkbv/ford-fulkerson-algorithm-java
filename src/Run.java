/* *****************************************************************************
 *  Name:    Vikum Sanjeewa Kottalbadde
 *  UOW ID:  w1673669
 *	IIT ID:  2017116
 *  Work: Algorithm Course Work
 *
 *  Description:  Java program for finding max flow
 *
 *  Written:       10/03/2019
 *  Last updated:  13/04/2019
 *
 *  Reference:  https://www.geeksforgeeks.org/ford-fulkerson-algorithm-for-maximum-flow-problem
 *  Reference:  https://www.geeksforgeeks.org/max-flow-problem-introduction/
 *  Reference:  https://www.tutorialspoint.com/Ford-Fulkerson-Algorithm
 *
 *  % javac Run.java
 *  % java Run
 *  Max, Flow
 *
 **************************************************************************** */

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Run {

    public static void main(String[] args) {
        /*
         * for auto generate data
         */
        int[][] graph = new int[AlgoCwMaximumFlow.vvv][AlgoCwMaximumFlow.vvv]; // initialize the graph using 2d array with random numbers (vertices)
        int min = 5; //minimum value for generating data
        int max = 21; //maximum value for generating data

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (i != j) // prevent generation to the same node
                    //generate data to array(graph)
                    graph[i][j] = AlgoCwMaximumFlow.r.nextInt(max - min) + min;
            }
        }

        /*
         * for manually input data to graph
         */


        /*int[][] graph = new int[][]{

                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},   //maxflow 4 from lecture slide
                {0, 0, 9, 0, 0, 0},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}

                {0, 10, 0, 10, 0,  0},
                {0,  0, 4,  2, 8,  0},
                {0,  0, 0,  0, 0, 10},  //maxflow 19 from tutorialspoint.com
                {0,  0, 0,  0, 9,  0},
                {0,  0, 6,  0, 0, 10},
                {0,  0, 0,  0, 0,  0}

                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},    //maxflow 23 data from geeksforgeeks.com
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}


                {0, 20, 15, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 6, 0, 0, 14, 0},  //maxflow 15 data by me
                {0, 0, 19, 0, 0, 12},
                {0, 0, 0, 4, 0, 3},
                {0, 0, 0, 0, 0, 0}


        };*/
        AlgoCwMaximumFlow m = new AlgoCwMaximumFlow(); //create the instance of AlgoCwMaximumFlow class

        System.out.println("The Number of vertices : " + AlgoCwMaximumFlow.vvv + "\n");
        System.out.println(">>> Data for the Graph <<<\n");
        PrintGraph.print2D(graph);

        int valueOfT = (AlgoCwMaximumFlow.vvv - 1); //To store the value of end node

        long startTime = System.nanoTime();
        System.out.println("\n\nThe maximum flow of the graph is = " + m.maxFlowFind(graph, 0, valueOfT));
        long endTime = System.nanoTime();

        Object efficientPathFlow = Collections.max(AlgoCwMaximumFlow.flowList);
        System.out.println("Flow of most efficient path is : " + efficientPathFlow);
        System.out.println("The Number of vertices for the graph is : " + AlgoCwMaximumFlow.vvv + "\n");


        long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
        //Same duration in millis
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in milli seconds
        long durationInSeconds = TimeUnit.MILLISECONDS.toSeconds(durationInMillis);
        System.out.println("Completion time in nano seconds : " +durationInNano);
        System.out.println("Completion time in milli seconds : " +durationInMillis);
        System.out.println("Completion time in seconds : " +durationInSeconds);

    }

}
