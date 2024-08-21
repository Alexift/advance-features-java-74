package org.example.oop;
/*
    Mostenirea ne permite sa preluam informatii generale dintr-o clasa parinte si sa le transmitem mai
    departe in clasele copil.Scopul principal este acela de a crea un nivel de generaliyzare
    intre o sere de clase ce apartin aceluiasi context si de a le permite sa se diferenytieze intre ele intr-un mod mult
    mai vizibil.

    Multilevel Inheritance = Mostenire multipla
    in Java nu este posibil doarece o clasa copil corespunde unui singur parinte

    1. Mostenire multipla din copil in copil
    Mammel -> Dog -> BabyDog

   2. Nistenire multipla la nivel de interfete
Interfata = este un tip de clasa care defineste de regula contractul comportamental al unei tipologii de obiecte

    cand utilizam mostenirea prin clase ?
        - Atunci cand dispunem de minic 2 clase copil care au in comun un set de atribute

    cand utilizam interfete ?
        - atunci cand dispunem de minim 2 clase care au in comun acelasi set de metode , insa au implementari diferite

 */
// Parent class - base class

class Mammel {

    int age;
    String furColour;
    String species;

    Mammel(int age, String furColour, String species) {
        this.age = age;
        this.furColour = furColour;
        this.species = species;

    }

    void display() {
        System.out.println(this.species + " " + this.furColour + " " + this.age);
    }

    void sound() {
        System.out.println("mammel makes sound!");
    }

}

// Child class = Derived class

class Dog extends Mammel {
    String favoriteToy;

    Dog(int age, String furColour, String species, String favoriteToy) {
        super(age, furColour, species); // apeleaza constructorul din clasa parinte pea atributele generice
        this.favoriteToy = favoriteToy;
    }

    @Override
    void sound() {
        super.sound();  // apelam metodele sau atributele din clasa parinte din sintaxa lui super de obiect
        // de tipul Mammel
        System.out.println("Child Dog class :" + favoriteToy);
        System.out.println(super.furColour);
    }

    @Override
    void display() {
        System.out.println("Dog looks happy : ");
    }


}

class Cat extends Mammel {

    Cat(int age, String furColour, String species) {
        super(age, furColour, species);
    }
}

interface i1 {
    void display();


}

interface i2 {
    void sound();
}

public class InharitancePrincilple {
    public static void main(String[] args) {
        Mammel mammel = new Mammel(5, "rosu", "raton");
        Mammel dog1 = new Dog(4, "black", "wolf", "ball");
        Dog dog2 = new Dog(3, "white", "caine", "blanket");


        mammel.display();
        mammel.sound();
        System.out.println("--------------------");
        dog1.display();
        dog1.sound();
        System.out.println("--------------------");
        dog2.sound();
        dog2.display();
    }
}
