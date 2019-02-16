package week02;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author student
 */
public class odd {
    public static void main(String args[]){
        int i,n,a,r=1,j,sum,total=0;
        int arr[]=new int[100];
        
                  Scanner no=new Scanner(System.in);
               System.out.println("\n enter the number...");
               a=no.nextInt();
               for(i=1;i<100;i++){
                   if(i%2!=0)
                   {
                       arr[r]=i;
                       r++;
                   }
               }
             System.out.println("\n the odd numbers are...");
               for(i=1;i<r;i++){
                 System.out.println(arr[i]);
                   
               }
               for(i=1;i<=a;i++)
               {
                   sum=0;
                   for(j=1;j<=i;j++)
                   {
                       sum=sum+arr[j];
                   }
                   total=total+sum;
               }
               System.out.println("\n the values is...."+total);
    }
}
