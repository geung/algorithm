package backjoon;

import java.util.Scanner;

public class 세수정렬 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []array = new int[3];
        for(int i=0;i<3;i++){
            array[i] = sc.nextInt();
        }
        int min = 9999;
        int index = 0;
        for(int i=0;i<array.length;i++){
          for(int j=i;j<array.length;j++){
              if(min > array[j]){
                 min = array[j];
                 index = j;
              }
          }
          int tmp = array[i];
          array[i] = array[index];
          array[index] = tmp;
        }

        for(int p:array){
            System.out.print(p+" ");
        }

    }

}

