// this is coded based on the tutorial from baeldung.com
// www.baeldung.com/java-shell-sort

import javax.swing.JOptionPane;

public class Shell_Sort {
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
        sort(array);

        // output the sorted array
        System.out.print("\n Sorted Array: " + array[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + array[i]);
        }
    }

    static void sort(double[] array){
        int size = array.length;

        for(int gap = size / 2; gap > 0; gap /=2){
            for(int i = gap; i < size; i++){
                double key = array[i];
                int j = i;
                while(j >= gap && array[j-gap] > key){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }
}
