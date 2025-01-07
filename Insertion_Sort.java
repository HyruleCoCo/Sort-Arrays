// this is based upon the tutorial made by geeksforgeeks.org
// https://www.geeksforgeeks.org/insertion-sort-algorithm/

import javax.swing.JOptionPane;
public class Insertion_Sort {
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
        insertionSort(array);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }
    
    static void insertionSort(double array[]){
        int size = array.length;
        int count = 1;

        for(int i = 1; i < size; i++){
            double key = array[i];
            int j = i - 1;

            // Move elements of array[] that are greater than key to one position ahead of their current position
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            System.out.print("\n Iteration " + count + ": " + array[0]);
            for(int n = 1; n < size; n ++){
                System.out.print(", " + array[n]);
            }
            count++;

            array[j+1] = key;
        }
    }
}
