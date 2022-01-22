package algorithm;
import java.io.*;
public class bubbleSort {

    public static void main(String []args) throws IOException{

        int i, j, temp, index;
        int []array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int p:array){
            bw.write(p+" ");
        }
        bw.flush();
        bw.close();


    }


}
