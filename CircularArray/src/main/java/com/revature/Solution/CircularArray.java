package com.revature.Solution;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{
    private T[] objects;
    private int start;
    private int items;

    public CircularArray(int size){
        this.objects=(T[]) new Object[size];
        this.start=0;
        this.items=0;
    }

    public int getSize(){
        return objects.length;
    }

    public T[] getObjects(){
        return objects;
    }

    void incrementStart(){
        start=(start+1)%objects.length;
    }

    public void increment(){
        incrementStart();
        T toPlace = objects[objects.length-1];
        for (int i = objects.length-1; i>0;i--){
            objects[i]=objects[i-1];
        }

        objects[0]=toPlace;
    }

    public void decrement(){
        start--;
        if (start<0)
            start = getSize()-1;

        T toPlace = objects[0];
        for (int i = 0; i<objects.length-1;i++){
            objects[i]=objects[i+1];
        }

        objects[objects.length-1]=toPlace;
    }

    public void addObj(T object){
        if (isFull())
            increaseSize();
        int index = ((start+items)%objects.length);
        objects[index]=object;
        items++;
    }

    private void increaseSize() {
        T[] newSet = (T[]) new Object[objects.length*2];
        for (int i = 0; i<getSize();i++) {
            newSet[i]=objects[i];
        }
        this.objects=newSet;
    }

    boolean isFull() {
        return (items == getSize());
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
