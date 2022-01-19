/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_4;
import java.util.*;

class Coin{ 
   public int Value;
   public char side;
   char[] list={'H','T'};

   public Coin() {
        this.Value=0;
        this.side='H';
   }

   public Coin(Coin c) {
        this.Value = Value;
        this.side = side;
   }
  
   public Coin(char side,int Value) {
        this.Value = Value;
        this.side = side;
    }
   
   public void flip(){
      int a=(int)(Math.random()*10)%2;
      if(a==0){
          this.side='H';
      }
      else{
          this.side='T';
      }
   }
   
   
   public void reverse(){
       if(this.side=='H'){
           this.side='T';
       }
       else if(this.side=='T'){
           this.side='H';
       }
   } 
   
   public boolean equals(Coin c){
        if(this.side==c.side&&this.Value==c.Value){
            return true;
        }
        else{
            return false;
        }
    }
}
/**
 *
 * @author LAB_621
 */
public class Lab4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Coin[] a =new Coin[4];
        a[0]=new Coin('H',1);
        a[1]=new Coin('H',1);
        a[2]=new Coin('T',5);
        a[3]=new Coin('T',5);
        for(int i=0; i<20; i++){
            a[0].flip();
            System.out.println(a[0].side+""+a[0].Value);
            a[1].reverse();
            System.out.println(a[1].side+""+a[1].Value);
            a[2].flip();
            System.out.println(a[2].side+""+a[2].Value);
            a[3].reverse();
            System.out.println(a[3].side+""+a[3].Value);            
        }
        System.out.println("c1 is "+a[0].side +" c2 is "+ a[1].side);
        if(a[0].equals(a[1])==true) System.out.println("c1 equal c2");
        else System.out.println("c1 Not equal c2");
        System.out.println("c3 is "+a[2].side+" c4 is "+a[3].side);
        if(a[2].equals(a[3])==true) System.out.println("c3 equal c4");
        else System.out.println("c3 Not equal c4");
    }
    
}
