/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Lab4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        int n=input.nextInt();
        int m=input.nextInt();
        int max=0;
        int[] res=new int[2];
        int[][] A=new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j]=input.nextInt();
            }
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<m; j++){
                if(Math.abs(A[i][j]-A[i+1][j])<=10){
                    if(A[i][j]+A[i+1][j] > max){
                        max= A[i][j]+A[i+1][j];
                        res[0]=i+1;
                        res[1]=j+1;
                    }
                }
            }
        }
        
        System.out.println(" ");
        System.out.println(res[0]+" "+res[1]);
    }   
}
