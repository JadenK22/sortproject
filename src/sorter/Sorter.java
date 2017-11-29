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
        BubbleSearch b = new BubbleSearch();
        int[] test = new int[99];

        for (int i = 0; i < test.length; i++) {
            test[i] = r.nextInt(500);
        }
        b.bubbleSearch(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    //JADEN'S METHOD
    
}
