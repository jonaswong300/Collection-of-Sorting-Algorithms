package com.company;

class SelectionSort {

    public void sort(int [] array){
        int n = array.length;

        int minimumIndex;

        for(int i = 0; i < n; i++){
            minimumIndex = i;

            for(int j = i + 1; j < n; j++){
                if(array[j] < array[minimumIndex]){
                    minimumIndex = j;
                    System.out.println("Minimum Index is now, " + minimumIndex + " with a value of " + array[minimumIndex]);
                }
            }
            System.out.println("Swapping array[minimumIndex]," + array[minimumIndex] + " with array[i]," + array[i] + "\n");

            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;


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
        System.out.println("Selection Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        SelectionSort ss = new SelectionSort();

        System.out.println("Before sorting");
        ss.printArray(array);

        ss.sort(array);

        System.out.println("\nSorted Array");
        ss.printArray(array);
    }
}
