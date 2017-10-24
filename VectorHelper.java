package com.company;
import java.util.Random;
import java.util.Vector;

import com.company.DifferentSizeException;

/**
 * <b>VectorHelper est la classe qui permet de faire quelques opérations sur les vecteurs.</b>
 *<p>
 * La classe à comme attribut la taille du vecteur et le vecteur lui même.
 * <ul>
 * <li>size : Un entier naturel non nul qui représente la taille.</li>
 * <li>vector : Un vecteur d'entiers.</li>
 * </ul>
 *</p>
 *
 *
 * @author TETAH&TEZKRATT ;
 * @version 1.0
 */

public class VectorHelper {
    /**
     * La taille du vecteur, non nul.
     * @see VectorHelper#getSize()
     * @see VectorHelper#VectorHelper(int)
     *
     */
    private int size;

    /**
     * Le vecteur d'entiers.
     */
    private int vector[];

    /*Create and fill the vector with random numbers*/
    /**
     * Permet de créer un nouveau vecteur dont on spécifie la taille.
     * @param size La taille du vecteur.
     */
    public VectorHelper(int size){
        this.size=size;
        this.vector = new int[size];
        Random rand = new Random();
        for (int i=0;i<size;i++){
            this.vector[i]=rand.nextInt(1000);
        }
    }

    /*Constructeur du vecteur pour le test*/

    /**
     * Permet de construire le vecteur de test.
     */
    public VectorHelper()
    {
        final int tab[] = {5,6,1,3,12,21,8,15,0,7};
        this.size=10;
        this.vector=tab;
    }

    /*Bubble sort function*/

    /**
     * Cette fonction permet de trier un vecteur.
     */
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

    /*Sum this vector with another vector v2, if size is differnet an exception is thrown.*/

    /**
     * Cette méthode permet de sommer un vecteur avec un autre à condition qu'il soit de même taille.
     * @param v2 Le deuxième pour le sommer avec le premier.
     * @throws DifferentSizeException En cas ou les deux vecteurs n'ont pas la même taille.
     */
    public void sum(int[] v2) throws DifferentSizeException
    {
        if (this.size!=v2.length)
        {
            throw new DifferentSizeException();
        }
        else
        {
            for (int i=0;i<this.size;i++)
            {
                this.vector[i]+=v2[i];
            }
        }
    }

    /*Reverse the elements of the vector*/

    /**
     * Cette méthode permet d'inverser les éléments du vecteur.
     */
    public void reverseVector()
    {
        int tmpVec[]=new int[size];
        for (int i=0;i<size;i++)
        {
            tmpVec[size-1-i]=this.vector[i];
        }
        this.vector=tmpVec;
    }


    /*Prints the vector.*/

    /**
     * Cette méthode permet d'afficher les éléments du vecteur.
     */
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

    /**
     * Cette fontction permet multiplier tout les éléments du tableau par 2
     */
    public void formula()
    {
        for (int i=0; i<this.size;i++)
        {
            this.vector[i]*=2;
        }
    }

    /*Returns the vector.*/

    /*Permet de calculer le minimum et le max dans un tableau.*/

    /**
     * Cette fonction permet de calculer le Minimum et le maximum d'un vecteur.
     * @return Renvoie un vecteur de deux éléments, le premier est le min et le second est le max.
     */

    public int[] minMax()
    {
        int min=this.vector[0],max=this.vector[0];
        for (int i=0;i<this.vector.length;i++)
        {
            if (min>this.vector[i])
            {
                min=this.vector[i];
            }
            if (max<this.vector[i])
            {
                max=this.vector[i];
            }
        }
        int returnedValue[] = {min,max};
        return returnedValue;
    }

    /**
     * Cette méthode permet de renvoyer le vecteur.
     * @return Le vecteur associé à l'objet crée.
     */
    public int[] getVector(){
        return this.vector;
    }

    /*Returns the size.*/

    /**
     * Cette méthode permet de renvoyer la taille du tableau.
     * @return La taille du tableau associé à l'objet.
     */
    public int getSize() {
        return size;
    }
}
