package com.company.Collections;


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(155);
        arrayList.remove(2);
        arrayList.remove(0);

       // System.out.println(arrayList.get(0));
        arrayList.display();

    }
}


class SDAArrayList<E>{
    private final int ARRAY_INITIAL_LENGTH = 5;
    private Object[] arrayElement;
    private int size=0;

    public SDAArrayList() {
        arrayElement = new Object[ARRAY_INITIAL_LENGTH];
    }

// it is required to take into consideration and index could be wrong so proper error has to be thrown
    public E get(int index){
        if (index<0 && index>arrayElement.length-1){
            throw new IndexOutOfBoundsException("The index is definitely out of REACH!");
        }
        else{
            return (E) arrayElement[index];
        }
    }

    public void display(){
        for (int i = 0; i < arrayElement.length; i++) {
            System.out.println(arrayElement[i]);
        }
    }


    public void add(E newObject){
        if (size==ARRAY_INITIAL_LENGTH){
            increaseArraySize();
        }

        arrayElement[ size++]=newObject;

    }


    public E remove(int index){
        if (index<0 && index>arrayElement.length-1){
            throw new IndexOutOfBoundsException("The index is definitely out of REACH!");
        }
        else{
            Object removedElement = arrayElement[index];
            for (int i = index; i < size - 1; i++) {
                arrayElement[i] = arrayElement[i + 1];
            }
            size--;
            decreaseArraySize();
            return (E) removedElement;
        }
    }

    private void decreaseArraySize() {
        arrayElement = Arrays.copyOf(arrayElement,
                arrayElement.length - 1);
    }
    private void increaseArraySize() {
        int newIncreasedCapacity = arrayElement.length +2;
        arrayElement = Arrays.copyOf(arrayElement,
                newIncreasedCapacity);
    }
}