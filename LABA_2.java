package laba_2;

import java.util.Scanner;
    
public class LABA_2 {

    public static void main(String[] args) {
    //Первое задание
     int i, width, height, maxW, maxH, a, b, ox, oy;
    
     for (i=1;i<=100;i++){
     System.out.println (i);
     }   
     System.out.println ("Done");
    //Второе задание
     Scanner num =  new Scanner (System.in);
      maxW = num.nextInt();
      maxH = num.nextInt();
     for (height=1;height<=maxH;height++){
         
          for (width=1;width<=maxW;width++){
           System.out.print(8);
         }
          System.out.println();
      }
     System.out.println ("Done");
    //Третье задание
    
     maxH = num.nextInt();
     for (height=1;height<=maxH;height++){
         for (width=1;width<=height;width++){
          System.out.print(8+" ");
         }
          System.out.println();
     }
     System.out.println ("Done");
    //Четвёртое задание
     a = num.nextInt();
     b = num.nextInt();
    
     if(a>b)
     {
       System.out.println (a+" is bigger than "+b);  
     } else if (b>a)
     {
       System.out.println (b+" is bigger than "+a); 
     } else 
     {
       System.out.println (a+" is equally "+b); 
     }
     System.out.println ("Done");
    //Задание с координатами
     ox = num.nextInt();
     oy = num.nextInt();
     if(ox>0 && oy>0)
     {
       System.out.println ("Your point is in 1st quarter");  
     }
     else if(ox<0 && oy>0)
     {
       System.out.println ("Your point is in 2nd quarter");  
     }
     else if(ox<0 && oy<0)
     {
       System.out.println ("Your point is in 3rd quarter");  
     }
     else if(ox>0 && oy<0)
     {
       System.out.println ("Your point is in 4th quarter");  
     }
     else
     {
       System.out.println ("Your point is on one or more lines");  
     }
    System.out.println ("That's all! GG, WP");
    }   
}