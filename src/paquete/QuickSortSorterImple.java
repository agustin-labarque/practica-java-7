package paquete;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {

        System.out.println("usando quick sort");

        int izq = 0;
        int der = arr.length -1;

        quicksort(arr, c, izq, der);


    }

    private void quicksort(T[] arr, Comparator<T> c, int izq, int der){
        T pivote=arr[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        T aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(c.compare(arr[i], pivote) <= 0  && i < j) i++; // busca elemento mayor que pivote
            while(c.compare(arr[j], pivote) > 0) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= arr[i];                      // los intercambia
                arr[i]=arr[j];
                arr[j]=aux;
            }
        }

        arr[izq]=arr[j];      // se coloca el pivote en su lugar de forma que tendremos
        arr[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(arr,c,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(arr,c,j+1,der);
    }
}
