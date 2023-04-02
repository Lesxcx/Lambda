package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //podpunkt 1
        Consumer<Integer> ocena = (oce) -> System.out.println("Dostanę ocenę " + oce);
        ocena.accept(5);

        //podpunkt 2
        BinaryOperator<Integer> mnozenie = (a, b) -> a * b;
        System.out.println(mnozenie.apply(3,4));

        //podpunkt 3
        UnaryOperator<Integer> kwadrat = (a) -> a*a;
        System.out.println(kwadrat.apply(7));

        //podpunkt 4
        Function<Double, Double> pierwiastek = Math::sqrt;
        System.out.println(pierwiastek.apply(7.53));

        //podpunkt 5
        BinaryOperator<Integer> dodawanie = Integer::sum;
        System.out.println(dodawanie.apply(9, 65));

        //Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).
        BiFunction<Integer, String, Human> aNew = Human::new;
        System.out.println(aNew.apply(70, "Jan"));


        List<String> names = Arrays.asList("Ania", "Hania", "Klaudia", "Basia");
        names.sort(String::compareTo);
        System.out.println(names);
    }
}