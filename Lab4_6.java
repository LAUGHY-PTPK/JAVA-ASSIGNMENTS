/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_6;
import java.util.*;

class point{
    double[][] xy;
    double size;
    point(double[][] xy,double size){
        this.xy=xy;
        this.size=size;
    }
    
    double near(){
        double min=10000000000.0;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                double res=Math.sqrt(((xy[i][0]-xy[j][0])*(xy[i][0]-xy[j][0]))+((xy[i][1]-xy[j][1])*(xy[i][1]-xy[j][1])));
                if(res<min){
                    min=res;
                }
            }
        }
        return min;
    }
}
/**
 *
 * @author LAB_621
 */
public class Lab4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        double[][] xy=new double[n][2];
        for(int i=0; i<n; i++){
           for(int j=0; j<2; j++){
               xy[i][j]=input.nextDouble();
           }
        }
        point p=new point(xy,n);
        double c=p.near();
        System.out.printf("\n%.2f ",c);
    }
    
}
