package algorithm;

import java.io.*;
import java.util.*;

public class quickSort {

    public static void main(String[] args){

        int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quicksort(array,0, array.length-1);

        for (int i : array) {
            System.out.printf("%d ",i);
        }
    }

    public static void quicksort(int array[], int start, int end){

        int pivot = start;
        int left = start+1;
        int right = end;

        if(start >= end){
            return;
        }


        while(left<=right){
            while(left<=end && array[left]<=array[pivot]){
                left++;
            }
            while(right>start && array[right]>=array[pivot]){
                right --;
            }
            if(left > right){
                int tmp = array[right];
                array[right] = array[pivot];
                array[pivot] = tmp;
            }else{
                int tmp =array[right];
                array[right] = array[left];
                array[left] = tmp;
            }
            quicksort(array,start,right-1);
            quicksort(array,right+1,end);
        }


    }

}
