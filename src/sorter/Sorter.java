/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import java.util.Random;

/**
 *
 * @author 072698376
 */
public class Sorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Bubble Search
        Random r = new Random();
        int[] test = new int[7];

        for (int i = 0; i < test.length; i++) {
            test[i] = r.nextInt(500);
        }
        bubbleSearch(test);
        for (int i = 0; i < (test.length - 1); i++) {
            System.out.print(test[i] + ", ");
        }
        System.out.print(test[test.length]);
    }

    public static void bubbleSearch(int[] test) {
        for (int i = 0; i < test.length; i++) {
            int swapsDone = 0;
            for (int j = 0; j < (test.length - 1); j++) {
                if (test[j] > test[j + 1]) {
                    int temp = test[j + 1];
                    test[j + 1] = test[j];
                    test[j] = temp;
                    swapsDone++;
                }
            }
            if (swapsDone == 0) {
                break;
            }
        }
    }
}
