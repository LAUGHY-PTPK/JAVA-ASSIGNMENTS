/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_7;
import java.util.*;
/**
 *
 * @author ACER
 */
public class Lab4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n]; 
        
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }
        System.out.printf("%d ",findMin(arr, n)); 
    }
    
    public static int Min_Recur(int arr[], int i, int sumCal,int sumTotal) 
    { 
        if (i == 0){
            return Math.abs((sumTotal-sumCal) - sumCal); 
        } 
        else {
            return Math.min(Min_Recur(arr, i-1, sumCal + arr[i-1], sumTotal), 
                            Min_Recur(arr, i-1, sumCal, sumTotal));
        }
    } 
    
    public static int findMin(int arr[], int n) 
    { 
        int sumTotal = 0; 
        for (int i = 0; i < n; i++) 
            sumTotal += arr[i]; 
        return Min_Recur(arr, n, 0, sumTotal); 
    } 
}
