package com.nikita.homework;

public class Sequence {

    private int value = 0;
    public synchronized int getNext() {
            value++;
            return value;
    }
}
