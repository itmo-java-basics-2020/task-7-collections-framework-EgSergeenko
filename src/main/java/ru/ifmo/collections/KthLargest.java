package ru.ifmo.collections;

import java.util.Collections;
import java.util.LinkedList;


/**
 * Design a class to find the kth largest element in a stream. k is from 1 to numbers.length.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Constructor accepts an integer k and an integer array numbers, which contains initial elements from the stream.
 * For each call to the method KthLargest.add(), return the element representing the kth largest element in the stream.
 */
public class KthLargest {
    private final int K;
    private LinkedList<Integer> elements = new LinkedList<>();

    public KthLargest(int k, int[] numbers) {
        this.K = k - 1;
        for (int value : numbers) {
            elements.add(value);
        }
    }

    public int add(int val) {
        elements.add(val);
        elements.sort(Collections.reverseOrder());
        return elements.get(K);
    }
}