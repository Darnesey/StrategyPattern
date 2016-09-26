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
public class BubbleSort implements ISortingBehavior {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // BUBBLE
    public static int[] bubbleSort(int[] unsorted){
        sortSteps = new SortSteps();
        Step step;
        for (int i = 1; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length -i; j++) {
                if (unsorted[j] > unsorted[j+1]){
                    step = new Step();
                    step.arrayBefore = unsorted.clone();
                    step.type = "swap";
                    step.start = j;
                    step.end = j+1;
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                    step.arrayAfter = unsorted.clone();
                    sortSteps.addStep(step);
                } else {
                    step = new Step();
                    step.arrayBefore = step.arrayAfter = unsorted.clone();
                    step.type = "compare";
                    step.start = j;
                    step.end = j+1;
                    sortSteps.addStep(step);
                }
            }
        }
        return unsorted;
    }
    
}
