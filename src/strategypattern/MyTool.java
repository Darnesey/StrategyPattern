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
public class MyTool extends MathSoftware{

    public MyTool() {
        sortBehavior = new MergeSort();
    }
}
