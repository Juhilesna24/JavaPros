package Week02;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;
import static java.lang.Math.pow;
public class p4 {
    
      public static void main(String args[]){
          int t,i,t0,count,a1,r,total = 0,p=0;
          
          Scanner no=new Scanner(System.in);
          System.out.println(" enter the test cases");
          t=no.nextInt();
          for(i=0;i<t;i++){
              count=0;
              total=0;
              r=0;
              System.out.println(" enter the number ");
              t0=no.nextInt();
              a1=t0;
              p=a1;
              while(t0!=0)
              {
                 t0=t0/10;
                 count=count+1;
              }
              
              while(a1!=0)
              {
                 r=a1%10;
                
                 total=(int) (total+pow(r,count));
                 a1=a1/10;
              }
              System.out.println(" the total result"+total);
              if(p==total)
                  System.out.println(" It is a Narcissistic numbe");
              else
                 System.out.println(" It is not a Narcissistic number");

          }
      }
}

           