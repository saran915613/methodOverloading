/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodoverldmvnproj1;

/**
 *
 * @author Saran
 */
public class switchCase {
    
    public static void main(String[] args){
        
        char switch1 = 'f';
        
        switch(switch1){
            case 'a':
                System.out.println("This is case "+switch1);
                break;
            case 'b':case'c':case'd':case'e':
                  System.out.println("This is case "+switch1);
                break;   
            default:
                System.out.println("Not Found");
        }
         String switchh = "jANuarY" ;
        switch(switchh.toUpperCase()){
        
            case "JANUARY":
                    System.out.println("Month is :"+switchh.toUpperCase());
                    break;
            case  "FEBUARY":
                System.out.println("Month is :"+switchh.toUpperCase());
                break;
                    
            default:
                System.out.println("Month Not Found");
        }   
        int day = -1;
        switchCaseTheWeek(day);
        
        }
      public static void switchCaseTheWeek(int day)
      {
            switch(day){
            
                case 0:
                    System.out.println("The day is Sunday");
                    break;
                case 1:
                    System.out.println("The day is Moneday");
                    break;
                default:
                    System.out.println("Day of the week not Found");
            }
            
            
      }  
      
                
        
                
    }
    

