package ru.job4j.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Tiger extends Predator {

    public Tiger(String name) {
        super(name);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Generics {
    public static void main(String[] args) {
        Generics generics = new Generics();
        List<Animal> first = new ArrayList<>();
        List<Predator> second = new ArrayList<>();
        List<Tiger> third = new ArrayList<>();
        first.add(new Animal("Животное"));
        second.add(new Predator("Хищник"));
        third.add(new Tiger("Амурский тигр"));

        generics.printObject(first);
        generics.printObject(second);
        generics.printObject(third);
        System.out.println();

        //generics.printBoundedWildCard(first);
        generics.printBoundedWildCard(second);
        generics.printBoundedWildCard(third);
        System.out.println();

        //generics.printLowerBoundedWildCard(first);
        generics.printLowerBoundedWildCard(second);
        //generics.printLowerBoundedWildCard(third);
    }


    public <T> void printObject(List<T> list) {
        for (Iterator<T> iterator = list.iterator(); iterator.hasNext();) {
            T next = iterator.next();
            System.out.println("Текущий элемент: " + next);
        }
    }

    // элементоы с ограниченным подстановочным символом
    public void printBoundedWildCard(List<? extends Predator> list) {
        for (Iterator<? extends Predator> iterator = list.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println("Текущий элемент: " + next);
        }
    }

    //  элементы с ограниченным нижним подстановочным символом
    public void printLowerBoundedWildCard(List<? super Predator> list) {
        for (Iterator<? super Predator> iterator = list.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println("Текущий элемент: " + next);
        }
    }
}
