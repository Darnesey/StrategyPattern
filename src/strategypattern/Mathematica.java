/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author James Hunter
 */
public class Mathematica extends MathSoftware{
    
    ISortingBehavior sortBehavior = new InsertionSort();
    
}
