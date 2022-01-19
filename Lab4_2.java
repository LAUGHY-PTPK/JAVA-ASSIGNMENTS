/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;
import java.lang.*;
/**
 *
 * @author ACER
 */
public class Lab4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 2.1
        double[100] r;
        for(int i=0; i<r.length(); i++);
            r(i)= Math.random *100;
        */
        
        /* 2.2
        int list[]={1,2,3,4,5,6};
        for(int i=1; i<list.length; i++)
            list[i]= list[i-1];
        
        for(int i=0; i<list.length; i++)
            System.out.print(list[i]+" ");
        */
        
        /* 2.3
        int number=0;
        int[] numbers= new int[1];
        m(number,numbers);
        System.out.println("number is"+ number +" and numbers[0] is"+numbers[0]);
    }
    public static void m(int x,int[] y){
        x=3;
        y[0]=3;
    }*/
        
        /*2.3
        int[] list={1,2,3,4,5,6};
        reverse(list);
        for(int i=0; i<list.length-1; i++)
                System.out.print(list[i] + " ");
    }
    public static void reverse(int[] list){
        int[] newList = new int[list.length];
        for(int i=0; i<list.length-1; i++)
            newList[i]=list[list.length-1-i];
            list= newList;
    }
    */
        /* 2.4
        int[][] array={{1,2},{3,4},{5,6}};
        for(int i=array.length-1; i>=0; i--){
            for(int j=array[i].length-1; j>=0; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }*/
        
        int[][] array ={{1,2,3,4},{5,6,7,8}};
        System.out.println(m1(array)[0]);
       System.out.println(m1(array)[1]);    
    }
    public static int[] m1(int[][] m){
        int[] result= new int[2];
       result[0]=m.length;
        result[1]=m[0].length;
        return result;
    }
}
