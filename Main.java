import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args){
        boolean confirm = false;
        int alg = 0;

        while(!confirm){
            alg = Integer.parseInt(JOptionPane.showInputDialog("What sorting algorithim do you want?\n 0: Selection Sort    1: Bubble Sort\n 2: Heap Sort    3: Insertion Sort\n 4: Quick Sort    5: Merge Sort\n 6: Bucket Sort    7: Radix Sort\n 8: Count Sort    9: Shell Sort\n 10: Tim Sort    11: Tree Sort\n 12: Cube Sort"));
             
            switch(alg){
                case 0:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Selection Sort\", is this correct?\n input true or false"));
                    break;
                case 1:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Bubble Sort\", is this correct?\n input true or false"));
                    break;
                case 2:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Heap Sort\", is this correct?\n input true or false"));
                    break;
                case 3:
                confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Insertion Sort\", is this correct?\n input true or false"));
                break;
                case 4:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Quick Sort\", is this correct?\n input true or false"));
                    break;
                case 5:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Merge Sort\", is this correct?\n input true or false"));
                    break;
                case 6:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Bucket Sort\", is this correct?\n input true or false"));
                    break;
                case 7:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Radix Sort\", is this correct?\n input true or false"));
                    break;
                case 8:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Count Sort\", is this correct?\n input true or false"));
                    break;
                case 9:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Shell Sort\", is this correct?\n input true or false"));
                    break;
                case 10:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Tim Sort\", is this correct?\n input true or false"));
                    break;
                case 11:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Tree Sort\", is this correct?\n input true or false"));
                    break;
                case 12:
                    confirm = Boolean.parseBoolean(JOptionPane.showInputDialog("You have selected \"Cube Sort\", is this correct?\n input true or false"));
                    break;
            }
        }

        switch(alg){
            case 0:
                Selection_Sort.main();
                break;
            case 1:
                Bubble_Sort.main();
                break;
            case 2:
                Heap_Sort.main();
                break;
            case 3:
                Insertion_Sort.main();
                break;
            case 4:
                Quick_Sort.main();
                break;
            case 5:
                // Merge Sort
                break;
            case 6:
                // Bucket Sort
                break;
            case 7:
                // Radix Sort
                break;
            case 8:
                // Count Sort
                break;
            case 9:
                // Shell Sort
                break;
            case 10:
                // Tim Sort
                break;
            case 11:
                // Tree Sort
                break;
            case 12:
                // Cube Sort
        }

    }
}