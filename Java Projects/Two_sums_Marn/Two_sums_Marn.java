import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import javax.swing.InputMap;

import java.lang.*;
import java.lang.reflect.Array;

public class Two_sums_Marn {
    /* The following program is designed for two purposes, to help develop my familiarity wih VSCode and to start demonstrating 
     * competency via Leetcode and other traditional whiteboard probems. All code is my own except otherwise noted. The purpose
     * of this program is to have the user specify an array size, input array elements, and then if the program finds the two 
     * elements of the array that add up to the target sum, it will print the first pair it finds. 
     * 
     * Copyleft, all wrongs reserved.
     */

     public static void main(String[] args) {
        //can't remember if I can use a single scanner or require two, we shall see!
        Scanner input = new Scanner(System.in);
        int array_size = 0;
        // Prompt user
        // Tried doing an exception handler but I haven't touched Java in a while and have forgotten. Will post a subsequent code snippet that shows that I
        // Actually do know how to handle exceptions.  
        while(true) {
            System.out.print("Welcome to Nick Marn's Array Sum Finder. Please designate the number of elements in the array: ");
            array_size = input.nextInt();
            if (array_size != 0) {
                break;
            }
            else {
                 
            }
        }
        // Instantiate and fill array w/ user input
        int[] main_array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            int array_num = i + 1;
            System.out.println("Enter element " + array_num + " of the array: ");
            main_array[i] = input.nextInt();
        }

        // This solution runs in O(n^2), not ideal! Can be improved

        int sum_to_be_checked = 0;

        System.out.println("Please enter an integer greater to see if the first combination of elements in this array that add up to this value: ");

        sum_to_be_checked = input.nextInt();

        for (int j = 0; j < main_array.length; j++) {
            for (int k = 0; k < main_array.length; k++) {
                if (j == k) {

                }
                else if (sum_to_be_checked == main_array[j] + main_array[k]) {
                    System.out.println("The numbers " + main_array[j] + " and " + main_array[k] + "produce the requested sum of " + sum_to_be_checked + ".");
                    return;
                }
                else {

                }
            }

        }

        // end case if no solution is found
        System.out.println("The desired sum of " + sum_to_be_checked + " could not be achieved. Sorry!");



     }

    private static void input_one_check() {
    }

    private static void input_task_one() {
    }


}