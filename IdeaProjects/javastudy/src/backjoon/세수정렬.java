package backjoon;

import java.util.Scanner;

public class 세수정렬 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []array = new int[3];
        for(int i=0;i<3;i++){
            array[i] = sc.nextInt();
        }

        int index=0;
        int tmp;
        int min, i,j;
        for(i=0;i<3;i++){
            min =10000001;
          for(j=i;j<3;j++){
              if(min > array[j]){
                 min = array[j];
                 index = j;
              }
          }
           tmp = array[i];
          array[i] = array[index];
          array[index] = tmp;
        }

        for(int p:array){
            System.out.print(p+" ");
        }

    }

}

