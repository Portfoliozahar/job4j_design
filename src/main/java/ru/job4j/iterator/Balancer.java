package ru.job4j.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Balancer {
    public static void split(List<ArrayList<Integer>> nodes, Iterator<Integer> source) {
        int currentIndex = 0;
        while (source.hasNext()) {
            Integer currentElement = source.next();
            if (!nodes.get(currentIndex).contains(currentElement)) {
                nodes.get(currentIndex).add(currentElement);
            }
            currentIndex = (currentIndex + 1) % nodes.size();
        }
    }
}


