package paquete;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        sortStringArray();

        sortIntegerArray();
    }

    private static void sortStringArray() {

        String[] palabras = new String[]{
                "hola",
                "como",
                "te",
                "va",
                "mucho",
                "gusto",
                "que",
                "tengas",
                "un",
                "buen",
                "dia"
        };


        Comparator<String> cs = (s1,s2) -> s1.compareTo(s2);

        Sorter<String> ss = MiFactory.getSorter();

        Time t1 = new Time();

        System.out.println("iniciando sort");
        t1.start();
        ss.sort(palabras, cs);
        t1.stop();
        System.out.println("fin del sort, el tiempo tardado (en ms) fue: "+ t1.elapsedTime());

        printArray(palabras);
    }

    private static void sortIntegerArray() {

        int limit = 100000;

        Integer[] a = new Integer[limit];

        Random rand = new Random();

        for(int i = 0; i < limit; i++)
        {
            a[i] = rand.nextInt(limit);
        }

        Comparator<Integer> ci = (x,y)->x-y;

        Sorter<Integer> si = MiFactory.getSorter();

        Time t2 = new Time();

        System.out.println("iniciando sort");
        t2.start();
        si.sort(a, ci);
        t2.stop();
        System.out.println("fin del sort, el tiempo tardado (en ms) fue: "+ t2.elapsedTime());

        printArray(a);
    }

    public static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }

}
