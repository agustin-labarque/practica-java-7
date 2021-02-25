package paquete;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {

        System.out.println("usando bubble sort");

        for(int i= arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(c.compare(arr[i], arr[j])<0){
                    T tAux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tAux;
                }
            }
        }
    }
}
