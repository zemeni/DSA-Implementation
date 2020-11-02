package com.example.demo.array;

public class Array {
    private int size;
    private int[] arr;
    int count = 0;

    public Array(int size) {
        this.size = size;
        this.arr = new int[size];

    }

    public void insert(int item) {
        if (count == size) {
            increaseSize();
        }
        if (count < size) {
            arr[count] = item;
            count++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

    private void increaseSize() {
        int[] newArr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        size = size + 1;
        arr = newArr;
    }

    public int indexOf(int item) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) index = i;
        }
        return index;
    }

    public void delete(int item) {
        boolean isItemPresent = false;
        int[] newArr = new int[size - 1];
        for (int i : arr) {
            if (i == item) isItemPresent = true;
        }
        if (isItemPresent) {
            int indexOf = indexOf(item);
            int j = 0;
            for (int i = 0; i < size; i++) {
                if (indexOf != i) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
        } else {
            throw new IllegalArgumentException("Array dont contain item>>" + item);
        }
        size--;
        arr = newArr;
    }

    public void removeAt(int index) {
        int[] newArr = new int[size - 1];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArr[j] = arr[i];
                j++;
            }
        }
        size--;
        arr = newArr;
    }

    public void insertAtFront(int item) {
        int[] newArray = new int[size + 1];
        newArray[0] = item;
        for (int i = 0; i < size; i++) {
            newArray[i + 1] = arr[i];
        }
        size++;
        arr = newArray;
    }

    public void insertAtEnd(int item) {
        int[] newArray = new int[size + 1];
        int i = 0;
        for (i = 0; i < size; i++) {
            newArray[i] = arr[i];
        }
        newArray[i] = item;
        size++;
        arr = newArray;
    }

    public void insertAtAnyPosition(int item, int position) {
        int[] newArray = new int[size+1];
        int j=0;
        for (int i = 0; i < size; i++) {
            if (position == i) {
                newArray[j]=item;
            } else {
                newArray[j] =  arr[i];
            }
            j++;

        }
        size++;
        arr = newArray;
    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
