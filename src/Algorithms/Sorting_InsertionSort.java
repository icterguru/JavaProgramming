package Algorithms;



public class Sorting_InsertionSort {
 
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        System.out.println("The unsorted array is: ");
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.println("\nAfter applying the InsertionSort method: ");
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}

//- See more at: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/#sthash.104Wp8m0.dpuf