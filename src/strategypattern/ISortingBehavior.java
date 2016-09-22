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
public interface ISortingBehavior {
    
    // Doesn't matter what we use for the array
    public ArrayList<Integer> sort(ArrayList<Integer> numbers);
}
