package org.example.oop;
/*
    Polimorfismul permite obiectelor din deferite clase se fie tratate asemeni clasei
    in care sunt suprascise ( Override ) sau supraincarcare ( Overload )

    Override:
        - se asigura prin folosirea adnotarii @Override
        - ne permite sa folosim o implementare personalizata unei metode preluat
        din clasa parinte
            -- Suprasriere din clasa 'Display' din Mammel este referinita din Dog
            cu o alta implementare
            -- Suprascriere din Interfata : Metoda Display din i1 primeste o
            imprelemtare fiindca nu are niciuna.
            
    Overload :
        - se asigura la niel de clasa !
        - se pastreaza integral denumirea metodei dar putem schimba semnatura coplet ( alt tip
        de returare si / sau alta imprementare )


 */

class Calculatorr {

    int add ( int a , int b) {
        return a+b;

    }
    double add ( double a , double b) {
        return a+b;
    }
}

public class PolymorphismPrincile {
    public static void main(String[] args) {
        Calculatorr calculator = new Calculatorr();

        System.out.println(calculator.add(1,5.2));

    }
}
