/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;
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
public class p5 {
          public static void main(String args[]){
              int n,i,a = 0,jam=0,count,u=0,t,whole=0,r,wh=0,j=0;
              int temp[]=new int[40];
          Scanner no=new Scanner(System.in);
          System.out.println("\n enter how many test cases");
           n=no.nextInt();
           for(i=1;i<100;i++){
               count=0;
               for(j=2;j<i;j++){
                   if(i%j==0)
                       count=1;
               }
               if(count==0)
               {
                   temp[u]=i;
                   u++;
               }
           }
          System.out.println("\n the prime numbers are..");
           for(i=0;i<u;i++)
           {}
    for(i=0;i<n;i++){
               System.out.println("\n enter the number to be checked...");
               a=no.nextInt();
               count=0;
               whole=0;
               for(t=1;a>temp[t];t++)
               {
                   if(a%temp[t]==0)
                   {
                        count=1;
                   }
               }
                 if(count==0)
                  {
                      System.out.println("\n it is a prime number...");
                      whole=1;
                  }  
                 else
                 {
                    System.out.println("\n it is NOT a prime number...");
                 }
           }
           count=0;
           u=0;
           wh=0;
           while(a!=0){
               r=a%10;
               for(t=1;r>temp[t];t++)
               {
                   if(r%temp[t]==0){
                        count=1;
                   }
                       
               }
               if(count==0){
                   wh=wh+1;}
               u=u+1;
                a=a/10;
           }
           if(u==wh)
           {
             System.out.println("\n the digits are also prime numbers...");
             jam=1;
           }
           else
           {
           System.out.println("the digits re not prime");
           }
           if(jam==whole)
           {
               System.out.println("\n yes compiled ");
             }
           else {
               System.out.println("\n not  compiled");
              }
}
}

