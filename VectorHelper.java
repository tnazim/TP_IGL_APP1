package com.company;
import java.util.Random;
import com.company.DifferentSizeException;

public class VectorHelper {
    private int size;
    private int vector[];

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

    /**Sum this vector with another vector v2, if size is differnet an exception is thrown.**/
    public void sum(VectorHelper v2) throws DifferentSizeException
    {
        if (this.size!=v2.getSize())
        {
            throw new DifferentSizeException();
        }
        else
        {
            for (int i=0;i<this.size;i++)
            {
                this.vector[i]+=v2.getVector()[i];
            }
        }
    }

    /**Reverse the elements of the vector**/
    public void reverseVector()
    {
        int tmpVec[]=new int[size];
        for (int i=0;i<size;i++)
        {
            tmpVec[size-1-i]=this.vector[i];
        }
        this.vector=tmpVec;
    }


    /**Prints the vector.**/
    public void printVector()
    {
        for (int i=0;i<this.size;i++)
        {
            System.out.print(this.vector[i]);
            if (i!=this.size-1)
            {
                System.out.print("::");
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
