package ru.ifmo.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {

    private HashSet<Integer> elements = new HashSet<Integer>();
    private LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<Integer>();

    public FirstUnique(int[] numbers) {
        for (int value : numbers) {
            add(value);
        }
    }

    public int showFirstUnique() {
        if (uniqueElements.isEmpty()) {
            return -1;
        } else {
            return uniqueElements.iterator().next();
        }
    }

    public void add(int value) {
        if (!elements.contains(value)) {
            elements.add(value);
            uniqueElements.add(value);
        } else {
            elements.add(value);
            uniqueElements.remove(value);
        }
    }
}
