package Puzir;

public class Puzir {
    private int []arr;

    public Puzir(int []arr){
        this.arr = arr;
    }
    private void swap(int []arr, int index){
        int temp = arr[index-1];
        arr[index-1] = arr[index];
        arr[index] = temp;
    }
    public int []bubbleSort(){
        int []resArr = arr;
        for(int i = 1; i < resArr.length; i++){
            for(int j = resArr.length-1; j >= i; j--){
                if(resArr[j-1] > resArr[j]) swap(resArr,j);
            }
        }
        return resArr;
    }
}
