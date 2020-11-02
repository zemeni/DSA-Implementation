package com.example.demo.array;

public class ArrayImpl {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);

        array.print();
        array.delete(1);
        array.print();
        array.removeAt(1);
        array.print();
        array.insertAtFront(10);
        array.print();
        array.insertAtEnd(12);
        array.print();
        array.insertAtAnyPosition(15,3);
        array.print();
    }
}
