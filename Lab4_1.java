/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

/**
 *
 * @author LAB_621
 */
public class Lab4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={-128,65,-235,99,0,26};
        Lab4_1 b = new Lab4_1();
        //int minIndex= b.findMinIdx(a);
        int minIndex= b.findMaxIdx(a);
        System.out.println("min value is a["+minIndex+"]="+a[minIndex]);
    }
    /*
    public int findMinIdx(int[] a){
        int k,minIdx=0;
        for(k=1; k<a.length; k++){
            if(a[k]<a[minIdx]){
                minIdx=k;
            }
        }
        return minIdx;
    } */
    public int findMaxIdx(int[] a){
        int k,maxIdx=0;
        for(k=1; k<a.length; k++){
            if(a[k]>a[maxIdx]){
                maxIdx=k;
            }
        }
        return maxIdx;
    } 
}
