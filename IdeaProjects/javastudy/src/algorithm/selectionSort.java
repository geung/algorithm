package algorithm;
import java.io.*;


public class selectionSort {
    public static void main(String []args) throws IOException {
        int i, j, min, index, temp;
        int [] array = {1,10, 3, 4, 6, 8, 7, 5 , 2, 9};
        index = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(i=0;i<10;i++){
            min = 999;
            for(j=i;j<10;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }

            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;

        }

        for(int p : array){
            bw.write(p+"     ");
        }
    bw.flush();
        bw.close();
    }



}
