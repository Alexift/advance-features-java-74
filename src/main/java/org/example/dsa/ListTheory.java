package org.example.dsa;
/*
List = este o interfata care defineste contractul comportamental al unei structuri de date care are capacitatea
de a stoca multimi de valori pe bata de index de pozitie.

Sintaxa de definitie si Instantiere: List <tipul_de_Date> Denumire_Liste = new ArrayList <>()

Pseudocod Interfata obiect = new Constructor ()

List fiind o interfata . in mod obligatorie este impremntata de o serie de clase > ArrayList,LinkedList , etc...

Indexarea valorilor / obiectelor stocate incepe de la 0.

 */


import java.util.ArrayList;
import java.util.List;

public class ListTheory {
    public static void main(String[] args) {
        // Initializarea unei liste
        List<String> stringList = new ArrayList<>();

        System.out.println(stringList);

        // ADD and ADD ALL

        stringList.add("appel");
        stringList.add("cherry");
        stringList.add("pear");
        System.out.println(stringList);

        stringList.add(1,"Banana");
        System.out.println(stringList);

        stringList.addAll(new ArrayList<>(List.of("tomato","Wattermellow")));
        System.out.println(stringList);

        System.out.println(stringList.get(5));
        System.out.println("Dimensiunea este de :" + stringList.size());
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Elementul : " + stringList.get(i) + " pozitia " + i);
            
        }

        //Set

        stringList.set(0,"Rosi".toLowerCase());
        System.out.println(stringList);

        //REMOVE
        stringList.remove("rOsi".toLowerCase());
        System.out.println(stringList);
        System.out.println("Dimensiunea este de :" + stringList.size());
        stringList.removeAll(new ArrayList<>(List.of("Banana" ,"pear")));
        System.out.println(stringList.size() + " " + stringList);





    }
}
