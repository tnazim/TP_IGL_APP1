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


/**The MIN and the MAX of the vector**/
public int[] min_max(){
    int tmptab[]=new int[2];
    int n=this.size;
    tmptab[0]= vector[0];
    tmptab[1]= vector[0];
    for (int i=1;i<n;i++)
    {
        if ((this.vector[i]<tmptab[0]){
            tmptab[0]=this.vector[i];
        }
        if (this.vector[i]>tmptab[1]){
            tmptab[1]=this.vector[i];
        }
    }
    return tmptab;
}

 /**Application of a formula for all the elements of the vector**/
 /** multiplication by 2 **/

 public void formula()
 {
     for (int i=0; i<size; i++){
         this.vector[i]*=2;
     }

 }
