/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author 072698376
 */
public class BubbleSearch {

    public void bubbleSearch(int[] test) {
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
