package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaUsage {

    public static void main(String[] args) {
        Animal a1 = new Animal("fish", false, true);
        Animal a2 = new Animal("Kangaroo", true, false);
        Animal a3 = new Animal("mani", false, false);
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        FindMatchingAnimals fma = new FindMatchingAnimals();
        Predicate<Animal> c = x -> x.canSwim();
        for(Animal a: animals)
            fma.show(a, c);
        Predicate<Animal> p = x -> {return (1+1) == 2;};
        System.out.println(p.test(a3));

        Function<String, Integer> f = (String s) -> s.length();
        System.out.println(f.apply("mani"));
    }
}