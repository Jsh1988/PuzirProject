package Main;

import Puzir.Puzir;

public class Main {
    public static void main(String[] args){
        int []arr = new int[10];
        //Input date Входные данные
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.round(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        Puzir puzir = new Puzir(arr);
        arr = puzir.bubbleSort();
        //Output date Выходные данные
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
