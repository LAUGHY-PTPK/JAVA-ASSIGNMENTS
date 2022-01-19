/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_9;
import java.util.*;
/**
 *
 * @author ACER
 */    
public class Lab4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int N=input.nextInt();
        int n =N*2-2;
        int[][] house=new int[N][N];
        int[] house_sorted=new int[N*N];
        int[] sorted_list= new int[n];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                house[i][j]=input.nextInt();
            }
        }
        
        /* Saving the 2D Array into a 1D Array */
        int x = 0;
        for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    house_sorted[x] = house[i][j];
                    x++;
                }
            }
        
        Arrays.sort(house_sorted);
        for(int i=0; i<n; i++){
                sorted_list[i]=house_sorted[(house_sorted.length-1)-i-1];
        }
        
        int sum=0,max=0,value=0,sum_de=0;
        
        for(int i=1; i<n+1; i++){
           /* int x = 0;
            for(int a=0;a<N;a++)
            {
                for(int b=0;b<N;b++)
                {
                    house_sorted[x] = house[a][b];
                    x++;
                }
            }
        
            Arrays.sort(house_sorted);
            for(int c=0; c<n-i; c++){
                sorted_list[c]=house_sorted[(house_sorted.length-1)-c-1];
            }
        */
            if(i==1) house[0][0]=-1;
            
            /*
            value=house[j][k];
            house[j][k]=-1;
            if(max<value) max=value;*/
            for(int j=N-1; j>=0; j--){
                for(int k=N-1; k>=0; k--){
                    sum_de=sum;
                    if(j!=0){
                        if(house[j-1][k]==-1){
                            if(check(sorted_list,house[j][k])){
                                sum+=house[j][k];
                                house[j][k]=-1;
                                break;
                            }
                            else {                             
                                house[j][k]=-1;
                            }
                        }
                    }
                    
                    if(k!=0){
                        if(house[j][k-1]==-1){
                            if(check(sorted_list,house[j][k])) {
                                sum+=house[j][k];
                                house[j][k]=-1;
                                break;
                            }
                            else {
                                house[j][k]=-1;
                            }
                        }
                    }
                    //if(sum==sum_de) sum+=value;
                }
            }
        }
        
        System.out.printf("%d ", sum);
        
        /*
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.printf("%d ", house[i][j]);
            }
        }*/
    }
    
    public static boolean check(int[] arr, int Va_check) 
    { 
        boolean test = false; 
        for (int element : arr) { 
            if (element == Va_check) { 
                test = true; 
                return test;
            } 
        }
        return test;
    } 
    
}
