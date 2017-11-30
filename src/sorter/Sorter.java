/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author 072698376
 */
public class Sorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        //Bubble Search
        BubbleSearch b = new BubbleSearch();
        b.bubbleSort();
        for (int i = 0; i < b.sortThis.length; i++) {
            System.out.println(b.sortThis[i]);
        }
    }

}
