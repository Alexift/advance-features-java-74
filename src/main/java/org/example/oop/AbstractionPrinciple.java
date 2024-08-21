package org.example.oop;

/*
    // ---------------------- Keywords ----------------------

    Prescurtari in cod:
        1. psvm = public static void main
        2. sout = System.out.println()

    Nu puteti avea mai multe metode MAIN intr-o clasa, pentru scopul acesteia este de a compila codul dpdv sintactic.
    Insa, chiar daca metoda main e unica la nivel de clasa, mai multe clase, pot avea fiecare o metoda main.

    Sinonime:
        Libraria = proiect java
        Metoda = Functie

    Keywords sunt instructiuni predefinite in Java prin care putem interactiona cu fuctionalitatile compilatorului.
    Class = este o schita generala a unei tipologii de obiect
    Obiect = este instanta unei clase
    Metoda = este functionalitatea clasei
    Semnatura metodei = reprezinta modul de definitie al unei functii/metode
    Corpul metodei = reprezinta instructiunile definite intre acoladele metodei

    Clasa se poate utiliza pentru mai multe scopuri:
    - tip de date: acesta reprezinta natura obiectului/variabilei/constantei pe care o definim

    // ---------------------- Abstraction ----------------------

    Abstractizarea este unul din principalele principii ale programarii orientate pe obiecte si se refera la conceptul de ascundere
    a detaliilor de implementare ale clasei prin expunerea partilor esentiale la nivel de obiect.

    Putem reprezenta abstractizarea in urmatoarele moduri:
    1. clase Wrapper = reprezinta o clasa ce se comporta ca un invelist peste un anumit context functional
        - tipuri de date primitive: int, double, float, byte, short, char...
        - tipuri de date wrapper: Integer, Double, Float, Byte, Short, Character...
    2. clase abstracte
    3. interfete

 */


import java.awt.*;

abstract class Shape {

    protected double perimeter;
    protected double area;

    public abstract double calculalteArea();

    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("Perimeter : " + perimeter + " , Area : " + area);
    }
}

interface ShapeInterface {

    void draw();

}

class Circle extends Shape implements ShapeInterface {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
        this.area = calculalteArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculalteArea() {
        return Math.PI * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle !");

    }
}

class Square extends Shape implements ShapeInterface {

    private double value;

    Square(double value) {
        this.value = value;
        this.area = calculalteArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculalteArea() {
        return value * value;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * value;
    }

    @Override
    public void draw() {
        System.out.println("This is a square! ");

    }
}

class Rectangular extends Shape implements ShapeInterface {
    private double lenght;
    private double width;

    Rectangular(double lenght, Double width) {
        this.lenght = lenght;
        this.width = width;
        this.area = calculalteArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculalteArea() {
        return lenght * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (lenght + width);
    }

    @Override
    public void draw() {
        System.out.println("this is a rectangle ! ");

    }
}

// todo Create a Triangle class.

public class AbstractionPrinciple {

    public static void main(String[] args) {

        /** Exemplu 1: Abstractizare prin clase Wrapper */
        Integer nr1 = 98;
        Integer nr2 = 78;

        // valorile booleane (true, false) sunt criptate in Java in cod binar (1,0)
        /*
        nr1 > nr2 => rezultat > 0
        nr1 < nr2 => rezultat < 0
        nr1 == nr2 => rezultat = 0
         */
        System.out.println(nr1.compareTo(nr2));

        Circle circle = new Circle(4.5);
        Square square = new Square(2.3);
        Rectangular rectangular = new Rectangular(7, 4.6);

        circle.display();
        square.display();
        rectangular.display();

    }
}
