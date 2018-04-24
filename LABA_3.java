package laba_3;
import java.util.Random;

public class LABA_3 {

    public static void main(String[] args) {
        int n;
        int[] arr = new int [] 
        {
            2, 4, 6, 8, 10, 12, 14, 16, 18, 20
        };
        n = arr.length;
        for (int i = 0; i<n; i++)
        {
         System.out.print (arr[i] + " ");   
        }
        
        System.out.println ();
        
        for (int i = 0; i<n; i++)
        {
         System.out.println (arr[i]);   
        }
        System.out.println ("First done"); //конец первого задания
        
        int a = 0;
        for(int i = 1; i <= 99; i++)
        {
            if(i%2 != 0)
            a++;    
        }
        
        int[] arr2 = new int[a];
        for(int i = 1,b = 0; i <= 99; i++)
        {
            if(i%2 != 0)
            {
            arr2[b] = i;
            System.out.print (arr2[b] + " ");
            b++;
            }
        }
        
        System.out.println();
        
        for(int i = arr2.length-1; i >= 0; i--)
            {
            System.out.print(arr2[i] + " ");
            }
        System.out.println();
        System.out.println ("Second done"); //конец второго задания
        
        
        int b = 0;
        int[] arr3 = new int[15];
        for(int i = 0; i < arr3.length; i++)
            {
            Random r = new Random(); //Рандомчик, оппааа
            arr3[i] = r.nextInt(10);
            System.out.print(arr3[i] + " ");
            if(arr3[i] > 0 & arr3[i]%2 == 0)
            b++;
            }
        System.out.println();
        System.out.println(b + " even numbers in array"); // кол-во чётных
        System.out.println ("Third done"); //конец третьего задания
        
        int [][] arr4 = new int [8][5];
         for(int i = 0; i < arr4.length; i++)
        {
            for(int j = 0; j < arr4[i].length; j++)
            {
                arr4[i][j] = (int)(Math.random()*90) +10;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Fourth done, yeeeeeaaaaaa!"); //Конец четвёртого задания
        
        int [][] arr5 = new int [7][4];
        int [] multi = new int[arr5.length];
        int max = 0, maxi = 0;
        for(int i =0; i < arr5.length; i++)
        {
            System.out.print("Index "+i+" is ");
            for(int h = 0; h < arr5[i].length; h++)
            {
                arr5[i][h] = (int)(Math.random()*11) -5;
                System.out.print(arr5[i][h] + " ");
                if(h == 0)multi[i] = arr5[i][h];
                else multi[i] *= arr5[i][h];
                if(h == arr5[i].length - 1)
                System.out.println(" ");
            }
        }
        
        for(int i = 0; i < multi.length; i++)
        {
            if(Math.abs(multi[i]) > max)
            {
                max = multi[i];
                maxi = i;
            }
        }
        System.out.println("Line with maximum module of miltipiling elements (" + max + ") have index (" + maxi +")");
        System.out.println("Fifth done! asdasdasdasda"); //Конец пятого задания
    }   
}
    