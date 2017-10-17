package com.company;
import java.util.Random;

public class VectorHelper {
    int vector[];

    /**Create and fill the vector with random numbers**/
    public VectorHelper(int size){
        this.vector = new int[size];
        Random rand = new Random();
        for (int i=0;i<size;i++){
            this.vector[i]=rand.nextInt(1000);
        }
    }

    /**Returns the vector**/
    public int[] getVector(){
        return this.vector;
    }

}
