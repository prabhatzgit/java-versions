package jdk7.string;

public class Sample {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,2,2,1,0};
        //int[] array = {1,0,2};
        // sort this array
        int temp = 0;
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
