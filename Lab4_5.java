/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_5;
import java.util.*;

class matrixmulti{
    int[][] a,b,c;
    int N,L,M;
    matrixmulti(int[][] a,int[][] b,int N,int L,int M){
        this.a=a;
        this.b=b;
        this.c=c;
        this.N=N;
        this.M=M;
        this.L=L;
    }
    int[][] multi(){
        c=new int[N][M];
        for(int i=0; i<N; i++){
             for(int j=0; j<M; j++){
                  for(int k=0; k<L; k++){
                      c[i][j]+=a[i][k]*b[k][j];
                  }
             }
        }
        return c;
    }
}
/**
 *
 * @author LAB_621
 */
public class Lab4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int l,m,n,p;
        n=input.nextInt();
        l=input.nextInt();
        int[][] a=new int[n][l];
        for(int i=0; i<n; i++){
            for(int j=0; j<l; j++){
               a[i][j]=input.nextInt();
            }
        }
        p=input.nextInt();
        m=input.nextInt();
        int[][] b=new int[p][m];
        for(int i=0; i<p; i++){
            for(int j=0; j<m; j++){
               b[i][j]=input.nextInt();
            }
        }
        if (l !=p) System.out.println("Can't multiply ");
        else{
            matrixmulti ma=new matrixmulti(a,b,n,l,m);
            int[][] c=ma.multi();
            System.out.printf("\n");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.printf("%d ",c[i][j]);
                }
                System.out.printf("\n");
            }
        }
    }
    
}
