import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args){
        boolean confirm = false;
        int alg = 0;

        while(!confirm){
            alg = Integer.parseInt(JOptionPane.showInputDialog("What sorting algorithim do you want?\n 0: Selection Sort\n 1: Bubble Sort\n 2: Heap Sort"));
             
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
        }

    }
}