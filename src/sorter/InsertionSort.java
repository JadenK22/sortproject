/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author dunca
 */
public class InsertionSort {
    
    public static void main(String [] args) {
        
        Integer [] sfd = {5,2,2,7,9,9,1,5,2,3,5,2,5,6,8,7,12};
        sort(sfd);
        for (int i = 0; i < sfd.length; i++)   {
            System.out.println(sfd[i]);
        }
        
    }
    
    
    
    
    public static void sort(Comparable [] comp)   {
        //loop through the array upwards (except for first term, as it is already sorted)
        for (int i = 1; i < comp.length; i++)  {
            //set new int j to the current comparable term
            int j = i;
            //while j is not 0 (lower end of the array) and the array at one term lower than j is bigger than j
            //swap terms
            while (j > 0 && comp[j - 1].compareTo(comp [j]) > 0) {
                //swap the two terms
                Comparable b = comp[j - 1];
                comp[j - 1] = comp[j];
                comp[j] = b;
                //subtract 1 from j
                j--;
            }
            
            
        }
        
        
    }
    
    
    
    
}
