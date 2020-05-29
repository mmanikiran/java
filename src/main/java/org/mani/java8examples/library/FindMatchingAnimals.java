package org.mani.java8examples.library;

import java.util.function.Predicate;

public class FindMatchingAnimals {
    public void show(Animal a, Predicate<Animal> trait){
        if(trait.test(a)){
            System.out.println(a);
        }
    }
}
