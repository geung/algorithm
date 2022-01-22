package algorithm;
import java.io.*;
import java.util.*;

public class insertionSort {

    public static void main(String []args) throws IOException{
        int i, j, temp;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int []array = {1,10,5,8,7,6,4,3,2,9};

        for(i=1; i<10; i++){
            temp = array[i];
            j = i-1;
            while(temp<array[j] && j>=0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        for(int p: array){
            bw.write(p+" ");
        }
        bw.flush();
        bw.close();



    }

}
