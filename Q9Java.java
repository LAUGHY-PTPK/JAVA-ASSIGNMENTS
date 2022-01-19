package q9.java;
import java.util.Scanner;
class mpn{
public int i,num,max_p_num=0,count=0;
public mpn(){}
void f_prime(int numm){
         for(i=numm-1; i>1; i++){
            //System.out.println(numm);//
            if(numm%i==0) break;
            else{
              if (max_p_num==0 || max_p_num<numm){
                  //System.out.println(numm);//
                  this.max_p_num=numm; 
                  this.count=1;
                }        
            }
        }
    }
public int getCount() {return count;}
}
public class Q9Java {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        mpn a = new mpn();
         a.num= op.nextInt();
         a.f_prime(a.num);
        while(a.num !=0 ){
            a.num= op.nextInt();
            a.f_prime(a.num);}
        int cc=a.getCount();
        if(cc==0) System.out.println(" -1 ");
        else System.out.println("output =" + a.max_p_num);
    }   
}
