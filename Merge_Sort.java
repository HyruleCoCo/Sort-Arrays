// this is coded based off of baeldung.coms coding tutorial
// https://www.baeldung.com/java-merge-sort

import javax.swing.JOptionPane;
public class Merge_Sort {
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
        mergeSort(array, array.length);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }

    static void mergeSort(double[] array, int size){
        // return statement to stop the recursion if there isnt enough variables
        if(size < 2){
            return;
        }
        // find the midpoint of the array
        int mid = size / 2;

        // create temperary arrays
        double[] l = new double[mid];
        double[] r = new double[size - mid];

        // assign both halves of the array to the temp arrays
        for(int i = 0; i < mid; i++){
            l[i] = array[i];
        }
        for(int i = mid; i < size; i++){
            r[i-mid] = array[i];
        }

        
        // recursivly split the 2 halves
        mergeSort(l, mid);
        mergeSort(r, size - mid);

        merge(array, l, r, mid, size-mid);
    }

    static void merge(double[] array, double[] l, double[] r, int left, int right){
        int i = 0, j = 0, k = 0;

        while(i < left && j < right){
            if(l[i] <= r[j]){
                array[k++] = l[i++];
            }
            else{
                array[k++] = r[j++];
            }
        }
        while(i < left){
            array[k++] = l[i++];
        }
        while(j < right){
            array[k++] = r[j++];
        }
    }
}

