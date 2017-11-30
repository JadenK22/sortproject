/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 072698376
 */
public class BubbleSearch {

    SortFileReader r = new SortFileReader("stockdataunsorted.txt");
    String[] sortThis = new String[r.fileLength(r.file)];

    public void bubbleSort() throws IOException {
        scanIn(r.file);
        for (int i = 0; i < sortThis.length; i++) {
            int swapsDone = 0;
            for (int j = 0; j < (sortThis.length - 1); j++) {
                if (sortThis[j].compareTo(sortThis[j + 1]) > 0) {
                    String temp = sortThis[j + 1];
                    sortThis[j + 1] = sortThis[j];
                    sortThis[j] = temp;
                    swapsDone++;
                }
            }
            if (swapsDone == 0) {
                break;
            }
        }
    }

    public void scanIn(File f) throws IOException {
        Scanner s = new Scanner(f);
        for (int i = 0; i < sortThis.length; i++) {
            sortThis[i] = s.nextLine();
        }
        s.close();
    }
}
