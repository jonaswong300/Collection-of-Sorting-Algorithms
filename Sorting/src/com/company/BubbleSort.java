package com.company;

class BubbleSort {

    public void sort(int [] array){
        int n = array.length;
        boolean swapped;

        for(int i = 0; i < n; i++){
            swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(array[j] > array[j + 1]){
                    System.out.println("Swapping array[j]," + array[j] + " with array[j + 1]," + array[j + 1]);

                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            if(!swapped)
                break;
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
        System.out.println("Bubble Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        BubbleSort bs = new BubbleSort();

        System.out.println("Before sorting");
        bs.printArray(array);

        bs.sort(array);

        System.out.println("\nSorted Array");
        bs.printArray(array);
    }
}
