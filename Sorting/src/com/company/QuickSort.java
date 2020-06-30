package com.company;

class QuickSort {

    //4 ways to pick pivot
    //1. First element
    //2. Second element(Implemented)
    //3. Random element
    //4. Median element
    //Places correct elements at the correct position, all smaller than pivot on the left and all greater elements to the right
    int partition(int [] array, int low, int high){
        //Element to be at the correct position
        int pivot = array[high];
        System.out.println("Pivot is now " + pivot + ", index " + high);

        //Index of smaller element
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){
            //If current element is smaller or equal than pivot
            if(array[j] <= pivot){
                i++; //Increment index of smaller element
                System.out.println("J is index " + j + ", i is index "+ i);
                System.out.println("Since array[j] is less than pivot, swapping element array[i] " +
                                   array[i] + " with " +"array[j] " + array[j]);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //Place pivot in the correct position
        System.out.println("Swapping array[i + 1], " + array[i+1] + " with array[high], " + array[high]);
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        printArray(array);
        return (i + 1);
    }

    //Array [] --> array to be sorted
    //Low  --> Starting index
    //High --> End index
    public void sort(int [] array, int low, int high){
        int n =  array.length;

        if(low < high){
            int pivot = partition(array, low, high);
            System.out.println();
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }

    }
    public void printArray(int [] array)
    {
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String [] args){
        System.out.println("Quick Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        QuickSort qs = new QuickSort();

        System.out.println("Before sorting");
        qs.printArray(array);

        qs.sort(array, 0 , array.length-1);

        System.out.println("\nSorted Array");
        qs.printArray(array);
    }


}
