package com.company;

class InsertionSort {

    public void sort(int [] array){
        int n = array.length;

        for(int i = 1; i < n; i++){
            //From second elements onward
            int key = array[i]; //Take the first element in remaining unsorted elements
            int j = i - 1;      //Previous element for comparison
            System.out.println("The key is " + key);
            System.out.println("Previous element j, " + j);

            //If array[j] is bigger than the key value, move array[j] back one position
            //Move elements of arr[0..i-1], that are greater than key to one position ahead of their current position
            while(j >=0 && array[j] > key){
                array[j+1] = array[j];
                System.out.println("Array[j+1] is now " + array[j+1]);

                j-=1; // Go down previous sorted
                System.out.println("J is now " + j);
            }

            //Insert value into correct positions
            array[j+1] = key;
            System.out.println("Array[j+1] is now " + array[j+1] + "\n");
        }
    }

    public void printArray(int [] array )
    {
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String [] args){
        System.out.println("Insertion Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        InsertionSort is = new InsertionSort();

        System.out.println("Before sorting");
        is.printArray(array);

        is.sort(array);

        System.out.println("\nSorted Array");
        is.printArray(array);
    }
}
