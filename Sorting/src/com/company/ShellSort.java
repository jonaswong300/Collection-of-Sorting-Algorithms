package com.company;

class ShellSort {
    public void sort(int [] array){
        int n = array.length;

        //Start with a big gap, then reduce the gap per iteration
        for(int gap = n/2; gap > 0; gap /=2){
            System.out.println("The gap is now " + gap);
            //Do a gapped insertion sort for this gap size
            //The first gap element array[0..gap-1] are already in gapped order, keep adding one more element until the entire array is gap sorted
            for(int i = gap; i < n; i++){
                int temp = array[i];
                System.out.println("Temp is now " + temp);

                //Shift earlier gap sorted elements up till correct location for array[i] is found
                int j;
                for(j = i; j >= gap && array[j-gap] > temp; j -= gap){
                    System.out.println("J is now " + j + " of array[j] " + array[j]);
                    System.out.println("Assign array[j - gap], " + array[j - gap] + " to array[j - gap]," + array[j]);
                    array[j] = array[j - gap];
                }

                //Put temp, original array[i] to its correction location
                System.out.println("Assign array[i], " + temp + " to array[j]," + array[j]);
                array[j] = temp;
                System.out.println("Array is now");
                for(int num : array){
                    System.out.print(num + " ");
                }
                System.out.println("\n");
            }
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
        System.out.println("Shell Sort\n---------------------------------------");
        int [] array = {64, 34, 25, 12, 22, 11, 90, 88, 2, 43};
        ShellSort shs = new ShellSort();

        System.out.println("Before sorting");
        shs.printArray(array);

        shs.sort(array);

        System.out.println("\nSorted Array");
        shs.printArray(array);
    }

}
