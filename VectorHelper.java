package com.company;
import java.util.Random;

public class VectorHelper {
    int size;
    int vector[];

    /**Create and fill the vector with random numbers**/
    public VectorHelper(int size){
        this.size=size;
        this.vector = new int[size];
        Random rand = new Random();
        for (int i=0;i<size;i++){
            this.vector[i]=rand.nextInt(1000);
        }
    }

    /**Bubble sort function**/
    public void sort(){
        int n=this.size;
        int swapVar;
        boolean repeat = true;
        while (repeat)
        {
            repeat=false;
            for (int i=1;i<n;i++)
            {
                if ((this.vector[i-1])>this.vector[i])
                {
                    swapVar=this.vector[i-1];
                    this.vector[i-1]=this.vector[i];
                    this.vector[i]=swapVar;
                    repeat=true;
                }
            }
        }
    }

    /**Returns the vector**/
    public int[] getVector(){
        return this.vector;
    }
    
    /**Returns the size**/
    public int getSize() {
        return size;
    }
}
