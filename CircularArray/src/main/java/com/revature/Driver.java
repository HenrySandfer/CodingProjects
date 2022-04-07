package com.revature;

//import com.revature.Working.circleWork;
import com.revature.Solution.CircularArray;
import com.revature.Working.circularWork;

public class Driver {
    public static void main(String[] args){
        //circleWork B = new circleWork();
        CircularArray<Object> B = new CircularArray<>(5);
        Object input;
        int M=15004;
        int N=102;

        //System.out.println("Enter data: ");
        B.addObj("Rotating?");
        B.addObj(0);
        B.addObj('j');
        B.addObj(0.0d);
        B.addObj(true);

        System.out.print("The array has been defaulted to: ");
        //B.ArrayReturn();
        for(Object item : B.getObjects()){
            System.out.print(item + " ");
        }
        System.out.println();

        //System.out.println("Do you want to add more data?");

        System.out.print("How many times do you want to rotate forward? ");

        for (int i=1; i<=M;i++){//B.Rotate
            B.increment();}

        //B.ArrayReturn();
        for(Object item : B.getObjects()){
            System.out.print(item + " ");
        }

        System.out.println();

        System.out.print("How many times do you want to rotate backwards? ");

        for (int i=1; i<=N;i++){
            //B.Rotate
            B.decrement();
        }

        System.out.println();

        System.out.print("Final array: ");

        for(Object item : B.getObjects()){
            System.out.print(item + " ");
        }
    }
}
