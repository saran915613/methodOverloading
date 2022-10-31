/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodoverldmvnproj1;

/**
 *
 * @author Saran
 */
public class MethodOverldmvnProj1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        for(int i =2; i<=8; i++)
        {
           double total = calculateInterest(10000,i);
            System.out.println("Total Amount = "+String.format("%.2f", total)+" for Interest Rate "+i+"%");
        
        }
        
        boolean result = isPrime(5);
        
        System.out.println("Final Result is :"+result);
        }
    
    
    public static double calculateInterest(double amount, double interestRate)
    {
       return(amount*(interestRate/100));
    }
    
    public static boolean isPrime(int prime){
                
        int i = 100;
           
         for(int j=2; j<=100 ; j++)
         {
             int remainder = i%j;
         
        // float remainder1 = i%3;
         if (remainder >0 )
         {
         System.out.println(+i+" is a Prime Number");
            return true;    
         }
         j++;
         }
             
     
          return false;
    }
}
    
    
        

