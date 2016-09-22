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
public abstract class MathSoftware {
 
    public ISortingBehavior sortBehavior;
    
    public void setSortStrategy(ISortingBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }
    
    public void mathSort(ArrayList<Integer> numbers){
        numbers = sortBehavior.sort(numbers);
        // print here or return?
    }
}
