package com.revature.concept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class circleIdea {
    private Object[] A;

    public void addObj(Object N){
        int length= A.length;

        A[length]=N;
    }

    public void Rotate(){
        int length= A.length;
        Object P = A[length-1];//Setting last element of A to an object P

        for(int i=length;i>0; i--)
        {
            if(i>1)
            {
                A[i-1]=A[i-2];
            }
            else
            {
                A[i-1]=P;
            }
        }
    }

    circleIdea(){

    }
}
