package Algorithms;



public class Sorting_SelectionSort {
 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {10,34,2,56,7,67,88,42};

        System.out.println("The unsorted array is: ");
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.println("\nAfter applying the Sort method: ");

        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
//- See more at: http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.4CtcwSNM.dpuf