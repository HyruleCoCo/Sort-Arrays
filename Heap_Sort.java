// this is based upon the tutorial made by geeks for geeks.org
// https://www.geeksforgeeks.org/heap-sort/

import javax.swing.JOptionPane;

public class Heap_Sort {
    public static void main(){
        // get the array size from the user
        int size = 0;
        while(size <= 0){
            size = Integer.parseInt(JOptionPane.showInputDialog("How big is the array you want to sort?"));

            if(size <= 0){
                JOptionPane.showMessageDialog(null, "Array size must be greater than 0");

            }
        }   

        // create a new array and populate each element with the users input
        double[] array = new double[size];
        
        for(int i = 0;i < size; i++){
            array[i] = Double.parseDouble(JOptionPane.showInputDialog("Please enter element " + (i + 1) + " for this array"));
        }

        // output the original array
        System.out.print("\n Original Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }

        // sort the array
        heapSort(array);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }

    static void heapSort(double[] array){
        int size = array.length;

        // build the heap(rearange the array)
        for(int i = size / 2 -1; i >= 0; i--){
            heapify(array, size, i);
        }

        // one by one extract an element from the heap
        for(int i = size - 1; i >= 0; i--){
            // move the current root to the end of the array
            double temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // to heapify a subtree rooted with node i which is an index in array[]
    static void heapify(double array[], int size, int i){
        
        // initialize largest as root
        int largest = i;
        
        // left index = 2*i + 1
        int l = 2 * i + 1;

        // right index = 2*i+2
        int r = 2 * i + 2;

        // if the left child is larger than the root
        if(l < size && array[l] > array[largest]){
            largest = l;
        }

        // if the right cvhild is larger than the current largest
        if(r < size && array[r] > array[largest]){
            largest = r;
        }

        // if largest is not the root
        if(largest != i){
            double temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // recursively heapify the affected sub-tree
            heapify(array, size, largest);
        }
    }
}
