/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

class AscendSortFreq{
    double[] A;
    public AscendSortFreq(double[] A) {
        this.A = A;
    }
    
    double AscendSort(double[] A){
       double temp=0;
       for(int i=0; i < A.length; i++){  
          for(int j=A.length-1; j >i ; j--){  
            if(A[j] < A[j-1]){  
                temp = A[j];  
                A[j] = A[j-1];  
                A[j-1] = temp;  
                }         
            }  
         }    

    }
   
}
/**
 *
 * @author LAB_621
 */
public class Lab4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
