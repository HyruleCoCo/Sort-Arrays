// this is based upon the tutorial made by geeks for geeks.org
// https://www.geeksforgeeks.org/bubble-sort-algorithm/
import javax.swing.JOptionPane;

public class Bubble_Sort {
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
        bubbleSort(array);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }

    static void bubbleSort(double[] array){
        int i, j, size = array.length; // create variables so they will be global
        double temp;
        boolean swapped;
        int count = 1;

        for(i = 0; i < size - 1; i++){
            swapped = false;

            for(j = 0; j < size - i - 1; j++){
                
                if(array[j] > array[j + 1]){
                    // swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            
            // if no elements were swapped by the inner loop the array is sorted
            if(!swapped){
                break;
            }

            // print the changes in each iteration
            System.out.print("\n Iteration " + count + ": " + array[0]);
            for(int n = 1; n < array.length; n++){
                System.out.print(", " + array[n]);
            }
            count++;
        }
    }
}
