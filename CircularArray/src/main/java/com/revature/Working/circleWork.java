package com.revature.Working;

public class circleWork {
    private Object A[];

    public void firstObj(Object N){
        A = new Object[1];

        A[0]=N;
    }

    public void addObj(Object N){
        int Length = A.length;
        int newLength = Length+1;
        Object B[] = new Object[newLength];

        for (int i = 0; i<=Length;i++)
        {
            if(i==Length)
            {
                B[Length]=N;
            }
            else {
                B[i]=A[i];
            }
        }

        A = new Object[newLength];

        for (int i = 0; i<=Length;i++)
        {
            if(i==Length)
            {
                A[Length]=N;
            }
            else {
                A[i]=B[i];
            }
        }
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

    public void ArrayReturn(){
        int Length = A.length;

        for (int i = 0; i<Length;i++){
            System.out.print(A[i]+" ");
        }
    }

    public Object[] getA() { //returns weirdly such as [L@aohdaoh so not effective
        return A;
    }

    public circleWork(){

    }
}
