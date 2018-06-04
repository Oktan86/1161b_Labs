package lab_6;

import java.util.Scanner;

class horse 
{
    public String name;
    public horse()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка лошади: ");
        name=in.nextLine();
    }
}

class pegas extends horse 
{
    public pegas() 
    {
        super();
    }

    public void fly() 
    {
        System.out.println(name + " умеет летать!");
    }
}

class pet 
{
    protected float weight;
    protected String name;
    protected String sex;
    public pet()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка питомца: ");
        name=in.nextLine();
        System.out.print("Вес питомца: ");
        if(in.hasNextFloat()) weight=in.nextFloat();
        else System.out.println("Введены неверные значения");
        System.out.print("Пол питомца: ");
        in.nextLine();
        sex=in.nextLine();
    }
}

class dog extends pet
{
    public dog()
    {
        super();
    }
    public void infodog()
    {
        System.out.println("Собака\nпо кличке: "+name+"\nВесит:"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class cat extends pet
{
    public cat()
    {
        super();
    }
    public void infocat()
    {
        System.out.println("Кошка\nпо кличке:\t"+name+"\nВесит:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class fish
{
    protected int a;
    protected int b;
    public void life()
    {
        System.out.println("Рыба имеет хребет");
    }
}

class animal extends fish
{
    protected int c;
    protected int d;
    public void arm()
    {
        System.out.println("Животное получает руки и ноги");
    }
}

class ape extends animal
{
    protected int e;
    protected int f;
    public void Skill()
    {
        System.out.println("Обезьяна наследует умения");
    }
}

class human extends ape
{
    protected int a;
    protected int b;
    public void mind()
    {
        System.out.println("Человек приобретает разум");
    }
}


public class LAB_6 
{
    public static void main(String[] args)
    {
     pegas a = new pegas();
        a.fly();
        dog b = new dog();
        b.infodog();
        cat c = new cat();
        c.infocat();
        human d = new human();
        d.life();
        d.arm();
        d.Skill();
        d.mind();   
    }   
}
