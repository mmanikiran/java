package org.example;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {

    public static boolean isGreaterthanTen(Integer i){
        return i > 10;
    }

    public static void main(String[] args) {

        //Static method reference
        Predicate<Integer> p1 = MethodReferences::isGreaterthanTen;
        System.out.println("Integer 10 is greater than 10 " + p1.test(10));
        String str = "abc";
        //Instance method reference on a particular instance which String "abc" in the case. The runtime parameter
        // "a" and "b" are checked on the instance "abc" if it is prefix of "abc"
        Predicate<String> p = str::startsWith;
        //Predicate<String> p = s -> str.startsWith(s)
        System.out.println("abc starts with a " + p.test("a"));
        System.out.println("abc starts with b " + p.test("b"));
        //Instance method on an instance that is determined at runtime. That is the string object on which the
        //isEmpty method is called. This is with Predicate
        Predicate<String> s = String::isEmpty;
        //Instance method on an instance that is determined at runtime. That is the string object on which the
        //isEmpty method is called. This is using Function
        Function<String, Boolean> f = String::isEmpty;
        //Constructor method reference
        Supplier<MethodReferences> sup =  MethodReferences::new;
        System.out.println("\"\" is empty " + s.test(""));
        System.out.println("Give me the instance of Sample " + sup.get().hashCode());
    }
}
