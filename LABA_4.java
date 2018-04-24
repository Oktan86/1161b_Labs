package laba_4;

public class LABA_4 // !ТУТ ПЕРВЫЕ 3 ЗАДАНИЯ ИЗ 4 ЛАБЫ!
{   
    public static int randAB(int a,int b) 
    //метод, который будет возвращать случайное число C из отрезка a;b
    {   int c;
        if(a > b)
        {
            c=(int)(Math.random()*(a - b + 1))+b;
            return c;
        }
        else 
        {
            c=(int)(Math.random()*(b - a + 1))+a;
            return c;
        }
    }
    
    public static int [] fill(int [] n)
    //заполняем массив элементами c из метода randAB
    {
        for(int i = 0; i < n.length; i++)
        {
            n[i] = randAB(1, 9); //тут задаётся отрезок a;b и 
        }
        return n;
    }
    
    public static void printing(int [] a)
    //метод, выводящий массив в строку с указанием номера массива
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
            if(i == a.length - 1)
                System.out.println();
        }
    }
    
    public static void ending(String task)
    //метод, показывающий конец каждого задания
    {
        System.out.println(task + " done!");
        System.out.println();
    }
    
    public static void bubbleSort(int[] a) //Сортировка методом пузырька
    {
        for (int i = a.length-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            //cравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
            {
                if (a[j] > a[j + 1])
                {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i <  a.length; i++) 
        {
            System.out.print(a[i] + "  "); //вывод получившегося массива
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) 
    {
        int[] arr0 = new int[20];
        System.out.print("FIrst array is: ");
        fill(arr0);
        printing(arr0);
        ending("First");
        
        int[] arr1 = new int[10];
        System.out.print("FIrst array is: ");
        fill(arr1);
        printing(arr1);
        
        int[] arr2 = new int[10];
        System.out.print("Second array is:");
        fill(arr2);
        printing(arr2);
        
        int[] arr3 = new int[10];
        System.out.print("Third array is: ");
        fill(arr3);
        printing(arr3);
        
        int[] arr4 = new int[10];
        System.out.print("Fourth array is:");
        fill(arr4);
        printing(arr4);
        
        int[] arr5 = new int[10];
        System.out.print("Fifth array is: ");
        fill(arr5);
        printing(arr5);
        ending("Second");
        
        int[] a = arr5;
        bubbleSort(a); //вызов метода сортировки
        ending("Third");
        System.out.print("HEEEL YEAAAAH! ALL TASKS COMPLETED!");
    }
    
}
