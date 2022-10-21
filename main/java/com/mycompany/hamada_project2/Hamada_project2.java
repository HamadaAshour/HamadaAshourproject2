/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hamada_project2;

import java.util.Scanner;
public class Hamada_project2 {
public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        /* passennger >> 1 bag
        weight of bag >> class 'F' First = 30 kg
                      >> class 'B' Business = 25 kg
                      >> class 'E' Economic = 20 kg
       access weight 1 kg >> 10 SR */
        
       char classdegree; 
       float Weight , pay = (0) , accessweight =(0);
      
       do
         {
        System.out.println ("Please Enter Your Class Degree ");
        System.out.println ("Choice it F , B or E ");
        classdegree = input.next().charAt(0);
        switch (classdegree)
        {
            case 'F':
            case 'f': 
            case '1':    
                System.out.println ("Please Enter Your Bag Weight") ;
                Weight = input.nextFloat();
                accessweight = (Weight -30);
                pay = accessweight *10 ;
                if (Weight > 30)
                    System.out.printf ("Sorry your Bag Weight is access about allowed weight by "+accessweight+" Kg \n so you will pay "+pay+ " SR \n");
                else 
                    System.out.println ("رحله سعيد يا فندم") ;
                    
                 break;
         case 'B':
         case 'b':
         case '2':    
                 System.out.println ("Please Enter Your Bag Weight") ;
                Weight = input.nextFloat();
                accessweight = (Weight -25);
                pay = accessweight *10 ;
                if (Weight > 25)
                    System.out.printf ("Sorry your Bag Weight is access about allowed weight by "+accessweight+" Kg \n so you will pay "+pay+ " SR \n");
                else 
                    System.out.println ("رحله سعيد يا فندم") ;
                 break;
         case 'E':
         case 'e':
         case '3':    
                 System.out.println("Please Enter Your Bag Weight");
             Weight = input.nextFloat();
             accessweight = (Weight - 20);
             pay = accessweight * 10;
             if (Weight > 20)
                 System.out.printf("Sorry your Bag Weight is access about allowed weight by " + accessweight + " Kg \n so you will pay " + pay + " SR \n");
             else
                 System.out.println("رحله سعيد يا فندم");
                 break;
         default :
                 System.out.println ("You must select one valid character");
        
        }
         }while (classdegree !=0) ;
}
}
