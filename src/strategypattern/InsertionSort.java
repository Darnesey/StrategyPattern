/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.ArrayList;

/**
 *
 * @author James Hunter
 */
public class InsertionSort implements ISortingBehavior {

    @Override
    public int[] sort(int[] numbers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static int[] insertionSort(int[] unsorted){
        for (int i = 1; i < unsorted.length; i++) {
            for(int j = i; j > 0 && unsorted[j] < unsorted[j-1]; j--) {
                int temp = unsorted[j];
                unsorted[j] = unsorted[j-1];
                unsorted[j-1] = temp;
            }
        }
        return unsorted;
    }
    
}
