import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumSpanningTree {
        public static void main (String[]args) {

            //enables input from user
            Scanner input = new Scanner(System.in);

            int [][] cost = {//the table of connections
                    //indexes:
                    //A     B     C      D      E      F      G       H      I
                    //0     1     2      3      4      5      6       7      8
                    { 32000,     9, 32000, 32000, 32000,    14, 32000, 32000, 32000},  //0A
                    { 9,     32000,    10, 32000,    14,    12, 32000, 32000, 32000},  //1B
                    { 32000,    10, 32000,     8,    13, 32000, 32000, 32000, 32000},  //2C
                    { 32000, 32000,     8, 32000,    16, 32000, 32000,    17, 32000},  //3D
                    { 32000,    14,    13,    16, 32000, 32000,    15, 32000,    11},  //4E
                    { 14,       12, 32000, 32000, 32000, 32000,     5, 32000,     7},  //5F
                    { 32000, 32000, 32000, 32000,    15,     5, 32000,    12,     6},  //6G
                    { 32000, 32000, 32000,    17, 32000, 32000,    12, 32000, 32000},  //7H
                    { 32000, 32000, 32000, 32000,    11,     7,     6, 32000, 32000}   //8I
            };

            //ask user for a house to start in
        System.out.println("Choose a house to start in, and the program will find the cheapest travel:\n" +
                            "A: 0\n" +
                            "B: 1\n" +
                            "C: 2\n" +
                            "D: 3\n" +
                            "E: 4\n" +
                            "F: 5\n" +
                            "G: 6\n" +
                            "H: 7\n" +
                            "I: 8\n" +
                            "Enter house to start in: ");

            //variable from user input
            int startHouse = input.nextInt();

            while (startHouse < 0 || startHouse > 8){

                //print error message to user if user plots invalid number
                System.out.println("Please choose a value between 0 and 8: ");

                //program finds new value
                startHouse = input.nextInt();

            }//while ends

            //runs the findCost method
            findCost(cost, startHouse);

        }//main method ends

        public static void findCost (int [][] cost, int num) {

            //list holding information if the houses is visited
                                //A      B      C      D      E      F      G      H      I
            boolean[] chosen = {false, false, false, false, false, false, false, false, false};

            //sets the chosen house to true
            chosen[num] = true;

            //array holding the names of the houses
            String[] houses = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

            //List to hold the distances travelled
            List<String> chosenHouse = new ArrayList<>();

            //variables set to 0
            int k = 0;
            int l = 0;
            int tot = 0;
            //min is set to 32000 to make it easier to find the minimum
            int min = 32000;

            for(int i = 0; i < cost.length - 1; i++) {
                for (int r = 0; r < cost.length; r++) {
                    for (int c = 0; c < cost.length; c++) {

                        if (chosen[r] && !chosen[c] && cost[r][c] < min) {
                            //if the current house haven't been chosen yet, the if will check if the current value is the smallest of the connections

                            //remembering the place of the current minimum value
                            k = r;
                            l = c;

                            //min is resat to current value if it is smaller than the previous
                            min = cost[r][c];

                        }//if ends
                    }//inner for ends
                }//mid for ends

                //the smallest number for each distance is added to tot
                tot += cost[k][l];

                //the current chosen house is set to "true", to show it is already visited
                chosen[l] = true;

                //min is reset to 32000
                min = 32000;

                //add the connected houses
                chosenHouse.add(houses[k]);
                chosenHouse.add(houses[l]);
            }//outer for ends

            //prints the total cost for the travel
            System.out.println("The total cost is " + tot + " 000.");

            //int to show the current travel in the S.o.p.
            int trav = 0;

            //prints the travels in pair
            for (int i = 0; i < chosenHouse.size(); i += 2){
                trav += 1;
                System.out.println(trav + ". travel is from " + chosenHouse.get(i) + " to " + chosenHouse.get(i+1));
            }//for ends
        }//findCost method end
}//class end