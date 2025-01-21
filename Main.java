import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args){
        boolean confirm = false;
        int alg = 0;

        while(!confirm){
            alg = Integer.parseInt(JOptionPane.showInputDialog("What sorting algorithim do you want?\n 0: Selection Sort    1: Bubble Sort\n 2: Heap Sort    3: Insertion Sort\n 4: Quick Sort    5: Merge Sort\n 6: Shell Sort    7: Radix Sort\n 8: Count Sort    9: Bucket Sort\n 10: Tim Sort    11: Tree Sort\n 12: Cube Sort"));
             
            switch(alg){
                case 0 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Selection Sort\", is this correct?\n input true or false"));
                case 1 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Bubble Sort\", is this correct?\n input true or false"));
                case 2 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Heap Sort\", is this correct?\n input true or false"));
                case 3 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Insertion Sort\", is this correct?\n input true or false"));
                case 4 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Quick Sort\", is this correct?\n input true or false"));
                case 5 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Merge Sort\", is this correct?\n input true or false"));
                case 6 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Shell Sort\", is this correct?\n input true or false"));
                case 7 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Count Sort\", is this correct?\n input true or false"));
                case 8 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Radix Sort\", is this correct?\n input true or false"));
                case 9 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Bucket Sort\", is this correct?\n input true or false"));
                case 10 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Tim Sort\", is this correct?\n input true or false"));
                case 11 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Tree Sort\", is this correct?\n input true or false"));
                case 12 -> confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Cube Sort\", is this correct?\n input true or false"));
            }
        }

        switch(alg){
            case 0 -> Selection_Sort.main();
            case 1 -> Bubble_Sort.main();
            case 2 -> Heap_Sort.main();
            case 3 -> Insertion_Sort.main();
            case 4 -> Quick_Sort.main();
            case 5 -> Merge_Sort.main();
            case 6 -> Shell_Sort.main();
            case 7 -> Count_Sort.main();
            case 8 -> {// radix sort
            }
            case 9 -> {// Bucket sort
            }
            case 10 -> {// tim sort
            }
            case 11 -> {// tree sort
            }
            case 12 -> {// cube sort
            }
        }
    }
}