package lab_5;

import java.util.Scanner;

class Okrujnost{
    private int xc1;    //объявление переменных
    private int yc1;
    private int xc2;
    private int yc2;
    private int r1;
    private int r2;
    public Okrujnost()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус первой окружности: "); //ввод всех данных
        if(in.hasNextInt()) r1 = in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите радиус второй окружности: ");
        if(in.hasNextInt()) r2 = in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите координату X центра первой окружности: ");
        if(in.hasNextInt()) xc1 = in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите координату Y центра первой окружности: ");
        if(in.hasNextInt()) yc1 = in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите координату X центра второй окружности: ");
        if(in.hasNextInt()) xc2 = in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите координату Y центра второй окружности: ");
        if(in.hasNextInt()) yc2 = in.nextInt();
        else System.out.println("Введены неверные значения");
    }

    public void dlina()
    {
        double length1 = 2 * Math.PI * r1;  //вычисление длины окружностей
        System.out.print("Длинна окружности 1: ");
        System.out.println(length1);
        double length2 = 2 * Math.PI * r2;
        System.out.print("Длинна окружности 2: ");
        System.out.println(length2);
    }

    public int[] random()
    {
        xc1 = (int) (Math.random() * 198 - 99); //перемещение центра первой окружности
        yc1 = (int) (Math.random() * 198 - 99);
        return new int[] {xc1, yc1};
    }

    public int[] prostotak()
    {
        return new int [] {xc2, yc2};   //просто так) не знаю, как ещё это можно реализовать
    }
    
    public void calculating()   //вычисления, штучки, дрючки
    {
        int Okrujnost1[] = random();
        int Okrujnost2[] = prostotak();
        double g = Math.sqrt(Math.pow((Okrujnost1[0] - Okrujnost2[0]), 2) + Math.pow((Okrujnost1[1] - Okrujnost2[1]), 2));
        System.out.println("Центр первой окружности: (" + Okrujnost1[0] + ";" + Okrujnost1[1] + ")");
        System.out.println("Центр второй окружности: (" + Okrujnost2[0] + ";" + Okrujnost2[1] + ")");
        System.out.println("Расстояние между центрами: " + g);
        
        if (g == r1 + r2)
        {    
            System.out.println("Окружности соприкасаются");
        }
        else if (g ==  Math.abs(r1 - r2))
        {    
            System.out.println("Окружности соприкасаются");
        }
        else if (g <  r1 + r2)
        {    
            System.out.println("Окружности пересекаются");
        }
        else System.out.println("Окружности не соприкасаются и не пересекаются");
        System.out.println("Ооо, дааа, лаба готова (вроде)");
    }
}

public class LAB_5
{
    public static void main(String[] args)
    {
        Okrujnost a = new Okrujnost();
        a.dlina();
        a.random();
        a.calculating();
        
    }
}