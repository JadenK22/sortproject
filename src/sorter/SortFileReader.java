/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 072698376
 */
public class SortFileReader {
    
    File file;

    public SortFileReader(String f) {
        file = new File(f);
    }

    public int fileLength(File file) {
        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        int lineCount = 0;
        while (s.hasNextLine()) {
            s.nextLine();
            lineCount++;
        }
        s.close();
        return lineCount;
    }
}
