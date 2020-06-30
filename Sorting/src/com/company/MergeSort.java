package com.company;

class MergeSort {

    //Merge two sub arrays of array []
    //First sub array array[left .... middle]
    //Second sub array array[middle + 1 .... right]
    public void merge(int [] array, int left, int middle, int right){

        //Find the size of the two sub array to be merge
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //Create two temporary arrays
        int [] L = new int[n1];
        int [] R = new int[n2];

        //Copy data to temp arrays
        for(int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for(int j = 0; j < n2; j++)
            R[j] = array[middle + 1 + j];

        //Merge temp arrays
        //Initial index of first and second subarrays
        int i = 0, j = 0;

        //Intial index of merged subarray
        int k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of L[] if any
        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }

        //Copy remaining elements of R[] if any
        while(j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int [] array, int left, int right){

        if(left < right){
            //Find middle point
            int middle = (left + right) / 2;

            //Sort first and second halves
            System.out.println("Sorting first half");
            sort(array, left, middle);
            printArray(array);

            System.out.println("Sorting second half");
            sort(array, middle + 1, right);
            printArray(array);

            //Merge sorted halves
            System.out.println("Merging two halves");
            merge(array, left, middle, right);
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
        System.out.println("Merge Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        MergeSort ms = new MergeSort();

        System.out.println("Before sorting");
        ms.printArray(array);

        ms.sort(array, 0, array.length-1);

        System.out.println("\nSorted Array");
        ms.printArray(array);
    }
}
