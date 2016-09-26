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
public class MergeSort implements ISortingBehavior {

    public MergeSort() {
    }

    
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static Integer[] getleft(Integer[] num){
        Integer[]left=new Integer[num.length/2];
        for (int i = 0; i < left.length; i++) {
            left[i]=num[i];
        }
        return left;
    }
    private static boolean isOdd(Integer num){
        if (num %2==1)
            return true;
        else return false;

    }
    private static Integer[] getright(Integer[] num){
        Integer[]right;
        if (isOdd(num.length)){
            right=new Integer[num.length/2+1];
        } else {
            right = new Integer[num.length / 2];
        }
        for (int i = 0; i < right.length; i++) {
            right[i]=num[i + (num.length/2)];
        }
        return right;
    }

    public static Integer[] mergeSort(Integer[] num){
        sortSteps = new SortSteps();
        if ( num.length == 1 )
            return num;
        Integer[] left = mergeSort(getleft(num));
        Integer[] right = mergeSort(getright(num));
        return merge(left,right);
    }

    private static Integer[] merge(Integer[] first, Integer[] second){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>(Arrays.asList((first)));
        ArrayList<Integer>l2=new ArrayList<>(Arrays.asList((second)));
        while (!l1.isEmpty() && !l2.isEmpty()){
            if (l1.get(0)>l2.get(0)){
                list.add(l2.remove(0));
            }else {
                list.add(l1.remove(0));
            }
        }
        while (!l1.isEmpty()) {
            list.add(l1.remove(0));
        }
        while (!l2.isEmpty()) {
            list.add(l2.remove(0));
        }
        return list.toArray(new Integer[list.size()]);
    }
    
}
