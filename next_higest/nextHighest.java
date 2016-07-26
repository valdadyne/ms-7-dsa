// Given a number, find the next higher number using only the digits in the given number. 
//For example if the given number is 1508, the next higher number with same digits is 8510.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestno;


/**
 *
 * @author valdadyne
 */
public class HighestNo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int intArray[] = new int[]{1,2,3,4,5};
        bubbleSort(intArray);
        for(int i=0; i < intArray.length; i++){
        System.out.print(intArray[i] + " ");
    }
}
 private static void bubbleSort(int[] intArray) {
     int n = intArray.length;
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(intArray[j-1] < intArray[j]){
                                        //swap the elements!
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                               
                        }
                }

 }}
