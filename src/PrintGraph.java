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

import java.util.Arrays;

public class PrintGraph {

    /*
     * Method to print array into line by line
     * */
    public static void print2D(int[][] graph) {
        for(int[] row : graph){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }


}
