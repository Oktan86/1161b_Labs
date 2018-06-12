package lab_7_2;

import java.util.Scanner;

abstract class pet 
{
    protected float weight;
    protected String name;
    protected String sex;
    public pet()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка питомца: ");
        name = in.nextLine();
        System.out.print("Вес питомца: ");
        if(in.hasNextFloat()) weight = in.nextFloat();
        else System.out.println("Введите другие значения");
        System.out.print("Пол питомца: ");
        in.nextLine();
        sex = in.nextLine();
    }
}

abstract class Pets
{
    protected int age;
    protected String name;
    protected boolean hungry;
    public Pets()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Возраст питомца: ");
        if(in.hasNextInt()) age = in.nextInt();
        else System.out.println("Введите другие значения");
        in.nextLine();
        System.out.print("Кличка питомца: ");
        name = in.nextLine();
        System.out.print("Голоден ли питомец? (true/false): ");
        if(in.hasNextBoolean()) hungry = in.nextBoolean();
        else System.out.println("Введите другие значения");
    }
    public abstract void voice();
}

class Snake extends Pets
{
    public Snake()
    {
        super();
    }
    @Override
    public void voice()
    {
        System.out.println("Змея шипит шшшшшшшш!");
    }
}

class Dog extends Pets
{
    public Dog()
    {
        super();
    }
    @Override
    public void voice()
    {
        System.out.println("Собака лает гав!");
    }
}

class PatrolDog extends Pets
{
    public PatrolDog()
    {
        super();
    }
    @Override
    public void voice() 
    {
        System.out.println("Патрульная собака лает гав, гав!!!");
    }
}

class Cat extends Pets
{
    public Cat()
    {
        super();
    }
    @Override
    public void voice() 
    {
        System.out.println("Котик мяукает мяу");
    }
}

class Fish extends Pets
{
    public Fish()
    {
        super();
    }
    @Override
    public void voice() 
    {
        System.out.println("Рыбка плещется буль-буль");
    }
}

interface PassangersCar
{
    void PassangersTravel();
}

interface CargoCar
{
    void CargoTravel();
}

class Truck implements CargoCar, PassangersCar
{
    @Override
    public void PassangersTravel()
    {
        System.out.print("Перевозит мало пассажиров");
    }
    @Override
    public void CargoTravel()
    {
        System.out.println("Перевозит большой груз");
    }
}

class Sedan implements CargoCar, PassangersCar
{
    @Override
    public void PassangersTravel()
    {
        System.out.println("Перевозит мало пассажиров");
    }
    @Override
    public void CargoTravel()
    {
        System.out.println("Перевозит большой груз");
    }
}

class Pickup implements CargoCar, PassangersCar
{
    @Override
    public void PassangersTravel()
    {
        System.out.println("Перевозит мало пассажиров");
    }
    @Override
    public void CargoTravel()
    {
        System.out.println("Перевозит большой груз");
    }
}

public class LAB_7_2 
{

    public static void main(String[] args) 
    {
	Snake a = new Snake();
	Dog b = new Dog();
	PatrolDog c = new PatrolDog();
	Cat d = new Cat();
	Fish e = new Fish();
	a.voice();
        b.voice();
        c.voice();
        d.voice();
        e.voice();
        Truck tr = new Truck();
        Sedan se = new Sedan();
        Pickup pic = new Pickup();
        tr.CargoTravel();
        tr.PassangersTravel();
        se.CargoTravel();
        se.PassangersTravel();
        pic.CargoTravel();
        pic.PassangersTravel();
    }
}