/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/

public class Main
{


    public static void main(String[] args) {
        int numDiscs = 3; // Change this value to the number of discs you want to use
        towerOfHanoi(numDiscs, 'A', 'C', 'B');
    }

    // Function to solve Tower of Hanoi problem
    public static void towerOfHanoi(int numDiscs, char source, char destination, char auxiliary) {
        // Base case: If there is only one disc, move it from source to destination
        if (numDiscs == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        // Move (numDiscs-1) discs from source to auxiliary rod using destination as auxiliary
        towerOfHanoi(numDiscs - 1, source, auxiliary, destination);

        // Move the remaining disc from source to destination
        System.out.println("Move disc " + numDiscs + " from " + source + " to " + destination);

        // Move the (numDiscs-1) discs from auxiliary to destination rod using source as auxiliary
        towerOfHanoi(numDiscs - 1, auxiliary, destination, source);
    }


}
/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/

public class Main
{


    public static void main(String[] args) {
        int numDiscs = 3; // Change this value to the number of discs you want to use
        towerOfHanoi(numDiscs, 'A', 'C', 'B');
    }

    // Function to solve Tower of Hanoi problem
    public static void towerOfHanoi(int numDiscs, char source, char destination, char auxiliary) {
        // Base case: If there is only one disc, move it from source to destination
        if (numDiscs == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        // Move (numDiscs-1) discs from source to auxiliary rod using destination as auxiliary
        towerOfHanoi(numDiscs - 1, source, auxiliary, destination);

        // Move the remaining disc from source to destination
        System.out.println("Move disc " + numDiscs + " from " + source + " to " + destination);

        // Move the (numDiscs-1) discs from auxiliary to destination rod using source as auxiliary
        towerOfHanoi(numDiscs - 1, auxiliary, destination, source);
    }


}
