package com.geekBrains.marchenkods.first.hw;

import java.util.EmptyStackException;
import java.util.Vector;

class MyStack<E> extends Vector<E> {

    public MyStack() {
    }

    public E push(E item) {
        addElement(item);
        return item;
    }

    public E pop() {
        E obj;
        int len = size();
        obj = peek();
        removeElementAt(len - 1);
        return obj;
    }

    public E peek() {
        int len = size();
        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }
}