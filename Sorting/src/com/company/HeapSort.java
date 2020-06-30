package com.company;

class HeapSort {

    //To heapify a subtree rooted with node i which is an index in array []. N is size of heap
    private void heapify(int [] array, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //If left child is larger than the root
        //Check if array is out of bounds
        if(left < n && array[left] > array[largest]){
            largest = left;
        }

        //If right child is largest than largest
        if(right < n && array[right] > array[largest]){
            largest = right;
        }

        //If largest is not the root
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            //Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }

    public void sort(int [] array){
        int n =  array.length;

        //Build Heap
        //Divide by 2 to determine level
        for(int i = n / 2; i >= 0; i--){
            heapify(array, n, i);
        }

        System.out.println("Array after creating first heap");
        printArray(array);
        System.out.println();

        //Extract element one by one from heap
        //Decrement as we remove last node from the array
        for(int i = n - 1; i >= 0; i--){

            //Move current root to the end
            //Swap first and last element.
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            System.out.println("After swapping largest and last node");
            printArray(array);

            System.out.println("After reheaping to new heap");;
            //Call heapify on the reduce heap
            heapify(array, i, 0);
            printArray(array);
            System.out.println();
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
        System.out.println("Heap Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        HeapSort hs = new HeapSort();

        System.out.println("Before sorting");
        hs.printArray(array);

        hs.sort(array);

        System.out.println("\nSorted Array");
        hs.printArray(array);
    }

}
