// this is based upon the tutorial made by geeks for geeks.org
// https://www.geeksforgeeks.org/selection-sort-algorithm-2/
import javax.swing.JOptionPane;

public class Selection_Sort {
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
        selectionSort(array);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }

    static void selectionSort(double[] array){
        int size = array.length;
        int count = 1;
        for(int i = 0; i < size - 1; i++){

            // assume current position is the minimum element
            int minIndex = i;

            // iterate through the unsorted portion to find the actual minimum
            for(int j = i+1; j < size; j++){
                if(array[j] < array[minIndex]){
                    // update minIndex if a smaller element is found
                    minIndex = j;
                }
            }
            
            // move the minimum element to its correct position
            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            // print the changes in each iteration
            System.out.print("\n Iteration " + count + ": " + array[0]);
            for(int n = 1; n < array.length; n++){
                System.out.print(", " + array[n]);
            }
            count++;
        }

    }
}
